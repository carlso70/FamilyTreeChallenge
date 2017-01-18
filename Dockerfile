FROM java:alpine

WORKDIR /app

COPY build/libs/familytreechallenge.jar /app

CMD java -jar /app/familytreechallenge.jar
