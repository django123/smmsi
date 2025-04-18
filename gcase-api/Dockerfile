FROM alpine/java:17-jdk

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} gcase-api-1.0.0-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar", "gcase-api-1.0.0-SNAPSHOT.jar" ]