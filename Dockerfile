# Multi-stage build for a Java application

# Stage 1: Build the application using Maven
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create a minimal image to run the application
FROM openjdk:17.0.1-jdk-slim

# Copy the JAR file from the build stage
COPY --from=build /target/taco-0.0.1-SNAPSHOT.jar app.jar

# Expose the application's port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]