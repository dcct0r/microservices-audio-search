FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY target/*.jar eureka.jar
ENTRYPOINT ["java", "-jar", "/eureka.jar"]
EXPOSE 8761