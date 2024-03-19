FROM eclipse-temurin:17-jre-alpine
ARG JAR_FILE=target/eureka-server-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} eureka.jar
ENTRYPOINT ["java", "-jar", "eureka.jar"]
EXPOSE 8761