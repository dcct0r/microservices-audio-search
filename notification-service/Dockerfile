FROM eclipse-temurin:17-jre-alpine
ARG JAR_FILE=target/notification-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} notification.jar
ENTRYPOINT ["java", "-jar", "notification.jar"]
EXPOSE 8081