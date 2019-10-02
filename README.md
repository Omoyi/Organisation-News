# News Portals

## Author

*Uwimana Rachel*

## Description

This is an app on which workers of the same company can post different news, from various departments in which their in.
 
### Technologies used

* JAVA 
* HTML
* CSS and (BOOTSTRAP)
* Spark (Java framework)
* Junit
* Postgres SQL (Database)

## contacts

**urakhel7@gmail.com**

## Installation tips/ Setup instruction

* Install postgresSQL
* write psql in your terminal 
* CREATE DATABASE news_portal;
* CREATE TABLE userTable(id SERIAL PRIMARY KEY, name VARCHAR, post VARCHAR, role VARCHAR);
* CREATE TABLE newsTable(id SERIAL PRIMARY KEY, content VARCHAR, header VARCHAR, deptInfId INTEGER, createDate BIGINT);
* CREATE TABLE departTable(id SERIAL PRIMARY KEY,name VARCHAR,description VARCHAR,nbremployees INTEGER);
* CREATE TABLE usertable_department (id SERIAL PRIMARY KEY,deptInfId INTEGER,userInfoId INTEGER);
* CREATE TABLE department_news (id SERIAL PRIMARY KEY,deptInfId INTEGER, newsId INTEGER);

## A Little bit about how my project looks like

![Homepage](src/main/resources/)
![Add animals](src/main/resources)
  