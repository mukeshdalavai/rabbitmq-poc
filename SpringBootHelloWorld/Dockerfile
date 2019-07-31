FROM openjdk:11-jdk-stretch

ADD /target/SpringBootHelloWorld-0.0.1-SNAPSHOT.jar src/app/SpringBootHelloWorld-0.0.1-SNAPSHOT.jar

WORKDIR /src/app

ENTRYPOINT ["java","-jar","SpringBootHelloWorld-0.0.1-SNAPSHOT.jar"]