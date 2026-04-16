# arquitectura-hexagonal

This repository contains an Hexagonal architecture spring boot project. It shows you the basic structure and logic you will need to follow in order to complete your first project of this kind. Of course this is only the "Skeleton", features like ControllerAdvice,logging and more good practices will be added soon.

## Architecture

- Java 21
- Spring boot 4.0.5
- MySQL 8.4.0

## How to run it

1. Setup your DB credentials in the properties file

2. Create the **animals** database 

3. Install dependencies

        mvn clean install

4. Run the project

        mvn spring-boot:run

## Actuator and Swagger URLs

- http://localhost:8080/swagger-ui/index.html

- http://localhost:8080/actuator
