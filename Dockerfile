FROM java:8-jdk-alpine
MAINTAINER prasadbolla
VOLUME /tmp
COPY /target/GetServiceInfoAPI-0.0.1-SNAPSHOT.jar GetServicesUserInterface.jar
ENTRYPOINT ["java","-jar","GetServicesUserInterface.jar"]

