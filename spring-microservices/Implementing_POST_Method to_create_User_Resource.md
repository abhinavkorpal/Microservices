Welcome back! In the previous few steps,

we created a few simple RESTful services. We were returning a few resources back.

So we were creating simple retrieve services. So all that we were doing was using the GetMapping.

This is the first step we would go into something called Post.

What we would use post for? We would use post typically to create something. In this step, we are going

to create a new user.

So we would want to create a new user.

We would want to create a POST request to this specific URI. Before getting there,

let's take a quick look at what we had already done

with the Get request. So let's fire in a request to slash uses. I’m in Chrome right now.

And if you do a right click and say inspect, a small window would open at the bottom of the screen where you can

see a few more things about what is happening.

Now. I would say refresh. You can see that there is a users request which is being sent out.

You can see what is the request header and also what you can see is the response headers as well.

And you can see what is the response coming back. As expected,

the response is exactly what we expect, right?

This is the details of all the users.

One of the things you’d already see in general is the status code of 200.

So, when we retrieve, when we return anything back from retrieve methods, what we're doing is we are

sending a response with the status of 200.

That's what Spring MVC framework does by default. So as soon as we return a proper response back, it thinks

it's of a status 200. Status 200 as you can see with the green thing,

that is right beside there.

It means

this is a successful request.

However, when we talk about Post services, we would want to be more specific. We would want to return

a status code called created.

Let's take a quick over view.

We want to get inputs of the details of the user. So the input of

this will be the details of the user.

Right?

I would want to get all details of a user. And what is the output? The output I would want to say is the

status is created.

And also I would want to return the created.

URI.

So if I'm creating a new user, I would want to return the URI of the created user.

Let's not worry about the output right now. Ler’s focus on the inputs.

I'll just call this public void.

for now. We will change the output a little later.

I'll call this create user.

And the thing is, this should use a post mapping, right? So I would need to do a Post mapping not a Get

mapping because this is going to be accepting a post request. Post mapping

let's import it in. Import post mapping.

So the slash users is now mapped to this specific thing.

When I do the request to a specific user, this is how the response comes in.

Right?

So, I want to use the exact request to be creating a user as well.

I don't want to pass in the Id because Id is something which should be assigned on the backend. So I’ll

let the Id to be assigned from the back end.

What I would send is the name and the birth date. So this is the kind of request that we would want to send

in to create a user. We can send this as part of our body of the Post request. What we want to do so is once

we get a request with the body as this, we would need to map it to a user.

So the input for this is a user object. So user user. I want to map this to a user.

And now I would also need to say, do the mapping.

How do I do that?

I’ll say this is the body of a request. How do I say that? Its at request body.

So when I type…when I put at request body on a parameter, what would happen is whatever I would

pass in the body of the request would be mapped to this parameter. I’m passing in the name, Adam.

So that gets mapped to name here. I am passing in a birthdate, that gets mapped to the birth date in here.

That would be because of the at request body annotation that we have added in. Now, the service has a simple

method, right? Service dot save user.

So we will use the same method save for a new user and existing user as well.

So for, now let's just call it service dot save user and let’s assign it to a new one. I’ll call this saved user.

I'm calling the save user service. And right now I’m returning a void back. We'll fix that a little later.

For now, what we have created is a simple method which is mapped to a post request to slash users. I’ll

get the request details into the requests body user.

And then I'm saving it in.

I'll just go into the Save method.

We can see that we are assigning a user Id.

If it's null.

So if the Id is null then we are saying it's Ids,

We calculate the Id and then we add it to the list.

So that's cool.

Now let's go ahead and execute this.

How did we execute that?

Think about it. How do we execute a Post mapping?

If I type in.. if I do a refresh here, what is being sent is a get request.

How do I send a post request? To be able to send a post request, what we would need to have is a simple

REST flag. We can actually do this from the command line as well.

But let's use a REST client. The REST client which we’ll use is get postman. The one which we use is postman.

If you go to get postman dot com, you should be able to download the postman app. The other way

you can install postman

is also search for postman chrome plug in.

So if you search for postman chrome plugin you can actually go to this page and you'd be able to install

the postman plug. Postman is a wonderful rest client.

It has all the features that you would need when you're developing a restful services.

When you launch a postman, this is what you would see.

So, I can fire a get request also from Postman. Until now we have been fighting get requests from the browser.

I can say HTTP localhost colon 8080 slash users slash one …Oops! Get the details of this first user.

You can see that I'm getting the details back. So you can send get requests as well as you send a

a post request as well. The way would send a post request is change the request method. So instead of get we would want

to send a post.

What I've done is I’ve copied body of the response. So I copied the body of the response which was coming

for user slash one. And now I would want to make it the body for the post request. In the post request body,

I would need to send this thing in. And what we would want to do is we would want to send a raw request.

So in the body, you’d need to choose raw

and put in this text in there.

And I would actually remove the Id because we dont want to assign the Id. Name is Adam and birthdate..I’ll…name

is Ranga and Ranga’s birthdate,

Let’s make it two thousand. I am very young guy.

OK!

Now, instead of text the thing which you need to send, what we are saying in here is JSON application

JSON. That’s what we’d need to choose.

So the body contains application JSON. Whatever we send in the body,

what would happen? It would be mapped to this request body in here.

We are sending a post request to slash user slash one. No!

We should send it to slash users because that’s what we wouldnt map it. As we discussed earlier, when

we want to create a user what we do is we will do a post to slash users. We are sending a post request

to slash users so thats what we have put in here. Local host 8080 slash users. I would want to send

the body, application JSON, name is Ranga and the specific details.

And now I am sending it. When I send the request, you’d see there is an error which is happening.

It’s saying internal server error. Type definition error.

I cannot create an instance of com in28minutes user.

It says, no creators default constructor exist.

Earlier we learned that for all the elements that are part of this bean, we need to have getters and

setters. The other thing which we would also need is a default constructor.

It doesn’t need to be a public constructor but there should definitely be a default no argument constructor.

When we created this constructor we over rided the default no argument constructor which is generally

provided by Java.

So now I would actually create it back. So I’ll say protected and I’ll say user

and create it in. So, it’s very simple, right? So, all that we are doing is adding a default no argument constructor.

There is no longer a default no argument constructor because we are providing the implementation for it.

Ideally if this was not there then Java would provide a default constructor for us. Since we added this

in, I have to now add in a no argument constructor. So let's do that.

The application has restarted and it’s fired the request again. Cool! Now, you see that status is 200-OK

That's pretty good, right?

So, now it says the status is fine.

We are able to execute a request very well.

So the request went successfully.

Now what I'll do is I'll send another get request.

I’d want to send get request to users.

You can see that there's a new user at the bottom.

There's a new user with Id four, name Ranga.

And the birth date which I have assigned to that. And the date is getting saved properly as well.

So that's cool.

In this step, what we have done is we created a simple resource to accept a Post. To execute a POST request

with Postman, all that we had to do was go to the post. Set the url to slash users and in the body of the

request, we typed in the content we would want to use and we made the type as application JSON and

then we created send. And we saw that status which was coming back was success. If we want to adhere

to the HTTP standards, you need to actually respond back with the status of created. User is created. So a service

let’s say a consumer is calling this post request.

he created a user and now he wants to get the details of the newly created user.

So he does not know how to do that because he does not have any information about what is the Id of

the user that is created. Whether the Id of the user is ten, is it twenty five, is it four?

They don't know it because we have not given the Id of the newly created user back.

Those are the two things we’ll fix in the next step.

```java
package com.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
		return service.findOne(id);
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		User savedUser = service.save(user);
	}

}
```

```java
package com.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {
	
	private Integer id;
	
	private String name;
	
	private Date birthDate;
	
	protected User() {
		
	}

	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
	}

}
```

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
