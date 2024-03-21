# 🎼 Rest API for searching audio

## ⌨️ Current stack
- Java 17
- Spring Boot, Spring Data, Spring Cloud Netflix
- PostgreSQL
- Hibernate ORM, Liquibase, Kafka
- Docker/Docker-compose

## ⚙️ Architecture
![arch](https://github.com/dcct0r/microservices-audio-search/assets/111187206/ca175a47-62e7-492e-98e0-a96063d8f930)

## 🤖 How to start
1. Clone the repository ```git clone https://github.com/dcct0r/microservices-audio-search.git```
2. Go to the project folder and do the following:
```
mvn clean package -Dmaven.test.skip
```
 ```
docker-compose build
```
```
docker-compose up
```
4. Import the postman collection into Postman (Optional)
5. The service is available at http://localhost:8088
## 🚩 Endpoints
### ✅ Microservice audio-service
### Endpoins for authors
- GET request
```
/authors/all

/authors/{id}
```
- POST request
```
/authors/
```
- DELETE request
```
/authors/
```
### Endpoins for songs
- GET request
```
/songs/all

/songs/{id}

/songs/subscription/{id}
```
- POST request
```
/songs/
```
- PUT request
```
/songs/edit/{id}
```
- DELETE request
```
/songs/{id}
```
### ✅ Microservice search-audio-service  
- GET request
```
/search/authors/{firstname}/{lastname}

/search/authors/{firstname}

/search/authors/{citizenship}

/search/authors/{genre}

/search/authors/{male}
```
