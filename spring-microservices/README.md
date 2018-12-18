### Basics of RESTful Services
 - [Initializing a RESTful Services Project with Spring Boot](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/initializing_a_RESTful_Services_Project_with_Spring_Boot.md)
 - [Understanding the RESTful Services we would create in this course](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Understanding_the_RESTful_Services.md)
 - [Creating a Hello World Service](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Creating_a_Hello_World_Service.md)
 - [Enhancing the Hello World Service to return a Bean](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Enhancing_the_Hello_World_Service_to_return_a_Bean.md)
 - [Quick Review of Spring Boot Auto Configuration and Dispatcher Servlet - What's happening in the background?](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Spring_Boot_Auto_Configuration_and_Dispatcher_Servlet.md)
 - [Enhancing the Hello World Service with a Path Variable](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Enhancing_the_Hello_World_Service_with_a_Path_Variable.md)
 - [Creating User Bean and User Service](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Creating_User_Bean_and_User_Service.md)
 - [Implementing GET Methods for User Resource](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Implementing_GET_Methods_for_User_Resource.md)
 - [Implementing POST Method to create User Resource](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Enhancing_POST_Method_to_return_correct_HTTP_Status_Code_and_Location_URI.md)
 - [Enhancing POST Method to return correct HTTP Status Code and Location URI](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Enhancing_POST_Method_to_return_correct_HTTP_Status_Code_and_Location_URI.md)
 - Implementing Exception Handling - 404 Resource Not Found
 - [Implementing Generic Exception Handling for all Resources](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Implementing_Generic_Exception_Handling_for_all_Resources.md)
 - Exercise : User Post Resource and Exception Handling
 - [Implementing DELETE Method to delete a User Resource](https://github.com/abhinavkorpal/microservices/blob/master/spring-microservices/Implementing_DELETE_Method_to_delete_a_User_Resource.md)
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
  - http://localhost:8080/users/500
  
  
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


```json
{
    "timestamp": "2018-12-11T10:24:10.150+0000",
    "status": 500,
    "error": "Internal Server Error",
    "message": "id-500",
    "path": "/users/500"
}
```

```json
{
    "timestamp": "2018-12-11T10:27:20.693+0000",
    "status": 404,
    "error": "Not Found",
    "message": "id-500",
    "path": "/users/500"
}
```

### GET http://localhost:8080/users/500
- Get request to a non existing resource. 
- The response shows default error message structure auto configured by Spring Boot.

```json
{
    "timestamp": "2018-12-11T10:27:20.693+0000",
    "status": 404,
    "error": "Not Found",
    "message": "id-500",
    "path": "/users/500"
}
```

### GET http://localhost:8080/users/500
- Get request to a non existing resource. 
- The response shows a Customized Message Structure
```json
{
    "timestamp": "2018-12-11T10:24:10.150+0000",
    "status": 500,
    "error": "Internal Server Error",
    "message": "id-500",
    "path": "/users/500"
}
```

### GET http://localhost:8080/users/500
- Get request to a non existing resource. 
- The response shows a Customized Message Structure
```json
{
    "timestamp": "2018-12-14T03:31:14.670+0000",
    "message": "id-500",
    "details": "uri=/users/500"
}
```

## Resources and URI Mappings

- Retrieve all Users      - GET  /users
- Create a User           - POST /users
- Retrieve one User       - GET  /users/{id} -> /users/1   
- Delete a User           - DELETE /users/{id} -> /users/1

- Retrieve all posts for a User - GET /users/{id}/posts 
- Create a posts for a User - POST /users/{id}/posts
- Retrieve details of a post - GET /users/{id}/posts/{post_id}


