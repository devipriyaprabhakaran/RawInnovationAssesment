# RawInnovationAssesment
# Evernote_test
This repository contains a selenium-cucumber-java project and libraries that demostrate testing the Evernote login functionality using BDD framework cucumber with java as the programming language.It generates Junit reports in xml format.

## Pre-Requisites
- JDK
- Maven
- Eclipse
- Eclipse plugin for 
     -   Maven 
     -   Selenium
     -   Cucumber
- Chrome browser driver 

### Develop automation scripts using BDD approach - Cucumber Java
Tests are written in the cucumber framework using Gherkin syntax.

## Feature file to run the script

Feature: feature to test login functionality

  @unsuccessfullogin
  
  Scenario: check login is unscuccessful using invalid email
  
    Given User is on login page
    When User enters the invalid email address
    And User click continue button
    Then User should get that the notification that the email address is invalid

  @successfullogin
  
  Scenario: check login is scuccessful using valid account
  
    Given User is on login page
    When User enters the email address
    Then User clicks continue button
    And User enters password
    Then User clicks signin button
    And User create new note
    Then User writes note
    And User clicks account
    Then User clicks logout

  @Loginagain
  
  Scenario: Signin again and verify the saved note
  
    Given User is on signin page
    When User enter mail address and clicks continue
    Then User enter password and click signin
    And User verify note


## Dependencies to add in the pom.xml file
       - Cucumber-junit
       - Junit
       - Cucumber-java
       - Selenium-java
## Stepdefinition folder

   1) Inside the stepdefinition folder the main class and the test runner class is created. 
   
   2)In the main class the code was wriiten in Java program to test the  
   
     1) Unsuccessful login functionality for the page https://www.evernote.com/Login.action
     2) Successful login functionality for the page https://www.evernote.com/Login.action
     3) Write a note in the dashboard page followed by the logout
     4) Login again and verify the saved note is present or not
     
## To build the communication between Feauture file and Stepdefinition file, Test runner class is created.
      Options to add in a Testrunner class
           1) To run the cucumber @Runwith(cucumber.class) is usesd
           2) Then to build the communication @cucumberOptions(features="src/test/resources/Features",glue={"Stepdefinition"} is used.
           3) To display the output in color format monochrome=true is used
           4) To generate reports
              * To generate the report in xml format plugin= {"pretty", "junit:target/JUNITReports/report.xml"} is used
              * To generate the report in html format plugin= {"pretty", "html:target/HTMLReports/report.html"} is used
              * To generate the report in json format plugin= {"pretty", "json:target/JSONReports/report.json"} is used
           5) To run the seperate scenario tags are used. For example: tags={"@unscuccessful login"} is used

## In this project Page Objects and PageFactory are used.








