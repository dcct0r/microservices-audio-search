FROM eclipse-temurin:17-jre-alpine
ARG JAR_FILE=target/search-audio-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} search.jar
ENTRYPOINT ["java", "-jar", "search.jar"]
EXPOSE 8082