FROM openjdk:11
EXPOSE 8080
ADD target/offerride.jar passenger.jar
ENTRYPOINT ["java","-jar","/passenger.jar"]