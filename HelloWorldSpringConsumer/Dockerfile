FROM openjdk:11-jdk-stretch

ADD /target/HelloWorldSpringConsumer-0.0.1-SNAPSHOT.jar src/app/HelloWorldSpringConsumer-0.0.1-SNAPSHOT.jar

WORKDIR /src/app

ENTRYPOINT ["java","-jar","HelloWorldSpringConsumer-0.0.1-SNAPSHOT.jar"]