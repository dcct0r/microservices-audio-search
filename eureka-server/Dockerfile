FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY target/eureka-server-0.0.1-SNAPSHOT-exec.jar eureka.jar
ENTRYPOINT ["java", "-jar", "eureka.jar"]
EXPOSE 8761