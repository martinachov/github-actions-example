FROM openjdk:11-jre-slim-buster

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} github-actions-app.jar

ENTRYPOINT ["java","-jar","/github-actions-app.jar"]