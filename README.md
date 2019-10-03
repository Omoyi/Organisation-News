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

## Known bugs

Deployment on heroku is not working

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

![Homepage](src/main/resources/public/imag.png)
![Add animals](src/main/resources/public/image2.png)
![Add animals](src/main/resources/public/image1.png)
![Add animals](src/main/resources/public/image.png)
## LICENSE 

MIT License

Copyright (c) [2019] [Uwimana Rachel]

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
