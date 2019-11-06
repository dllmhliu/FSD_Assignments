# FSD-SBA
Mentor On Demand (FSD SBA) v4.0


1. FrontEnd Source code

    FSD-SBA/frontend

2. Mid Tier Source code of all Microservices

    8761    eureka

    8765    gateway

    8001    payment

    8002    search

    8003    security

    8004    technology

    8005    training

    8006    user

3. Screen shots of Usage of Post Man tool to test each End Point of all Microservices
4. Few Steps on how to run the solution.

    mvn clean package

    mvn dockerfile:build
    
    docker run -d --name=sba-eureka -p 8761:8761 dllmhliu/eureka:latest
    
    docker run -d --name=sba-gateway --link sba-eureka -p 9002:9002 dllmhliu/gateway:latest
    
    docker run -d --name=sba-payment --link sba-eureka -p 8001:8001 dllmhliu/payment:latest
    
    docker run -d --name=sba-search --link sba-eureka -p 8002:8002 dllmhliu/search:latest
    
    docker run -d --name=sba-security --link sba-eureka -p 8003:8003 dllmhliu/security:latest
    
    docker run -d --name=sba-technology --link sba-eureka -p 8004:8004 dllmhliu/technology:latest
    
    docker run -d --name=sba-training --link sba-eureka -p 8005:8005 dllmhliu/training:latest
    
    docker run -d --name=sba-user --link sba-eureka -p 8006:8006 dllmhliu/user:latest

5. Test code of Angular and Mid Tier need to be included
6. Jmeter’s JMX file to test atleast one REST End point, and Screenshot of report
7. Dockerfile

    FSD-SBA/eureka/Dockerfile

    FSD-SBA/gateway/Dockerfile

    FSD-SBA/payment/Dockerfile

    FSD-SBA/search/Dockerfile

    FSD-SBA/security/Dockerfile

    FSD-SBA/technology/Dockerfile

    FSD-SBA/training/Dockerfile

    FSD-SBA/user/Dockerfile

8. Jenkinsfile or Jenkins UI ScreenShot

    FSD-SBA/Jenkinsfile

9. URL where the Project is deployed

