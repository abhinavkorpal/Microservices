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
