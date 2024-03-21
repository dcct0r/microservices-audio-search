FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY target/audio-service-0.0.1-SNAPSHOT-exec.jar audio.jar
ENTRYPOINT ["java", "-jar", "audio.jar"]
EXPOSE 8083