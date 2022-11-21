FROM openjdk:11
ADD target/cloud-gateway.jar cloud-gateway.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cloud-gateway.jar"]