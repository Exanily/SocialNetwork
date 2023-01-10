FROM openjdk:8u121-jre-alpine
MAINTAINER Group28

ARG JAR_FILE=impl/target/impl-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} backend.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/backend.jar"]
