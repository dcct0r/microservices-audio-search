FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY target/api-gateway-0.0.1-SNAPSHOT-exec.jar gateway.jar
ENTRYPOINT ["java", "-jar", "gateway.jar"]
EXPOSE 8088