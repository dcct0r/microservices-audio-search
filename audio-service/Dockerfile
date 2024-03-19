FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY target/*.jar audio.jar
ENTRYPOINT ["java", "-jar", "/audio.jar"]
EXPOSE 8083