Feature: data table;

Scenario: registration by using dataTable
     Given user is on the new registration page
     When  user enter invalid data on the page
     |fields          |values           |
     |Email address   |pzlvxq24@163.com |
     |First name      |dudu             |
     |Last name       |gu               |
     |Create password |123456           |
     |Confirm password|123456           |    
     Then  user registration should be unsuccess
     
   

