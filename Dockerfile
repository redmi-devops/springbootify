FROM openjdk:12-jdk-alpine
COPY springbootify.war /app.war
ENTRYPOINT ["java","-jar","/app.war"]