FROM frolvlad/alpine-oraclejdk8:slim
ADD target/service-registry.jar service-registry.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-registry.jar"]