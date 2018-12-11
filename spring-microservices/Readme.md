### Basics of RESTful Services
- Step 01 - Initializing a RESTful Services Project with Spring Boot
- Step 02 - Understanding the RESTful Services we would create in this course
- Step 03 - Creating a Hello World Service
- Step 04 - Enhancing the Hello World Service to return a Bean
- Step 05 - Quick Review of Spring Boot Auto Configuration and Dispatcher Servlet - What's happening in the background?
- Step 06 - Enhancing the Hello World Service with a Path Variable
- Step 07 - Creating User Bean and User Service
- Step 08 - Implementing GET Methods for User Resource
- Step 09 - Implementing POST Method to create User Resource
- Step 10 - Enhancing POST Method to return correct HTTP Status Code and Location URI
- Step 11 - Implementing Exception Handling - 404 Resource Not Found
- Step 12 - Implementing Generic Exception Handling for all Resources
- Step 13 - Exercise : User Post Resource and Exception Handling
- Step 14 - Implementing DELETE Method to delete a User Resource
- Step 15 - Implementing Validations for RESTful Services
- Step 16 - Implementing HATEOAS for RESTful Services

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


