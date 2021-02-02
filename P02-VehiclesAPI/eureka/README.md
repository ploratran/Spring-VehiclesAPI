# Eureka Server

Eureka, created by Netflix, is responsible for the registration and discovery microservices.
Spring has incorporated Eureka into Spring Cloud, making it easier to stand up a Eureka server.
Eureka consists of a server and a client-side component.
The server component will be the registry in which all the microservices register their availability.
The microservices use the Eureka client to register; once the registration is complete,
it notifies the server of its existence.
This module is for the Eureka Server and not the microservice client.


Eureka Server: http://localhost:8761

## Dependencies:
- Config Client for ```spring-cloud-starter-config```
- Eureka Server ```spring-cloud-netflix-eureka-server```
- JAXB. The below additional dependency needs to be added in pom.xml
  in order to get the Eureka server up and running:
```
    <dependency>
       <groupId>javax.xml.bind</groupId>
       <artifactId>jaxb-api</artifactId>
       <version>2.4.0-b180725.0427</version>
    </dependency>
```

## How to register server to Eureka: 

1. Add the application **name**, **server port** (8761 in the case of a Eureka server, typically) and logging with below configurations to ```application.properties```:
```
# server name and port: 
spring.application.name=eureka-server
server.port=8761

# avoid registering itself as a client: 
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false

# logging: 
logging.level.com.netflix.eureka=debug
logging.level.com.netflix.discovery=debug
```

2. Add **@EnableEurekaServer** annotation and import **EnableEurekaServer** in main application class. 


### Any registered client application(s) to the Eureka server will be displayed at ***localhost:8761*** as below: 

![](../microservice.png)

