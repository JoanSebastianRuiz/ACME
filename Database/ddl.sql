DROP DATABASE IF EXISTS acme;
CREATE DATABASE acme;
USE acme;

CREATE TABLE Company(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) UNIQUE NOT NULL UNIQUE,
    phone CHAR(10) NOT NULL UNIQUE
);

CREATE TABLE AccessSubject(
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    phone CHAR(10) NOT NULL UNIQUE,
    emailAddress VARCHAR(100) NOT NULL UNIQUE,
    role ENUM("sudo", "manager", "officer", "securityGuard", "worker", "guest") NOT NULL,
    state ENUM("active", "inactive") NOT NULL,
    password VARCHAR(100) NULL,
    idCompany INT NULL,
    FOREIGN KEY(idCompany) REFERENCES Company(id)
);

CREATE TABLE Scanner(
    id INT PRIMARY KEY AUTO_INCREMENT,
    type ENUM("entry","exit")
);

CREATE TABLE AccessLog(
    id INT PRIMARY KEY AUTO_INCREMENT,
    type ENUM("entry", "exit") NOT NULL,
    datetime DATETIME NOT NULL,
    idAccessSubject VARCHAR(10) NOT NULL,
    idScanner INT NULL,
    idAccessSubjectLogger VARCHAR(10) NULL,
    FOREIGN KEY(idScanner) REFERENCES Scanner(id),
    FOREIGN KEY(idAccessSubject) REFERENCES AccessSubject(id),
    FOREIGN KEY(idAccessSubjectLogger) REFERENCES AccessSubject(id)
);

CREATE TABLE Annotation(
    id INT PRIMARY KEY AUTO_INCREMENT,
    datetime DATETIME NOT NULL,
    suspended BOOLEAN NOT NULL, 
    reason TEXT(500) NOT NULL,
    idAccessSubject VARCHAR(10) NOT NULL,
    idAccessSubjectLogger VARCHAR(10) NOT NULL,
    state ENUM("active", "inactive") NOT NULL,
    FOREIGN KEY(idAccessSubject) REFERENCES AccessSubject(id),
    FOREIGN KEY(idAccessSubjectLogger) REFERENCES AccessSubject(id)
);

CREATE TABLE Vehicle(
    plate VARCHAR(6) PRIMARY KEY,
    type ENUM("car", "motorcycle") NOT NULL,
    idAccessSubject VARCHAR(10) NOT NULL,
    FOREIGN KEY(idAccessSubject) REFERENCES AccessSubject(id)
);

CREATE TABLE Justification(
    id INT PRIMARY KEY AUTO_INCREMENT,
    datetime DATETIME NOT NULL,
    reason TEXT(500) NOT NULL,
    idAccessSubjectLogger VARCHAR(10) NOT NULL,
    idAnnotation INT NOT NULL UNIQUE,
    FOREIGN KEY(idAnnotation) REFERENCES Annotation(id),
    FOREIGN KEY(idAccessSubjectLogger) REFERENCES AccessSubject(id)
);