CREATE DATABASE IF NOT EXISTS APPLICATION_DB;

USE APPLICATION_DB;

CREATE TABLE note (
	id int NOT NULL AUTO_INCREMENT,
    note varchar(200),
    PRIMARY KEY (ID)
);

insert into note (note) values ('First note');
