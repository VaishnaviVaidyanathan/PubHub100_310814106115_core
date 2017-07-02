`users`CREATE DATABASE bookapp_db;
USE bookapp_db;
DROP TABLE users;
CREATE TABLE users
(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(20) NOT NULL,
email_id VARCHAR(20) NOT NULL,
PASSWORD VARCHAR(20) NOT NULL,
active INT  DEFAULT 1,
UNIQUE(email_id)
);
INSERT INTO users(NAME,email_id,PASSWORD,active) VALUES ('jai','jai@gmail.com','jai',1);
INSERT INTO users(NAME,email_id,PASSWORD,active) VALUES('jisha','jisha@gmail.com','jisha',0);
INSERT INTO users(NAME,email_id,PASSWORD,active)VALUES('diya','diya@gmail.com','diya',1);
UPDATE  users SET active=1 WHERE id=2;
SELECT NAME,email_id,PASSWORD,active FROM users;
CREATE TABLE books
(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(20) NOT NULL,
price INT NOT NULL
);
INSERT INTO books(NAME,price) VALUES('Java7',700);
INSERT INTO books(NAME,price) VALUES('c',500);
INSERT INTO books (NAME,price)VALUES('php',750);
select NAME,price from books

