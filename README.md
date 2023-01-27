# SocialNetwork
<h2>About Project</h2>
The project is designed to implement a simple social network which have function authorization, brows of news (posts), adding/editing/deleting posts or comments, search of posts with given criterias, work with autor profile and adding friends. The project has been done in the command of developers.

<h2>Technologies</h2>
The system uses Spring Boot technology to implement responses with GET, POST, PUT and DELETE requests.</br>
Storing, adding, deleting data is carried out using the PostgreSQL database management system.</br>
The search for news, people is carried out using specification jpa technology.</br>
The system uses Spring Security technology to authorize/logout a user, get the current user, configure cors, and more.</br>
Docker is used to package the application.

<h2>Start instructions</h2>
To run the project locally, you need to run the program in java for execution - run the main program:</br><b>impl/src/main/java/ru/skillbox/SocialNetworkApplication.java.</b> </br>
Run docker and load image from dockerHub:<b> docker pull andrei19386/myrepository:v.4.1.1.</b></br>
Run the docker container on port 8086:<b> docker run -d -p 8086:8086 andrei19386/myrepository:v.4.1.1</b> .</br>
Then open the browser and type into url line:<b> http://localhost:8086/</b>.</br>
