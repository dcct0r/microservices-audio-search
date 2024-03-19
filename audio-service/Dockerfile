FROM eclipse-temurin:17-jre-alpine
ARG JAR_FILE=target/audio-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} audio.jar
ENTRYPOINT ["java", "-jar", "audio.jar"]
EXPOSE 8083