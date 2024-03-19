FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY target/*.jar search.jar
ENTRYPOINT ["java", "-jar", "/search.jar"]
EXPOSE 8082