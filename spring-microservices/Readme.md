### Basics of RESTful Services
 - Initializing a RESTful Services Project with Spring Boot
 - Understanding the RESTful Services we would create in this course
 - Creating a Hello World Service
 - Enhancing the Hello World Service to return a Bean
 - Quick Review of Spring Boot Auto Configuration and Dispatcher Servlet - What's happening in the background?
 - Enhancing the Hello World Service with a Path Variable
 - Creating User Bean and User Service
 - Implementing GET Methods for User Resource
 - Implementing POST Method to create User Resource
 - Enhancing POST Method to return correct HTTP Status Code and Location URI
 - Implementing Exception Handling - 404 Resource Not Found
 - Implementing Generic Exception Handling for all Resources
 - Exercise : User Post Resource and Exception Handling
 - Implementing DELETE Method to delete a User Resource
 - Implementing Validations for RESTful Services
 - Implementing HATEOAS for RESTful Services

## Useful Links

- POSTMAN - http://www.getpostman.com

### Links from course examples
- Basic Resources
  - http://localhost:8080/hello-world
  - http://localhost:8080/hello-world-bean
  - http://localhost:8080/hello-world/path-variable/abhinav
  - http://localhost:8080/users/
  - http://localhost:8080/users/1
  
  
## Example Requests

### GET http://localhost:8080/users
```json
// 20181210190459
// http://localhost:8080/users/

[
  {
    "id": 1,
    "name": "Adam",
    "birthDate": "2018-12-10T13:25:54.363+0000"
  },
  {
    "id": 2,
    "name": "Eve",
    "birthDate": "2018-12-10T13:25:54.363+0000"
  },
  {
    "id": 3,
    "name": "Jack",
    "birthDate": "2018-12-10T13:25:54.363+0000"
  }
]
```

### GET http://localhost:8080/users/1
```json
{
    "id": 1,
    "name": "Adam",
    "birthDate": "2018-12-10T13:25:54.363+0000"
}
```

### POST http://localhost:8080/users
```json
// 20181211133728
// http://localhost:8080/users/

[
  {
    "id": 1,
    "name": "Adam",
    "birthDate": "2018-12-11T07:53:02.106+0000"
  },
  {
    "id": 2,
    "name": "Eve",
    "birthDate": "2018-12-11T07:53:02.106+0000"
  },
  {
    "id": 3,
    "name": "Jack",
    "birthDate": "2018-12-11T07:53:02.106+0000"
  },
  {
    "id": 4,
    "name": "Abhinav",
    "birthDate": "2017-12-11T07:53:02.106+0000"
  },
  {
    "id": 5,
    "name": "Abhinav",
    "birthDate": "2017-12-11T07:53:02.106+0000"
  }
]
```


