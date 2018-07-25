FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/myweb-0.0.1-SNAPSHOT.jar myweb.jar
EXPOSE 9000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myweb.jar"]