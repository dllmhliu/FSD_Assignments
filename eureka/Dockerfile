FROM openjdk:8-jdk-alpine
MAINTAINER MeiHuaLiu <dllmhliu@cn.ibm.com>
COPY /target/eureka-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]

# The application's jar file
#ARG JAR_FILE=target/eurekaserver-1.0-SNAPSHOT.jar
# Add the application's jar to the container
#ADD ${JAR_FILE} app.jar
# Run the jar file
#ENTRYPOINT ["java","-Dspring.profiles.active=k8s","-jar","/app.jar"]