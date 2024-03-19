FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY target/*.jar notification.jar
ENTRYPOINT ["java", "-jar", "/notification.jar"]
EXPOSE 8081