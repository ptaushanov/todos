CREATE DATABASE todos;

USE todos;

# DROP TABLE IF EXISTS users;
CREATE TABLE users (
	id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

# DROP TABLE IF EXISTS task;
CREATE TABLE tasks (
	id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    description TEXT NULL,
    importance ENUM('ASAP', 'Verry High', 'High', 'Low', 'Verry low') NOT NULL,
    dueDate DATETIME NULL,
    
    CONSTRAINT FOREIGN KEY `task_fk` (user_id) REFERENCES users(id)
    ON DELETE CASCADE ON UPDATE CASCADE
);