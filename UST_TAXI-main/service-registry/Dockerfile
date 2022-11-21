FROM openjdk:11
ADD target/service-registry.jar service-registry.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-registry.jar"]