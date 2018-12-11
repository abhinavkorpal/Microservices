One of the key part of creating awesome resources is returning the correct response status back

always. In the previous step, we returned a proper response status of created when we created the resource.

However, we have not really started thinking about what should happen when something goes wrong. When a

user is not found.

What should be the response that should be returned back.

Let's try and execute a simple request.

I'm creating a URI, localhost 8080 slash user slash

you can say 500. This is a user which is not there.

The Id we created users one two three four and probably you would have created a couple of resource at five and six

users five hundred is a resource which does not exist.

So when I send it, I'm right now getting a response back of 200.

OK.

And the body is empty.

So the body is empty.

We're getting a successful response.

So 200 is always, think about it as if it's a successful status.

So as you can see in the pop up which comes up, it's standard response for successful HTTP requests. Even

though the resource does not exist,

We are sending a successful response back.

That's not really good isn't it?

So let's fix that first.

I'll take the service dot find one to a local variable and I'll call this user.

So this is a user from the service and if user is NULL, if user is equal to null then what can

we do? For now, let's just throw a simple exception. So I’ll say throw new user not found exception. I can

throw you a runtimeexception as well but I would want to be very specific. So I’ll say new user not found

exception.

And I would pass in Id as the parameter to that so that we know which user which Id wasn't out.

Obviously the user not found exception is not present. So I’ll create class

user not found exception. I’ll create it in the user package itself.

And let's go ahead. Superclass,

I don't want exception. I would want to use the runtime exception. Exception is a checked exception.

I kind of try and avoid checked exceptions. So wherever we can possibly can.

So we're using a runtime exception.

And you can click Finish.

So now a user not found exception is created with runtime exception.

I’ll also want to override the constructor and provide a message constructor.

So what I'll do is right click source generate constructor from superclass that’s what we want to do.

Generate constructor from superclass.

And I would want to.

over ride

the one with string.

That's the only one which we want to

over ride.

So now I have a user not found exception which is being thrown from user resource when there is a error. Let's see what

would happen now.

Let’s see how the frameworks react to this. So I am senidng in the same request.

again. You can see that now the response is status is 500. It’s saying internal server error. Id is equal to 500.

And path is user slash 500.

This is cool because this is giving me a lot more detail than earlier.

And this is good for the end consumer as well because they know that it's a failure.

The request did not succeed.

The request resulted in a 500 Internal

server error. This is better than returning a status of 200. But is this perfectly all right?

Not really because this is not really a server error.

The resource is not found.

The request is …has a mistake.

So whatever the resource you are searching for, it's not found.

That's the problem.

The problem is not a internal server error. How do we fix that?

So currently we are getting a status of 500 internal server error.

Is there a way we can improve this and actually return a not found?

Actually I'm searching for a resource called 500. And it's not found.

So can I return a status of not found?

That's what we would look at right now. In this exception,

I would want to return, whenever this exception is happening , when user not found exception happens, it's

always a response status of not found,

right?

How can I add that?

It's very simple.

As with anything in spring, simple annotation. So response status, response status and control one

command one to import it. And what is the response status I would want to use? I would want to use HTTP status dot

What is the status? Not found.Because the resource is not really found.

So I'm going to use not found HTTP status called not found. Let’s save it. Let's wait for the server to restart.

and fire the request again.

And now you can see the status is 404 not found.

Now this is a good response back to the consumer because we are saying, “Ok! You’re searching for

the resource with Id 500. It's not found.

And if you want more details you can look at the body of the response.” It’s saying not found. Message is

not.. Id 500, path is users 500.

We are specifically saying the Id 500 is not really found. Status is 404 and there is a

time stamp being returned back.

One of the things that is cool about this structure is this is something which is provided by the default

error handling that is provided by the combination of spring boot and spring web MVC frameworks. So what

Spring Boot does is it auto configured some default exception handling for us.

And that's why we are getting this return

status back.

However, one of the things that you would always need to remember is, it's important to have consistent

exception message which is returned back for all the services inside your enterprise.

So if you have a big organization and each of the services returns the exception message in a different

way that's not really good.

It would be really good if you can actually define a standard exception structure and that is followed

across all you were restful services.

What we’ll look at in the next step is defining

a simple common structure like this. There will not be any new details that we would add in. But we would add

in a simple common structure

and later when we work on validating our requests. Right now we are not really validating our requests.

If I'm trying to create a user with let's say name as empty.

I'm not really validating that right now.

At a later step, we'll look at how to validate that.

And also we would want to return a consistent validation message there as well. Until the next step, bye-bye.



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

```java
package com.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user = service.findOne(id);
		if(user==null)
			throw new UserNotFoundException("id-"+ id);
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = service.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}

}
```

```java
package com.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
```
