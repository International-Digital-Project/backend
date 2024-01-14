FROM maven:3.6.2-jdk-11 AS build

WORKDIR /app
COPY ../.. /app
RUN mvn clean install


FROM adoptopenjdk:11-jdk
WORKDIR /app
COPY --from=build /app/target/planning-flowcontrol-1.0-SNAPSHOT.jar .
CMD ["java", "-jar", "planning-flowcontrol-1.0-SNAPSHOT.jar"]