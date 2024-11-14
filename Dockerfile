FROM maven:3.8.5-jdk-11 AS build
WORKDIR /app
COPY . .
RUN mvn package

FROM openjdk:11
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

ARG EUREKA_SERVER=localhost

ENTRYPOINT ["java", "-jar", "app.jar"]