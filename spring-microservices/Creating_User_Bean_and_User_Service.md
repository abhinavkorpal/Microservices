Welcome back! In the last few steps, we created a few simple hello world resources to understand the basics

of creating different things with rest controllers. Now we would want to start shifting our attention

to creating the real resources, users and the posts. What we’ll do in the initial part of the course,

we will use a static array list. We’ll not really talk to a database. We’ll use a static array list to represent

all our data.

After learning about JPA convert all our resources to use JPA.

So let's start with using a simple static list static array list and then over a period of time we would graduate

to moving to JPA and storing it to an in-memory database.

Let's create our first bean to store the user details.

So I’ll say control N, new class, I would want to call this bean as user. For this user I would want to have

a few member variables.

So private, I’ll use an integer class to represent the Id and I would have private string name and let's

say the user has a birth date. So I’ll say private date, birth date. What I’ll also do is import this in. So import

the date in. Control one, I want to use Java Util date.

Now I can go ahead and create the getters and setters

in the constructor. So alt shift S, getters and setters. I would want to say select all and say OK. Let's also generate a

tostring. Again Alt Shift S, generate tostring.

Or you can do a right click source generate tostring.

And the last thing we would want to generate is a constructor. Generate a constructor using fields.

The same thing.

Right click source. Generate constructor using fields. And I would want to use id name and birth date. Let’s go ahead and do that.

This is cool.

This is a very simple user.

This would enable us to create a few things around the user. To manage this user, I’d create something called

user DAO.

The user dao would be something which would be usually talking to the database and getting the details back

for you.

In this example, we will use a static array list in the user Dao service.

So let's go ahead and do that. Before getting there,

I would want to do a few small refactoring of the packages. So, I’d …RESTful web services

I'll recall this as hello world.

I would want to change the package name so control C, control one and I would say move it to the package.

So now this one is moved to the hello world package and similar to that the hello world bean.

I would also want to move it. So dot hello world package and move it to the hello world package please.

And you would see that now these are in the hello world package. I would want the user to be in the

dot user package. Move user to the package. We have

Hello world

and we have user present in here and we have RESTful web application…web services application in the root.

That's cool.

So now in the user, we would want to create another thing.

We want call it dao service, right? So I’ll create a new class. User

Dao service. One of the important things is we would want this to be managed by spring.

So how do I do that? By putting at component on it.

So at component,

This is something which would be talking to the database.

Actually, I could have put at repository on it as well because it talks to the database.

But here we are using a simple array list to store the list of users. We want to create a simple list of users.

So I’ll say public… actually private list of user, users is equal to new array list of users. I’m organising imports. Importing

util dot list. And one of the important things that I would want this to be a static list. So private static

lift of user users is equal to array list.

And in the static block let's initialize a few values into users.

Users dot add, new user.

I’m importing java dot util dot date.

Let's create a couple of users. So,

Let's say Adam, Eve, Jack and let’s change the Ids.

One two three.

These are very simple users.

Right?

So, I just have a static list where I have a list of three users and let's create a couple of methods

as well. We would want to have methods to return a specific user.

And also we would want to be able to return all the users back.

And also we would want to be able to add a user. The methods I would want to create are findAll which returns

a list of users back. And we would now create save user to save the user to the database.

I mean that's basically the array list in here. And we would want to find one.. to find a specific user based

on this Id.

Let's start with find all. So findAll method, we would want to return a list of users back.

It's very simple, right?

I just need to say users and return it back.

That's it.

That's the findAll method. And the save user method, on the other hand, I would need to actually add the

user to the list.

So what I would need to do is users dot add user. One of the important things is, typically when you create

a new user, the Id is calculated by the backend. The primary key is determined by the database.

So let's have a counter to determine the Id.

So what I’ll do is, I’ll say private static users count.

Initially it's three, right? So over here,

by the end of this initialization, it’s three.

So users count …I’d actually need to define the type.

It should be int. Users count is three.

Now what I would need to do is, for the incoming user that I would want to be able to save, I would

check if it's …if user dot get Id is equal to is equal to null.

If it does not have an Id then what I'll do is I'll give a Id.

I'll do actually a plus plus user account because the ids are 1, 2 and 3 and the next one I would want

to go to 4. And once I add the user in, I’ll return user back.

So the save method is very simple.

I'm checking if the Id is null,

If Id is not null then I'm setting the Id and I am adding the user to the list and returning the user back.

Last one is find one. So we have a list of users and I would want to find one and among them.

How do I do that?

I just need to use array list, right?

It's very simple. So, for user user in users.

If user dot get Id is equal to the id which is passed in, then what we would want to do? We want to return the

user back.

Otherwise, I’ll return null back.

That means, it's not found. In this step, until now, we defined a simple user bean, right?

So, we defined a very simple user bean with an Id, name and birth date and we created a few users and we

created a few methods to play around with these users.

Now we have a method to return a list of users, to save a specific user, and do a find one on the user.

For now we are just using a static array list.

After learning about JPA we would actually switch this application to use JPA. We'll switch all these

resources to talk to a JPA backend. In the next step we will shift our attention to creating the user controller.

Until then, bye-bye.


```java
package com.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {
	
	private Integer id;
	
	private String name;
	
	private Date birthDate;

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

```java
package com.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "Jack", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==null) {
				return user;
			}
		}
		return null;
	}

}
```
