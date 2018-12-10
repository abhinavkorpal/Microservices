This step let's shift our attention to start creating the user resource.

We have to use a service.

And let's start creating a user resource right now.

So let's say control in your class I would want to call this user resource.

This is a resource is a rest controller I will have the rest methods which are defined in his home address

controller.

Important in and over here.

Let's start with creating a couple of mentored in this that created three of all users.

The source we wanted to get the complete list of users and also we want to create to retrieve user and

we will take ID as input.

So we would want to create two simple methods which would give details of all the users and get details

of a specific user.

We all didn't even map it you are nice to them so they should be get less users to all users.

It should be get flash users and one users should get you the slash.

Let's pick that up.

No I can create a couple of methods to do that right.

Very simple public stuff of users because that's what we would need to sit back and call this retrieval

you know input.

And I can return back what can I written back.

I need the user.

So yes.

So I need to do this so that I can get the data.

So you use a service Yes and I would want to make this pay rate.

Do the board actually use it.

So let's keep that user down so we service and this should be auto wired in thing what do the are the

wedding of the user.

So what we did here is we put an ad component.

This is a bean which is managed by spring.

And we have seeing here to the wire in years.

What does it create in front of you that does service and art that it in here goes about this in the

being part of the course.

Now we have this so we split and so now what I can do is return.

So we start how can I get the list of users find all that committed which we already define the term

as important Jawa utility is important.

We can also map a method to it.

It's very simple like at Gate mapping.

What is you are right that we want to map is slash users as simple as that.

So once you have the business logic defined it's very easy to create services at them.

So if you look at the implementation of our find all that just are doing you this list of users back.

So it's done.

The different thing to chaplets and back.

It's now stop the application.

And I can now start doing localhost.

A date is slash.

It's cool.

Now you can see that all the values are coming up.

So you can see that there are three uses which are being written back IDs one name is Adam.

Boy.

I don't really like this.

Let's fix it in a short while.

It is really triggering the three of us back in the day so far.

That's pretty cool.

Let's pick the date right now.

What Jackson does is it takes by default a time stamp.

So it has a bank Stampfer.

But to date we have created in we don't want to use the damn stem.

We need to make a setting for that.

So let's go to application to properties and let's add another configuration.

It's Jackson thought you would want to do SpinCo or taxand of serialization.

Dot what I did.

Spectum stamps the value which we would want to set to for.

What we're telling Jackson to do is when you're lazy and telling it to treat dates as deeds don't treat

dates as time stamps and every started the application.

Let's see what happens.

I'm refreshing it right now.

Now you can see that DBO is coming in the proper time format.

So this is the date and this is the time in here.

So that's pretty cool.

So we have our ID we have a name we have about date and we are getting a list of thoughts back.

Also quickly create the thoughts to get the best recusant.

So what we want to do is get a specific user so public a specific user so it's user retrieve use it

in dady.

And I would want to be able to get the users I would want to be able to dig this ID from the bot barometer.

Right.

But maybe a in Dady and I would want to be able to return service Dorte find one and pass the idea and

put and let's do the mapping.

The mapping is very similar to the one you get mapping the ID alone I would need to take it and put

it in when you type in a flash a specific ID.

This is what would happen.

Let's see what happens.

Let's slash one now.

You'd see that a specific user details are also coming back IDs.

One name is Adam and I'm getting the date in a specific format in the step.

We created a simple resource and we created a couple of methods.

We may get met that slashes out and a good method to slash slash.

And we were able to retrieve these deeds back in the next step.

We would discuss more about these resources and add one moment to it.

Until then we're way.
