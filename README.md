# GCASE Module

GCASE (GrossCreditAndSchemeFeesEvent) is a Spring Boot application that processes events from Kafka and publishes them to an external API.

## Docker Setup

This project includes a Dockerfile that allows you to build and run the application in a containerized environment.

### Building the Docker Image

To build the Docker image, navigate to the root directory of the project and run:

```bash
docker build -t gcase:latest -f gcase/Dockerfile .
```

### Running the Docker Container

To run the Docker container with default settings:

```bash
docker run -p 8087:8087 gcase:latest
```

### Environment Variables

The Docker image supports the following environment variables that can be overridden at runtime:

| Variable | Description | Default Value |
|----------|-------------|---------------|
| SERVER_PORT | The port on which the application runs | 8087 |
| KAFKA_BOOTSTRAP_SERVERS | Kafka bootstrap servers | localhost:9092 |
| KAFKA_CONSUMER_GROUP_ID | Kafka consumer group ID | gcase-group |
| KAFKA_TOPIC_PRECOMP | Kafka topic for precomp events | merchant-remittance |
| KAFKA_TOPIC_TRACABILITY | Kafka topic for tracability events | event-tracability |
| SID_API_URL | URL of the SID API | https://sid.example.com/creditcom/v1 |
| SID_API_TOKEN | Authentication token for the SID API | default-token-for-dev |
| CACHE_EVENT_EXPIRATION | Expiration time for cached events in minutes | 60 |
| CACHE_EVENT_CLEANUP_INTERVAL | Interval for cleaning up expired events in minutes | 15 |

Example of running the container with custom environment variables:

```bash
docker run -p 8087:8087 \
  -e KAFKA_BOOTSTRAP_SERVERS=kafka:9092 \
  -e SID_API_URL=https://production-sid.example.com/creditcom/v1 \
  -e SID_API_TOKEN=production-token \
  gcase:latest
```

### Health Check

The Docker container includes a health check that verifies the application is running correctly by checking the Spring Boot Actuator health endpoint. The health check runs every 30 seconds.

## Application Overview

The GCASE application:

1. Consumes events from two Kafka topics:
   - Precomp events from the `merchant-remittance` topic
   - Tracability events from the `event-tracability` topic

2. Processes and correlates these events

3. Publishes enriched events to the SID API

## Development

For development purposes, you can run the application locally using Maven:

```bash
cd gcase
mvn clean install
cd gcase-api
mvn spring-boot:run
```

This will start the application with the configuration specified in `application.yml`.