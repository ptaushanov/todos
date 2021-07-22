CREATE DATABASE IF NOT EXISTS todo_project;

USE todo_project;

DROP TABLE IF EXISTS user;
CREATE TABLE user (
	id INT NOT NULL AUTO_INCREMENT,
	email VARCHAR(255) NOT NULL UNIQUE,
	password varchar(255) NOT NULL,
    PRIMARY KEY ( id )
);

DROP TABLE IF EXISTS task;
CREATE TABLE task (
	id INT NOT NULL AUTO_INCREMENT,
	user_id INT NOT NULL,
	subject NVARCHAR(255) NOT NULL,
	content TEXT,
	priority ENUM('Low', 'Medium', 'High') NOT NULL DEFAULT 'Medium',
    due_date DATETIME,
    PRIMARY KEY ( id ),
    CONSTRAINT FOREIGN KEY `user_id_fk` (user_id) REFERENCES user(id)
    ON DELETE CASCADE ON UPDATE CASCADE
);