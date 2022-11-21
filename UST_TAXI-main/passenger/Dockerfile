FROM openjdk:11
VOLUME /tmp
ADD target/offerride.jar passenger.jar
COPY dockerize dockerize
CMD ./dockerize -wait tcp://usttaxi-db.ci7lpyvltlok.ap-northeast-1.rds.amazonaws.com:3306 -timeout 15m java -Djava.security.egd=file:/dev/./urandom -jar /passenger.jar