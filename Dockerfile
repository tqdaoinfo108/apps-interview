FROM openjdk:11.0.11-jre

VOLUME /tmp

ENV DATABASE_HOST=host.docker.internal
ENV DATABASE_PORT=5432  
ENV DATABASE_NAME=interview
ENV DATABASE_USERNAME=root
ENV DATABASE_PASSWORD=1234

ADD target/interviewapp-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT exec java -jar app.jar