FROM maven:3.5-jdk-8-alpine AS builder

WORKDIR /build
COPY . /build

RUN mvn clean package

FROM openjdk:9
COPY --from=builder /build/target/*.jar /app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar", "-Ddebug", "-Xmx128m"]