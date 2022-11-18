FROM openjdk:11
EXPOSE 8080
ADD target/passenger.jar passenger.jar
ENTRYPOINT ["java","-jar","/passenger.jar"]