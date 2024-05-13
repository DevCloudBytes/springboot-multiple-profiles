# Use a slim Java 11 base image
FROM openjdk:11-slim

# Define a build argument for the JAR file location (optional)
ARG JAR_FILE=target/*.jar

# Copy the JAR file to the image (adjust path if needed)
COPY ${JAR_FILE} app.jar

# Expose the port your Spring Boot application uses (typically 8080)
EXPOSE 8080

# Set the command to execute the JAR on startup
ENTRYPOINT ["java", "-jar", "app.jar"]