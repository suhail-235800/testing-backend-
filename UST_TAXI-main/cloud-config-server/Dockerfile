FROM hyness/spring-cloud-config-server
ADD target/cloud-config-server.jar cloud-config-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cloud-config-server.jar"]