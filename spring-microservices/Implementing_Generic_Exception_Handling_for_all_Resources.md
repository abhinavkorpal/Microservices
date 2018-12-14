In the previous step, we saw that when we executed the request to a non-existing user, we were getting a 404

not found but the specific structure which is defined by default by spring MVC. As we discussed earlier,

in an organization you would to define a standard structure.

So let's say you have some standard structure designed in your organization.

And how do we adhere to that.

How do we create responses in that specific structure.

That's basically what we would look at in this specific step.

Customizing the exception handling to a structure that is defined by us.

Go ahead and create a simple structure.

So I would want to have a new class and I’ll call this exception. I can call this exception details, exception

response or whatever

I would want to. So I'll just call this

exception response.

Actually, I would want to create it in the package dot exception and move it to that package. In the exception response, we can create

any custom structure. At the basic level, I mean at the most basic level the important things that you would

need to have are - first would be a timestamp indicating where…when the exception happened then probably

you would want to have some exception message and some detail.

So let's create simple elements for them. Private date time stamp, private string message and I would

create private string details. I’ll import java dot util dot date.

Ok! That's a very basic structure.

And let's quickly add in the basic constructor. So right click source generate constructor using fields.

That's cool!

I have a constructor and I’ll also generate getters and setter. I’ll say select getters. Setters aren’t really needed.

I just create the getters.

So what we have created is a simple exception response bean. We have a data string and string time stamped

message and details.

There’s a simple constructor and a few getters also in there.

And now what do we want to do, when an exception happens,

I would want to return the exception in this format. So instead of the message we were getting earlier, timestamp

status error message path.

But I would want to create a message of this structure. Timestamp, message and details. At a later point in time,

you can actually enhance this to meet the standards of your organization.

So name of these variables might be different.

So, instead of calling it a timestamp, maybe you'd call it something else. Instead of calling this message

or details, you might be calling it something else.

But you can easily customize it to whatever your needs are.

The most important thing is this exception response should be something that should be standard across

your organization. Not just your project,

I would even think a level above and make it a standard across almost all services in your organization so that

everybody can use this structure. The structure is the most important part and the structure has

to be language independent because you are creating a java service.

You are creating a java resource. There might be other resources which are exposed from let's

say Nodejs or dot Net or whatever it is.

Once the structure is defined you can provide the Java implementation for it.

What we want to do is whenever an exception happens we would want to return a response back in this

specific format.

How can we do that?

One of the important classes which is present in spring is response entity exception handler.

This is basically an abstract class which can be extended to provide centralized exception handling

across all the different exception handler methods.

So this one I can use as the base class to provide some default exception handling for all our requests.

What we’ll do is we’ll extend this class. So we'll extend this and provide a customized exception handling

functionality.

So let's create a new class.

Again I’ll go to the package exception and create a new class.

I would want to call this customized response entity exception handler.

Actually, you can put your organization name or whatever you’d want as the name here.

That would make it even more specific.

But for now I’ll just keep it simple.

I’d want to extend the default exception handling which is provided by spring in response entity exception

handler.

The other thing is this exception handling I would want it to apply to all controller. There might

be a number of controllers that are defined, right?

So there's a hello world controller, there is a user resource. One of the things you need to understand

is we are calling this user resource because we're exposing it as a resource.

Some projects, some people might even call this user controller.

So instead of user resource,

this might be to a user controller as well.

So a controller or resource,

I'm trying to be more specific to say this is a resource which is being exposed but you can

still call it a user controller. Controller is something which we follow from the MVC Model View Controller pattern.

So, this is exactly doing something similar.

This is specifically exposing resources. So I call it user resource, you can also call it user controller.

It doesn't really matter.

The most important thing is to remain consistent.

So, once you call this user

resource, I'm going to call everything else as a resource as well. First thing we need to do is we need to call

this a rest controller because this is providing a response back. In case of exceptions,

that's what it does, at rest controller and other thing is I would want this to be applicable across

all the other controllers.

So, how can we do that?

It can be done by using another spring annotation called Spring controller advice.

I am importing controller advice here.

So if you look at the controller advice, it says specialization of the component for classes that declare methods

to be shared across multiple controller classes.

So when we have multiple controller classes and we would want to share things across them, then we

would use this thing called controller advice. Using a controller advice, the typical things which

are defined are exception handling. That’s what we are defining right now.

The other things which can be defined is how do you handle dates. That's defined by using init binder

for example.

And also the other things which can be defined are common modal attributes that you would want to use

across controllers. In all these scenarios.

we would use a controller advice. We have defined the controller advice annotation we have made it a

rest controller.

Now I would want to go ahead. So response entity exception handler.

If you go further down here there is a specific syntax that you would need to provide to over ride

things in here.

So there's a default thing that is provided by response entity exception handler. We want to over ride

that for specific exceptions.

So what I'll do I'll copy this method from here.

So I’ll say public final response entity of object.

Handle exception, exception comma web request.

Now I want to over ride this for a specific exception.

So, whenever some exception happens, I would want to say at exception handler.

What kind of exception does this handle?

I would want, for now, to handle all the exceptions. So exception dot class.

I can import the exception handler in. And I’ll rename the method. I'll call this

all exceptions. Right now we are not returning anything back.

What we want to do is when a exception happens we want to create a new instance of our specific bean.

So what we want to create is…we created a bean called exceptional response.

Right?

So we want to return our specific thing back. We want to return a exception response back. And to create

an exception response,

first thing I’d need to have is the date.

So I’ll for now just say new date. I’ll import java util date. Java util date, that’s

what I want. The next thing I would need to send is the message. So I’ll get that from the exception. I’ll

say exception dot get message.

I can … I need to add in a few more details.

Any details that you would want to add in for that specific exception you can add.

You have to be sensitive about security when we're sending any response back and in the detail you

need to think about what you would want to send. For now,

I would send something called request dot get description. And I’d include the client info as

well. This has to be evaluated on case by case basis to see if you'd want to really include this description

as part of your response.

But for now let’s just create this.

I would actually take this into a variable. So exception response exception response is equal to new

exception response. That’s cool. It’s perfect. Format this a little bit.

Now we have the exception response.

Now I would want to create a response entity object. So how do I create a new response entity object? Response entity

object. I would pass in the exception response. That’s one of the parameters that's input to it.

And the next thing you would need to send in is the HTTP status. HTTP status dot…I’ll give a status of

internal server error for now. So for all exceptions,

this is the status that is being returned back right now.

We will quickly override this specific exceptions.

That's cool, right?

So now we have defined a default exception handling for all the things which would return an internal

error back and we're creating an exception response object in our structure.

Let's wait for the server to pick this change up.

And now I would execute the request.

So if you see that when I get ….execute the request for 500 it says, internal server error, time stamp is this, message is this

details is this.

So we are getting the message back in our format but we're going back to the earlier thing of 500 internal

server error. For all exceptions we would want to return internal server error but we would want to customize

it for specific exceptions to return a different status back. For exception class,

it's OK to return internal server error.

But let's say for user not found exception I can customize it. So I can say handle user not found

exception. I'm just copying the earlier method, renaming a few things.

Exception and this instead of exception I’ll

call this user not found exception.

And now I can go ahead and customize the exception status that’s returned. dot not found. And now when I execute

the request,

you would see that I'm getting a 404 not found and with a specific structure that we're using for

our specific thing. At a high level,

the most important things that you would want to understand is the fact that having a customized message

structure across the organization is very important.

You need to have some class of this kind trying to define what is the status that you would want to return

back to for different kinds of exceptions.

Probably you can create a simple jar with the exception responses that you'd want to give for the common

ones.

What we have looked at is different options that are present in spring MVC to customize how you

return the exception object back.

Actually you might not even need to create this entity exception handler if the default structure

which is provided by spring MVC is good enough for you.

But if you want to customize it then you can create a customized response entity exception handler

where you can actually go ahead and customize how you would want your exception responses to look like and what

kind of HTTP response status you'd want to return back. Until the next step, bye-bye.

```json
{
    "timestamp": "2018-12-14T03:31:14.670+0000",
    "message": "id-500",
    "details": "uri=/users/500"
}
```

```java
package com.rest.webservices.restfulwebservices;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timestamp;
	
	private String message;
	
	private String details;

	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
```

```java
package com.rest.webservices.restfulwebservices;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rest.webservices.restfulwebservices.user.UserNotFoundException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex, WebRequest request) throws Exception {
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
		
	}

}
```
