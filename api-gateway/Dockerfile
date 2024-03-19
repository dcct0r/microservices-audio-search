FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY target/*.jar gateway.jar
ENTRYPOINT ["java", "-jar", "/gateway.jar"]
EXPOSE 8088