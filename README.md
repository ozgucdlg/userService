# User Service Application

## Introduction

Created User service to illustrate a CRUD API with Spring framework. The Project has __n-tier__ implementation. A request/Response design pattern was used in the project. The main reason for this is to hide whole columns and beans from client. 

## Technologies
 - Git/Github,
 - Java 17,
 - Spring Framework,
 - Maven,
 - Postman(API Testing),
 - Swagger(API Testing),
 - PostgreSQL, 
 - Docker.

## Scripts
- To start the application in the terminal:
`mvn spring-boot:run`
- To dockerize the application:
`docker image ls`

`docker run -p 8081:8081 spring-boot-user-service-jar`


## Test
Completed API testing with __Postman and Swager__ each scenario was monitored. Tested CRUD API with endpoints.

## Deployment
The application was deployed on GitHub applying each step of sprints. There is only one branch which is __master__.

## Improvements
 - Handle  hardware updates,
 - JWT essentials implemented with spring Framework,
 - The necessity of Time management in the real-time project,
 - Agile techniques with implementations.
