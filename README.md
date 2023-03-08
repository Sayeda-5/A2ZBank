ONLINE BANKING SYSTEM
-----------------------

~ I have developed this API for easy online banking system portal application. It performs fundademtal CURD operation of any banking application.
~This project is develped by me in the span of 5 days during construct week in Massai School.

 TECH STACK
 -----------------------
 - Java
 - Spring Boot
 - MySQL
 
 
 MODULES
 -----------------------
 - Log-in/Log-out
 - Admin Module
 - Customer  Module
 - Account Module
 - Transaction Module
 
 FEATURES
 -----------------------
  Admin and User authentication
  -----------------
<>Admin Feature<>
  - Administrate the entire application.
  - Admin can access and alter the details of all the users.
   ------------------------------------------------------
<>User Feature<>
  - Log in themselves.
  - Viewing trancastions.
  - User can access his Account only.

     TABLE SCHEMA
     
| Tables_in_bank     |
|    :-----:         |   
| Account            |
| AccountTransaction |
| Admin              |
| Branch             |
| Customer           |


       ACCOUNT

| Field   | Type        |
| :-----: | :--------:  |
| id      | int         |
| balance | double(9,1) |
| cardNo  | varchar(25) | 
| custID  | int         |
| date    | date        |                                                     
| pin     | int         | 
| status  | varchar(25) | 
| type    | varchar(25) | 


     AccountTransaction

| Field     | Type        |
| :-----:   | :--------:  |
| id        | int         |
| accountID | int         |
| toAccId   | int         |
| type      | varchar(25) |
| amount    | double(9,1) | 
| date      | date        | 


         ADMIN

| Field    | Type        |
| :-----:  | :--------:  |
| id       | int         | 
| password | varchar(25) | 
| userID   | varchar(25) | 


       BRANCH

| Field | Type        | 
| :----:| :--------:  |
| id    | int         | 
| city  | varchar(25) | 
| name  | varchar(25) |
| state | varchar(25) |


         Customer     

| Field     | Type        |
| :-----:   | :--------:  |
| id        | int         |
| branchID  | int         | 
| password  | varchar(25) |
| FirstName | varchar(25) | 
| LastName  | varchar(25) | 
| gender    | varchar(25) |
| Address   | varchar(45) | 
| Phone     | varchar(25) | 
| email     | varchar(45) |
| date      | date        |

---------------------

