Welcome back! When we talked about the resource mappings, we said some of the values would be passed in the path

parameters. So, here Slash user slash Id. Id is a path parameter. In this step, what we'll do is we'll create another

simple hello world bean request with a path parameter. What I'll do is I'll copy this

And what we want to do is we want to pass in a param. What we'll say is we’ll create a URI - hello world

path variable slash.

I’d want to accept the path variable in here.

I would need to give a name to the variable so I’ll call it name.

So what would happen here is when I get a request let's say path variable slash in28minutes, then

in28minutes will be mapped to this variable name.

So let's create a variable to take that. So that’s called string name,

right?

Is that sufficient?

Actually it's not.

I’d need to add an annotation called at path variable.

And now it's imported in.

Now what would happen is when somebody types in a URI- in28minutes - it would get mapped to the

name in here.

So this in28minutes would be what would be mapped into name. I’ll change the name of the method.

It doesn't really matter.

But let's change it. Hello world

path variable. Over here I would want to use a format. So I’ll say hello world percentage S. I’ll use a name

in here.

So I'll say a string dot format. string dot format.

And this is the format to use and I'll say use the arguments - name.

What would happen?

This percentage S would be replaced with name and this hello world bean

would be returned back.

So what we're creating here is very simple, right?

What we want to do is to take this path variable and whatever value is coming back,

We are creating a hello world bean with this string template and returning that back.

It's a simple example to show the power of path variables. In all our social media application resource

mappings,

we will use path parameter extensively.

So here we are mapping user id. Here we’re using post Id. In restful applications,

we make extensive use of the path variables. These are also called path parameters.

Now let's start the application and I'll copy this hello world path variable in28minutes down here.

So it's localhost 8080 hello world path variable in28minutes and you're seeing now that it's coming back

with a response, Hello world

in28minutes. Whatever I am passing in as a path variable is getting replaced in here.

Let's change it again.

Hello World Ranga.

This is getting us hello world Ranga.

So whatever value we are passing in is being picked up by the controller.

And it is being sent back in the response. Path variables are a critical part of creating REST resources.

We’ll make extensive use of path

variables in this specific course. In this step, we learned how to create a path variable and how to pick

up the value from it and use it in a controller method.

Until the next step, bye-bye.

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
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HellWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HellWorldBean(String.format("hello world, %s", name));
	}

}
```
