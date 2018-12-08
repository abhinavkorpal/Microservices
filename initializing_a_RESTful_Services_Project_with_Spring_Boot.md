we would set up a project using spring initialiser. We’d want to build our RESTful web services. 

What we’ll do is, we’ll use https://start.spring.io/ to initialize our spring project. 

We would want to generate a Maven project because Maven is the build tool

that we're going to use. Language is Java and we would want to use a Spring Boot version greater than 2.0.0

So, select anything which is greater than 2.0.0 snapshot.

The other things we want to specify is the group Id.

I would want to use the group Id com.rest.webservices

I would put an artifact restful-web-services. For any Maven project we’d

need to give a group Id and an artifact Id.

You can kind of compare this like a class name and package.

We would also want to add a few dependencies.

The way you can select the dependencies is by typing them in.

So, I would want to select a web. That’s this spring boot start web dependency.

We're going to build RESTFul web services.

And if you remember the things that spring boot starter web is

the starter for developing restful Web services.

It is also the starter for developing web applications.

Now I would want to also add in dev tools. Dev tools make it easy for developing application. So I’ll add tools in.

And I would want to use JPA at a later point in this course.

JPA and I would want to use H2 as in-memory database.

Let's add it in as well.

Once you do that, you can click generate project.

![](https://github.com/abhinavkorpal/microservices/blob/master/images/spring_initializer.png)

What Spring initialiser does is it would create a Maven project.

Put it in a zip and that’s what is downloaded to your downloads folder.

What I recommend you to do is to unzip the zip file to some folder on your hard disk.

Zip file is downloaded. You can take this,

unzip the file to some folder on your local hard disk and launch up Eclipse.

Once Eclipse lanches up,

You can import the project by using file, import, existing Maven projects and you can browse through

to the directory where you unzipped your zip file.

This is the root directory to which I unzipped my zip file too and I can see a pom dot xml coming

up with a RESTful web service. You can also use browse to browse through to your folder. 

what Maven does is, it would actually download all the dependencies which are listed in the pom dot xml.

And it would also set up the entire project for us.

If this is the first time you are using this specific version of spring boot because this downloads a

lot of Maven dependencies. What is happening in the background is the complete setup of our RESTful Web services

projects.

Once the project is set up, you’d see a folder structure like this.

![](https://github.com/abhinavkorpal/microservices/blob/master/images/eclipse_folder_structure.png)

This is typical Maven project structure. Source main Java, source main resources, source test Java

Source main Java contains all our Java code and there's not a lot in here right now.

We have source main resources with the properties file so there is application.properties which is the

spring boot properties file and we have the test which can be written down in source test java.

We also have a pom dot xml which contains the dependencies which we have chosen. The pom.xml contains

the dependencies starter data JPA,

starter web, dev tools, H2 and starter test. These four…the first four dependencies

are what we have chosen on the start.spring.io website. Web,

dev tools, JPA and H2.

That's what we chose and those were the dependencies which were in here.

And by default spring boot would add in…spring initialiser would add in a dependency on spring boot

starter test.

This is the one to write your unit test and integration test.

If you go and look at your Maven dependencies, you should see a lot of dependencies which are

coming in because of this starters we are using. Now that we have an overview of the project that we

are looking at,

let's start up the spring boot application class. Right click, run as Java application.

For now, what we wanted to check is if the application is launching up fine. 

You can see that there is a lot of log being generated and you would see by the end of the thing that

the Tomcat server has started up.

So you can see that Tomcat has started on ports 8080.

![](https://github.com/abhinavkorpal/microservices/blob/master/images/spring_app_launch.png)

There’s a lot of magic which is happening in the background.
