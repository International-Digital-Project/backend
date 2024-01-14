<!DOCTYPE html>

<h1>Transport Managemant System - Planning & Flowing Control</h1>

<p>The Planning & Flowing control part is the main logic and middle part of an Transport Management System. It consists of taking bookings and generating a route as well as providing those routes to the drivers and delivering parcels to their destination.</p> 
<pre> 
<div class="container">
<div class="block two first"> 

<h3>Installation & Dependencies</h2> 
<div class="wrap">
In order to build this project and also use maven you need a JDK version. The version used was 11 You can download the version under <a href="JDK" href="https://www.oracle.com/java/technologies/downloads/"> JDK Page </a>.
Then download a maven version (used here was 3.9.5) and set them up. You can look it up in this tutorial  <a href="https://www.youtube.com/watch?v=km3tLti4TCM">Maven Tutorial on YouTube</a>

<h4>Docker</h4>
This application can be build in a docker container.
You need either Docker Desktop or the Docker plugin for Intellij.
To create the latest image use  docker build -t planning-flowingcontrol:latest -f Dockerfile .  
To pull the image from Docker Hub use docker pull planning-flowingcontrol:latest 
To run use docker run  <IMAGE>.
Docker compose will be added add a later time , when the database has been created to run the components together.

<h4>Spring boot Framework</h4>
[Details](https://spring.io/)

<h4>Postgres</h4>
[Details](https://jdbc.postgresql.org/download)

<h4>Apache Http Client</h4>
[Details](https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient)

<h4>Jackson</h4>
[Details](https://github.com/FasterXML/jackson)

<h4>Postgresql</4>
[Details](https://www.postgresql.org/docs/16/intro-whatis.html)

<h4>Hibernate</4>
[Details](https://hibernate.org/orm/)

<h4>Maven</4>
[Details](https://maven.apache.org/what-is-maven.html)


</pre>
