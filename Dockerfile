FROM maven:3.5.2-jdk-9 AS build

COPY src ./src
COPY pom.xml ./

RUN mvn -B clean package

FROM openjdk:9
COPY --from=build /target/*.jar /app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]