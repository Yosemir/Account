FROM alpine
RUN apk update
RUN apk fetch openjdk11
RUN apk add openjdk11
COPY target/acount-0.0.1-SNAPSHOT.jar  acount-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","acount-0.0.1-SNAPSHOT.jar"]