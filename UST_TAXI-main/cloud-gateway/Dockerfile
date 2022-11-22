FROM barathece91/gateway-service-k8s
ADD target/cloud-gateway.jar cloud-gateway.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cloud-gateway.jar"]