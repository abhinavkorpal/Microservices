what's happening in the background. You’d see the mappings that we have created. So we created a mapping from Hello world get.

We also created a Hello World bean get but there are additional mappings also present in here

for example, slash error. When we look at the log,

There are a few important questions that would come up.

What is dispatcher servlet?

Actually we have not been anything about dispatcher servlet so who is configuring dispatcher servlet? What does

dispatcher servlet do?

How does the hello world bean object get converted to JSON?

And who is configuring the error mapping?

I would want to actually start running this application in something called debug mode and the way

we can do that is by going to applications.properties and configuring logging level.
```shell
logging.level.org.springframework = debug
```
let’s restart. When you restart now,

you'd see a lot more log than previously.

Because now we are at debug, logging Spring boot is outputting a lot of stuff and all that is being shown

in the log right now.

One of the important things that you’d see in here is something called an auto configuration report. The

auto configuration report consists of a lot of details.

If you look at the auto configuration log, one of the important things is configuration of dispatcher

servlet auto configuration.

It says dispatcher servlet auto configuration matched because it found a class called dispatcher servlet

on the classpath.

What is happening here is we added in a starter on spring boot starter web and Spring Boot

starter web has a dependency on spring web MVC framework.

Therefore we get the dispatcher servlet class in our classpath.

So Spring Boot Auto configuration says,

I found dispatcher servlet on the classpath. So let's go ahead and configure a dispatcher

servlet. The other thing you'd see is also the error MVC auto configuration.

So it says, “OK! these classes are found the classpath. So so we would need to configure a error page.”

So it's configuring a basic error controller.

A few error attributes and also a default error view resolver. The error page which we looked at earlier

was the white label error page.

This was the thing which was generating that error page.

In summary all this configuration is getting fired because of something called spring boot auto

configuration.

Spring boot looks at all the classes, all the jars which are available on the classpath and based on

whatever is in the classpath, it tries to auto configure different things like dispatcher servlet.

In addition to whatever we have discussed earlier,

the other things which are auto configured are things called HTTP message converters.

So we had the bean automatically converted to JSON, right? So these HTTP message converters were responsible

for doing that.

So what is happening is something called Jackson to object mapper.

So this actually does the conversion from JSON to beans and beans to JSON. Who is configuring dispatcher

servlet? Spring boot auto configuration.

How does the hello world bean

get converted to JSON? It’s

also because of Spring Boot auto configuration because the message convertors

and the Jackson beans are getting initialized. Who's configuring the error mapping? Again spring boot auto

configuration.

It creates a default error page for us.

Now the last thing we would want to understand is the dispatcher servlet.

If you look at the log you would see something like this - mapping servlet dispatches servlet to slash.

what is happening here is dispatcher servlet is handling all the requests.

So this is the root of the web application, right? So it’s handling all the requests.

Whenever you type a

URL into the browser, whenever I type hello world bean into the browser,

What would happen is the request would go to Dispatcher servlet. Dispatcher servlet would be the one which

would be handling that request first.

This is following a pattern called front controller. Dispatcher servlet is the front controller for

spring web MVC framework.

So the request goes to dispatcher servlet.

Dispatcher servlet knows all the different mappings which are present in the application. So

it knows

hello world get method is mapped to this method.

Dispatcher servlet knows that hello world bean get request is mapped to this specific method.

So once it gets to request, it determines which is the right controller to execute that request.

So it looks at the URI and the request method. When we type a URL in the browser, we’re

sending a get request. The dispatcher servlet says,

“Ok! there's a get request to Hello World bean. Which is the right controller that would be able to execute

it for me?”

It will find this specific method.

It would see that hello world controller dot hello world bean is the right one to execute.

So it would execute that, so it would make sure that this method is executed and this bean is returned

back. Once the bean is returned back then dispatches servlet looks at how do I send the response back.

I have bean.

Now how do I send the message back?

We have a at restcontroller annotation in here.

Part of the at restcontroller annotation, if you look at it is something called response body

annotation.

One of the important annotations which is present in restcontroller is response body.

What would happen when I put response body on a controller, is the response from that would be mapped

by a message convertor into some other format.

So here the message convertor which is going to be used is Jackson.

So dispatcher servlet would say, “OK! do the Jackson conversion. Do the conversion to JSON.”

It would actually convert Hello World bean, whatever content is there in there.

It converts it into JSON and sends the response back. The hello world bean request goes to a dispatcher

servlet, dispatcher servlet finds the hello world controller, the specific method hello world bean. It calls

it, gets the bean, invoke the conversion on it, converts it into JSON and returns the response back.

Whether you're working with web applications or with spring rest services, dispatcher servlet plays a

key role.

We will further discuss about dispatcher servlet when we talk about other things like security. In this

step, we tried to take a quick look at the world behind this hello world controller. We looked at dispatcher servlet

and how it controls the entire flow.

Also, we looked at some of the things which are configured by default by spring boot auto configuration

![](https://github.com/abhinavkorpal/microservices/blob/master/images/sping_logs.png)
