FROM openjdk:11
ADD target/hystrix-dashboard.jar hystrix-dashboard.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hystrix-dashboard.jar"]