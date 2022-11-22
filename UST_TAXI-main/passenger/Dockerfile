FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine-slim
VOLUME /tmp
ADD target/offerride.jar offerride.jar
COPY dockerize dockerize
CMD ./dockerize -wait tcp://usttaxi-db.ci7lpyvltlok.ap-northeast-1.rds.amazonaws.com:3306 -timeout 15m java -Djava.security.egd=file:/dev/./urandom -jar /offerride.jar