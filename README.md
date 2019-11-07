# FSD-SBA
Mentor On Demand (FSD SBA) v3.0

## FrontEnd ：Angular；
##  Mid Tier：SpringCloud；
- Eureka  
- Zuul  
- Feign  
- OAuth2  
- Security  
- Config  

## Environment
- node-10
- jdk1.8
- MySQL Server 5.6
- maven3.X
- IntelliJ IDEA 
- VScode


```

FrontEnd Source code

    FSD-SBA/frontend

Mid Tier Source code of all Microservices
    9001    registry
    9002    gateway
    8001    payment
    8002    search
    8003    security
    8004    technology
    8005    training
    8006    user

Use Post Man tool to test each End Point of all Microservices
## Deploy
Docker :
```
    mvn clean package
    mvn dockerfile:build
    docker run -d --name=sba-registry -p 9001:9001 dllmhliu/registry:latest
    docker run -d --name=sba-gateway --link sba-registry -p 9002:9002 dllmhliu/gateway:latest
    docker run -d --name=sba-payment --link sba-registry -p 8001:8001 dllmhliu/payment:latest
    docker run -d --name=sba-search --link sba-registry -p 8002:8002 dllmhliu/search:latest
    docker run -d --name=sba-security --link sba-registry -p 8003:8003 dllmhliu/security:latest
    docker run -d --name=sba-technology --link sba-registry -p 8004:8004 dllmhliu/technology:latest
    docker run -d --name=sba-training --link sba-registry -p 8005:8005 dllmhliu/training:latest
    docker run -d --name=sba-user --link sba-registry -p 8006:8006 dllmhliu/user:latest
```

FrontEnd :
```
npm install
cd sba-angular
npm install
npm start
```
Jmeter’s JMX file: sba-jmeter.jmx
    
Dockerfile:

    FSD-SBA/registry/Dockerfile

    FSD-SBA/gateway/Dockerfile

    FSD-SBA/payment/Dockerfile

    FSD-SBA/search/Dockerfile

    FSD-SBA/security/Dockerfile

    FSD-SBA/technology/Dockerfile

    FSD-SBA/training/Dockerfile

    FSD-SBA/user/Dockerfile

Jenkinsfile:

    FSD-SBA/Jenkinsfile

URL :

    http://localhost:4200/

