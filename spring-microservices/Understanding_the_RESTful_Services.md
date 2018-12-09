Overview of the different RESTful services that we are going to create. As we discussed earlier,

REST stands for representational state transfer.

![](https://github.com/abhinavkorpal/microservices/blob/master/images/Rest.png)

REST is just a style of how you design your resources and how you expose them using HTTP. REST aims to make best use of HTTP.

![](https://github.com/abhinavkorpal/microservices/blob/master/images/Rest1.png)

So we would want to make the best use of whatever things that HTTP provides. Like HTTP methods and HTTP status codes.

![](https://github.com/abhinavkorpal/microservices/blob/master/images/Rest2.png)

As we discussed earlier, the key abstraction is something called a resource.

Each resource would have a URI and we can have different representations for each resource.

Example: 
Create a User - POST/users
Delete a User - DELETE/users/1
Get all User - GET/users
Get all User - GET/users/1

Let's quickly look at all the RESTful web services that we would want to create.

I would want to retrieve the details of all the users that are present. It should be slash users. 

-Retrive all Users  - GET /Users

I want to get the detail so it should be a get request. Get to slash users.

Now I would want to create a user. I would want to create a new user.

I’d need to do a post again to slash users.

- Create a User  - POST /Users

I’d want to retrieve the details of a specific user. Few of the details of one user.

If I want to get specific user, I would need to pass in an Id.

- Retrive one User  - GET /Users/{id} -> /Users/1

So that’s what we need to do.

Now I would need to delete that user.

I need to send a delete request to the specific Id or this specific URI.

- Delete a User . - DELETE /Users/{id} -> /Users/1

That’s cool.

So if I want to retrieve all the posts for the user, how do I do that?

Think about it. I would want to retrieve all the posts for a specific user.

- Retrieve all the posts for a user  - GET /Users/{id}/posts

if I want to create a post for a user, so I would want to create a post for a specific user.

- Create a posts for a user  - POST /Users/{id}/posts

if you want do a retrieve, I would the send a get request.

- Retrieve details of the post  - GET /Users/{id}/posts/{post_id}
