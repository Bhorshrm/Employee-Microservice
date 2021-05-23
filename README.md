# OrgEmployee_Microservice
A Microservice to maintain Employee and it's Organisation  Information.

# API Documentation
<a href="http://fvcproductions.com"><img src="https://github.com/gyrsh/OrgEmployee_Microservice/blob/main/Screenshot%202021-05-23%20at%207.36.42%20PM.png" ></a>

# API WorkFlow
<a href="http://fvcproductions.com"><img src="https://github.com/gyrsh/OrgEmployee_Microservice/blob/main/controller-and-restcontroller-annotations-in-spring-boot-1.jpeg" ></a>


# Microservice Archectiture (Introduction by Modules)
## AOP
To Implement Cross-cutting concerns like logging.
## Controller
The controller class/modeule is responsible for processing incoming REST API requests, preparing a model, and returning the view to be rendered as a response.
## DAO
DAO module is responsible for encapsulating the details of the persistence layer and provide a CRUD interface for a single entity.
## DTO
DTO module transfer data to remote interfaces, just like web services.
## Mappers
This layer converts external data representations into internal ones, and vice-versa. Acts as buffer to protect the service from changes in the outside
world.
## Service
This Layer implements the Business Logic.

# Tech 
#### Microservice Framework Used : Spring Boot (Version 2.4.1) 
#### Unittest Framework Used : Junit , Mockito
#### Database Used : Postgres (Configuration Setup in Application.properties
#### Documentation : Swagger (Version 2.7.0)
#### Application Server : Apache Tomcat
#### Project management tool : Maven (Version 3.6.3)

# How to get started?
You Require
JDK 11,Maven 3.6.3 & Postgres

1. Clone the repo & run mvn clean install in terminal
2. Run Application 
3. And Go to http://localhost:8080/swagger-ui.html#/ on browser 
4. And Test the APIs using Postman
