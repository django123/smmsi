# Multi-stage build for gcase module

# Build stage
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the project files
COPY pom.xml .
COPY gcase-api/pom.xml gcase-api/
COPY gcase-common/pom.xml gcase-common/
COPY gcase-domain/pom.xml gcase-domain/
COPY gcase-kafka/pom.xml gcase-kafka/
COPY gcase-persistence/pom.xml gcase-persistence/
COPY gcase-service/pom.xml gcase-service/
COPY gcase-coverage/pom.xml gcase-coverage/

# Download all dependencies
RUN mvn dependency:go-offline -B

# Copy the source code
COPY gcase-api/src gcase-api/src/
COPY gcase-common/src gcase-common/src/
COPY gcase-domain/src gcase-domain/src/
COPY gcase-kafka/src gcase-kafka/src/
COPY gcase-persistence/src gcase-persistence/src/
COPY gcase-service/src gcase-service/src/

# Build the application
RUN mvn clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy the built artifact from the build stage
COPY --from=build /app/gcase-api/target/gcase-api-*.jar app.jar

# Environment variables with default values that can be overridden
ENV SERVER_PORT=8087 \
    KAFKA_BOOTSTRAP_SERVERS=localhost:9092 \
    KAFKA_CONSUMER_GROUP_ID=gcase-group \
    KAFKA_TOPIC_PRECOMP=merchant-remittance \
    KAFKA_TOPIC_TRACABILITY=event-tracability \
    SID_API_URL=https://sid.example.com/creditcom/v1 \
    SID_API_TOKEN=default-token-for-dev \
    CACHE_EVENT_EXPIRATION=60 \
    CACHE_EVENT_CLEANUP_INTERVAL=15

# Expose the application port
EXPOSE ${SERVER_PORT}

# Set the entry point
ENTRYPOINT ["java", \
            "-Dserver.port=${SERVER_PORT}", \
            "-Dspring.kafka.bootstrap-servers=${KAFKA_BOOTSTRAP_SERVERS}", \
            "-Dspring.kafka.consumer.group-id=${KAFKA_CONSUMER_GROUP_ID}", \
            "-Dkafka.topic.precomp=${KAFKA_TOPIC_PRECOMP}", \
            "-Dkafka.topic.tracability=${KAFKA_TOPIC_TRACABILITY}", \
            "-Dsid.api.url=${SID_API_URL}", \
            "-Dsid.api.token=${SID_API_TOKEN}", \
            "-Dcache.event.expiration=${CACHE_EVENT_EXPIRATION}", \
            "-Dcache.event.cleanup-interval=${CACHE_EVENT_CLEANUP_INTERVAL}", \
            "-jar", "/app/app.jar"]

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=30s --retries=3 \
  CMD wget -q --spider http://localhost:${SERVER_PORT}/actuator/health || exit 1