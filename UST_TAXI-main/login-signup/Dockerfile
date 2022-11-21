FROM openjdk:11
VOLUME /tmp
ADD target/login.jar login.jar
ENTRYPOINT ["java","-jar","/login.jar"]
COPY dockerize dockerize
CMD ./dockerize -wait tcp://usttaxi-db.ci7lpyvltlok.ap-northeast-1.rds.amazonaws.com:3306 -timeout 15m java -Djava.security.egd=file:/dev/./urandom -jar /login.jar