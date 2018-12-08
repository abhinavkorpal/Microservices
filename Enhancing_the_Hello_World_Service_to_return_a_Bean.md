we would actually create an object for hello world bean and try to return that back and see what would happen.

One of the things you need to understand is the fact that there is a lot of things that are happening in the background.

We used spring boot to create the project through the spring boot starter projects. We’re using frameworks like spring, spring MVC and a lot of other things.

So there is a lot of magic which is happening in the background. 

Before we get there, we would focus on getting another simple get request working.

What I want to do is to create a get mapping to Hello World and this time I would want to create a bean

and return it back.

So instead of creating a simple string, I would want to create a bean and return it back. The URI I would

want a map is hello world bean. We would continue mapping the get mapping request. However, instead of returning a

string we want to return a bean back.

So we want to do hello world bean and I’ll make the change in the method name.

Now you would see that the entire thing compiles but instead of creating hello world, what I would want

to do is to create a hello world bean.

One more thing I want to do is to make sure that this method is returning a hello world bean. So instead of string,

we want to return a

hello world bean. Actually the hello world bean is

not really there.

If you’d see the constructor which is present in here. 

I’d want to create a hello world bean with a message.

And now if you launch the hello world bean you would see a JSON message back.

You'd see that message.

Hello world.

![](https://github.com/abhinavkorpal/microservices/blob/master/images/hello_world_bean.png)

You can see that this message is adhering to a JSON structure.

We're calling this get URI.

And the hello world bean is being returned with the value Hello world.

So it’s just returning message and hello world.

So that's exactly what is here and the text which is being sent to the message is being presented as its value.

And this coming back as a JSON string.

However, this is returning a bean back. Earlier we returned a simple string back.

Now we're returning a bean back and this bean is being automatically converted into JSON and returned

back.

```java
package com.rest.webservices.restfulwebservices;

// controller
@RestController
public class HelloWorldController {
	
	//GET 
	//URI - /Hello-world
	//method - "Hello World"
	//@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	//hello-world-bean
	@GetMapping(path = "/hello-world-bean")
	public HellWorldBean helloWorldBean() {
		return new HellWorldBean("hello world");
	}

}
```

```java
package com.rest.webservices.restfulwebservices;

public class HellWorldBean {

	private String message;

	public HellWorldBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return String.format("HellWorldBean [message=%s]", message);
	}	

}
```
