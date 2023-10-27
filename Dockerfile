FROM openjdk:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/joss-0.0.1-SNAPSHOT-standalone.jar /joss/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/joss/app.jar"]
