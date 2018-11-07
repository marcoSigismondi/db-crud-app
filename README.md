# docker-cluster

## Description
This project is intended to show basic docker and docker-compose functionality.
It contains two folder:
* environment: in which are stored docker configurations
* source: in which is stored spring-boot app source code

The final environment is made by
* one container running mysql instance;
* one container running a Spring Boot application that read data from mysql container
* one Ubuntu based container with mysql client installed

The scope is to show functionality like:
* docker-compose utlity to run multiple containers at time;
* docker networking
* container isolation
* useful docker commands to inspect what is happening

To run the environment follow the step below:
* run mvn clean package -DskipTests into source folder
* copy generated jar files from source\target to environment\deployment folder
* open command line and move to environment folder
* run docker-compose build
* run docker-compose up
* open a browser and go to http://localhost:8080/notes

Useful command to inspect what is happening
* from a command line run docker container ls to list all docker running container with docker id
* docker exec -it [container_id] bash to connect to a container
* mysql -u admin -h mysql-docker-container -P 3306 -D APPLICATION_DB -p [after_requested_prompt_pass=admin] to access mysql DB from ubuntu container
