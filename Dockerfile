# ----------------------------------------
# STAGE 1: Build Spring Boot App
# ----------------------------------------
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy full project into container
COPY . .

# Build JAR file
RUN mvn clean package -DskipTests

# ----------------------------------------
# STAGE 2: Run Application
# ----------------------------------------
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy generated JAR from build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]
