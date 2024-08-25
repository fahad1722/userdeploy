FROM openjdk:17-jdk-slim

EXPOSE 8080

ADD target/UserDeploy.jar UserDeploy.jar

ENTRYPOINT ["java", "-jar", "UserDeploy.jar"]