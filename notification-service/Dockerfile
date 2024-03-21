FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY target/notification-service-0.0.1-SNAPSHOT-exec.jar notification.jar
ENTRYPOINT ["java", "-jar", "notification.jar"]
EXPOSE 8081