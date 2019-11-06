FROM openjdk:8-jdk-alpine
MAINTAINER MeiHuaLiu <dllmhliu@cn.ibm.com>
COPY /target/security-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]
ARG JAR_FILE=target/security-1.0-SNAPSHOT.jar
