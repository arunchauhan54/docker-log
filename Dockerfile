FROM openjdk:8-jre-alpine
EXPOSE 8080
RUN mkdir -p /app/
VOLUME /tmp
ADD  spring-docker-0.0.1-SNAPSHOT.jar /app/out.jar
ENTRYPOINT ["java", "-jar", "/app/out.jar"]