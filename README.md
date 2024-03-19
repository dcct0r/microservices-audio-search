# Rest API for searching audio

## Current stack
- Java 17
- Spring Boot, Spring Data, Spring Cloud Netflix
- PostgreSQL
- Hibernate ORM, Liquibase, Kafka
- Docker/Docker-compose

## What is done

## Architecture

## How to start
1. Clone the repository ```git clone https://github.com/dcct0r/microservices-audio-search.git```
2. Go to the project folder and do the following:
 ```
docker-compose build
```
```
docker-compose up
```
4. Import the postman collection into Postman (Optional)
5. The service is available at http://localhost:8088
## Endpoints
### ✅ Microservice audio-service
### Endpoins for authors
GET request
```
/catalog/authors/all
/catalog/authors/{id}
```
Post request
```
/catalog/authors/
```
Delete request
```
/catalog/authors/
```
### Endpoins for songs
GET request
```
/catalog/songs/all
/catalog/songs/{id}
/catalog/songs/subscription/{id}
```
POST request
```
/catalog/songs/
```
PUT request
```
/catalog/songs/edit/{id}
```
DELETE request
```
/catalog/songs/{id}
```
### ✅ Microservice search-audio-service  
GET request
```
/search/authors/{firstname}/{lastname}
/search/authors/{firstname}
/search/authors/{citizenship}
/search/authors/{genre}
/search/authors/{male}
```
