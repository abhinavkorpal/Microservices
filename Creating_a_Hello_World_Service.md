we would want to create a simple controller, a REST controller which would return some hardcoded text.

This is like your hello world

RESTful web service.

I won’t really call this a restful webservice. Let’s just call it a service that returns some text.

I'm going to create a new class. I would want to call this HelloWorldController.java and click finish. What we want to do in this

HelloWorldController.java is, I would want to create a method and I would want this method to return. Hello world.

That's what we would want to do. Whenever we create REST service,

we would need to define two things, right?

One is what method? I would want to use get method and I would want to use

a URI.

What URI do we want to use? I want to use the URI, slash Hello world.

So if somebody goes into their browser and sends a GET request to slash hello world I would want to send

him some text.

One of the first things that we would need to do is to tell spring that this is a controller with.

So this is a controller in the sense that this would be handling HTTP requests.

So we need to tell Spring that this is a controller.

And next we’d need to create a method.

So the method would be let's say public.

It's returning a string hello world so I'll call it string and let's call it hello world.

What should this method do.

We would want to return this string back.

So I would do that return the string back. To this method,

I need to map a GET request to be the URI

hello world.

There are two things

now we have to do.

One is to call this a controller. So we need to say this is a controller and then we would need to map

a get URI of slash hello world to this.

If you'd want to tell Spring MVC that this is going to handle REST requests.

We would do that is by using something called @RestController.

Now this becomes a controller which can handle rest requests.

The next thing is to create a mapping for this method. I would want to map a GET request to this URI.

One of the ways of doing that is to create a request mapping.

So I type @RequestMapping. This is an annotation. I’ll import the annotation.

Now let's start our RESTful webservices

application. When I type in localhost 8080 slash

hello world.

You’d see Hello world displayed on the browser.

![](https://github.com/abhinavkorpal/microservices/blob/master/images/hello_world.png)

What we have done until now is we put up a very simple annotation at rest controller and then we mapped get requests

to this URI to this method. And whatever text which is returned by this particular method it's displayed on the browser. 

So we can improve this further.

Instead of using at request mapping, there's an another annotation called @GetMapping.

So I can say get mapping path is equal to hello world. 

Similar to this, there would be other mappings like post mapping, put mapping and other mappings that we would use in the subsequent steps.

I like the @GetMapping annotation because it's quite short and it's very easy to read as well.

we created a simple hello world request.

```java
package com.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
```
