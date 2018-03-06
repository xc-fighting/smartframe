CREATE DATABASE test;
USE test;
CREATE TABLE customer(
   id int NOT NULL AUTO_INCREMENT,
    name varchar(255) DEFAULT NULL,
    contact varchar(255) DEFAULT NULL,
    telephone varchar(255) DEFAULT NULL,
    email varchar(255) DEFAULT NULL,
   remark text,
   PRIMARY KEY(id)
  )ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO customer VALUES('1','customer1','jack','135218947593','jackson@gmail.com',null);
INSERT INTO customer VALUES('2','customer2','mary','145215947593','maryrose@gmail.com',null);