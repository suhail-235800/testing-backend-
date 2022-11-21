FROM openjdk:11
ADD target/cloud-config-server.jar cloud-config-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cloud-config-server.jar"]