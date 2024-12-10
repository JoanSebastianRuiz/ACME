DROP DATABASE IF EXISTS acme;
CREATE DATABASE acme;
USE acme;

CREATE TABLE Company(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) UNIQUE NOT NULL,
    phone CHAR(10) NOT NULL UNIQUE
);

CREATE TABLE Individual(
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    role ENUM("worker", "guest") NOT NULL,
    state ENUM("active", "inactive") NOT NULL,
    idCompany INT NOT NULL,
    phone CHAR(10) NOT NULL UNIQUE,
    emailAddress VARCHAR(100) NOT NULL UNIQUE,
    FOREIGN KEY(idCompany) REFERENCES Company(id)
);

CREATE TABLE User(
    id VARCHAR(10) PRIMARY KEY NOT NULL,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    role ENUM("sudo", "manager", "officer", "security guard") NOT NULL,
    state ENUM("active", "inactive") NOT NULL,
    idCompany INT NULL,
    FOREIGN KEY(idCompany) REFERENCES Company(id)
);

CREATE TABLE AccessLog(
    id INT PRIMARY KEY AUTO_INCREMENT,
    type ENUM("entry", "exit") NOT NULL,
    datetime DATETIME NOT NULL,
    idIndividual VARCHAR(10) NOT NULL,
    idUser VARCHAR(10) NOT NULL,
    FOREIGN KEY(idIndividual) REFERENCES Individual(id),
    FOREIGN KEY(idUser) REFERENCES User(id)
);

CREATE TABLE Annotation(
    id INT PRIMARY KEY AUTO_INCREMENT,
    datetime DATETIME NOT NULL,
    suspended BOOLEAN NOT NULL, 
    reason TEXT(500) NOT NULL,
    idIndividual VARCHAR(10) NOT NULL,
    idUser VARCHAR(10) NOT NULL,
    state ENUM("active", "inactive") NOT NULL,
    FOREIGN KEY(idIndividual) REFERENCES Individual(id),
    FOREIGN KEY(idUser) REFERENCES User(id)
);

CREATE TABLE Vehicle(
    plate VARCHAR(6) PRIMARY KEY,
    type ENUM("car", "motorcycle") NOT NULL,
    idIndividual VARCHAR(10) NOT NULL,
    FOREIGN KEY(idIndividual) REFERENCES Individual(id)
);

CREATE TABLE Justification(
    id INT PRIMARY KEY AUTO_INCREMENT,
    datetime DATETIME NOT NULL,
    reason TEXT(500) NOT NULL,
    idUser VARCHAR(10) NOT NULL,
    idAnnotation INT NOT NULL,
    FOREIGN KEY(idAnnotation) REFERENCES Annotation(id),
    FOREIGN KEY(idUser) REFERENCES User(id)
);