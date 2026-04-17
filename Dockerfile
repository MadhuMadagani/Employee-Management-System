# -------------------------------
# 1. Base Image
# -------------------------------
# We are using OpenJDK 17 as the base environment
# This provides Java runtime to run Spring Boot application

FROM openjdk:17-jdk-slim

# -------------------------------
# 2. Set Working Directory
# -------------------------------
# All commands inside container will run from /app folder

WORKDIR /app

# -------------------------------
# 3. Copy Maven Build Output (JAR file)
# -------------------------------
# After running "mvn clean package", Spring Boot creates a JAR file inside /target
# We copy that JAR file into Docker container and rename it as app.jar

COPY target/*.jar app.jar

# -------------------------------
# 4. Expose Application Port
# -------------------------------
# Spring Boot runs on port 8080 by default
# This tells Docker that container listens on port 8080

EXPOSE 8080

# -------------------------------
# 5. Run the Application
# -------------------------------
# This is the command that runs when container starts
# It executes the Spring Boot JAR file

ENTRYPOINT ["java", "-jar", "app.jar"]
