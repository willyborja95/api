FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=out/artifacts/api_jar *.jar
COPY ${JAR_FILE} /api.jar
ENTRYPOINT ["java","-jar","/api.jar"]