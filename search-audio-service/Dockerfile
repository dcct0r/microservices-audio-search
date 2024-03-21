FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY target/search-audio-service-0.0.1-SNAPSHOT-exec.jar search.jar
ENTRYPOINT ["java", "-jar", "search.jar"]
EXPOSE 8082