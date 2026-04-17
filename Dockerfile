# ----------------------------------------
# 1. Base Image (Java 17 Runtime)
# ----------------------------------------
# Using Eclipse Temurin official image (recommended instead of OpenJDK)
# It provides Java runtime needed to run Spring Boot application

FROM eclipse-temurin:17-jdk

# ----------------------------------------
# 2. Set Working Directory inside container
# ----------------------------------------
# All application files will live inside /app folder

WORKDIR /app

# ----------------------------------------
# 3. Copy JAR file into container
# ----------------------------------------
# After "mvn clean package", Spring Boot creates a JAR file inside /target
# We copy that JAR into container and rename it as app.jar

COPY target/*.jar app.jar

# ----------------------------------------
# 4. Expose Application Port
# ----------------------------------------
# Your Spring Boot application runs on port 8081 locally
# This tells Docker that container listens on 8081

EXPOSE 8081

# ----------------------------------------
# 5. Run the Application
# ----------------------------------------
# This command runs when the container starts
# It executes the Spring Boot JAR file

ENTRYPOINT ["java", "-jar", "app.jar"]
