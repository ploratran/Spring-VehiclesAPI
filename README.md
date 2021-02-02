# About this Repository
This repository is related to the [Java Web Developer (ND035)](https://www.udacity.com/course/java-developer-nanodegree--nd035), Course - **Web Services and APIs**

It contains the following folders:
1. Exercise-Lesson2: Contains the classroom exercise
2. P02-VehiclesAPI: This folder contains a project readme file that has the instructions to follow

## Table of Contents
1. [Project Introduction](#project-introduction)
2. [Microservices](#microservices)
5. [Endpoints](#endpoints)
6. [How to use the app](#how-to-use-the-app)
7. [App Structure](#app-structure)
8. [Udacity Requirements](#udacity-requirements)
10. [License](#license)


## Project Introduction: 
In this project, you'll use your skills with Spring Boot, APIs, documentation, and testing to implement a Vehicles API that serves as an endpoint to track vehicle inventory. While the primary Vehicles API will perform CRUD operations (Create, Read, Update and Delete) related to vehicle details like make, model, color, etc., it will need to consume data from other APIs (Boogle Maps and Pricing Service) as well regarding location and pricing data. You will implement a RESTful API for the Vehicles API, as well as converting a Pricing Service API to a microservice. 

By the end of this project, you'll have an application that can communicate with other services and be able to be viewed and used through Swagger-based API documentation.

## MicroServices: 
1. [Boogle Maps](P02-VehiclesAPI/boogle-maps)
2. [Eureka Server](P02-VehiclesAPI/eureka)
3. [Pricing Service](P02-VehiclesAPI/pricing-service)
4. [Vehicle API](P02-VehiclesAPI/vehicles-api)

## Endpoints: 
| Microservice    | Port |
| --------------- | ---- |
| Boogle Maps     | 9191 |
| Eureka Server   | 8761 |
| Pricing Service | 8082 |
| Vehicle API     | 8080 |
| Swagger         | 8080 |

## How to use the app: 
The Boogle Maps, Pricing Service, Vehicles API and Eureka Server must all be running for all operations to perform correctly, although they should be able to launch on their own.

In seperate windows, use the below commands: 

```$ mvn clean package``` (Run this in each directory containing the separate applications)

* Boogle Maps ```$ java -jar target/boogle-maps-0.0.1-SNAPSHOT.jar```

* Pricing Service: ```$ java -jar target/pricing-service-0.0.1-SNAPSHOT.jar```

* Vehicles API: ```$ java -jar target/vehicles-api-0.0.1-SNAPSHOT.jar```

* Swagger API open on browser at: ```http://localhost:8080/swagger-ui.html```

## License
[License](LICENSE.txt)
