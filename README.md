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
