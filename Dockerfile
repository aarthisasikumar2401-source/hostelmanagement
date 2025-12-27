# Use Maven with Java 17
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy project files
COPY . .

# Build the application (no mvnw)
RUN mvn clean package -DskipTests

# ---- Runtime image ----
FROM eclipse-temurin:17-jdk
