FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /workspace/myweb/target/myweb-0.0.1-SNAPSHOT.jar myweb.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myweb.jar"]s