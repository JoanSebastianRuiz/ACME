<div align="center">
  <a href="">
    <img src="">
  </a>
<h1 text-align="center">Acme Business Complex Access Control</h1>
</div>
  
## Table of Contents 🔗
1. [General Information](#general-information-)
2. [Requirements](#requirements-)
3. [System Requirements](#system-requirements-)
4. [Installation and Configuration](#installation-and-configuration-)
5. [Database Model](#database-model-%EF%B8%8F)
6. [Class Structure](#class-structure-)

## General Information 📒

**Acme Business Complex Access Control** is a program developed in Java to record access to a business complex.

For the development of this project, the following technologies were used:

- **MySQL**

- **IntelliJ**

- **Apache NetBeans**

- **StarUML**

## Requirements 📌

Some of the requirements our project addresses are:

### Register and Manage the Entry and Exit of Workers and Guests:

    Record the access of workers and guests to ensure the security of the business complex.

### Register Operations:

    Record who, when, and what for each operation, such as granting access to a guest.

### Generate User Reports:

    Generate reports on system users and those requesting access.

### User-friendly and Efficient Interface:

    A user-friendly design ensures the interface is convenient for users.

## System Requirements 📋

- MySQL version 8.0
- MySQL Workbench Client
or
- DBeaver Client
- JDK 17
- Apache NetBeans

## Installation and Configuration 📦
```bash
git clone https://github.com/JoanSebastianRuiz/ACME.git
```
**Using MySQL Workbench Client or DBeaver Client:**

1. Navigate to the **Database** folder.  
2. Execute the `ddl.sql` file.  
3. Execute the `dml.sql` file.  

**Using Apache NetBeans:**

4. Open the **ProjectACME** folder.  
5. Install the libraries from the **lib** package.  
6. Run the `main` file.  


## Database Model 🗃️

<img src="readmeFiles/AcmeDatabaseModel.png">


## Class Structure ☕

## General Structure For Users
<img src="readmeFiles/AcmeClassDiagram1.png">

## General Structure Of Packages
<img src="readmeFiles/AcmeClassDiagram2.png">

## Dao Structure
<img src="readmeFiles/AcmeClassDiagram3.png">

## Controller And Views
<img src="readmeFiles/AcmeClassDiagram4.png">

## Events
<img src="readmeFiles/AcmeClassDiagram5.png">

## Util
<img src="readmeFiles/AcmeClassDiagram6.png">

## Factory
<img src="readmeFiles/AcmeClassDiagram7.png">

## Authors 🪶

### Juan José Torres Becerra

## [JuanJTorresB](https://github.com/JuanJTorresB)

### Joan Sebastian Ruiz Angarita

## [JoanSebastianRuiz](https://github.com/JoanSebastianRuiz)

### Joan Sebastian Santos Mosquera

## [RaitonOwO](https://github.com/RaitonOwO)