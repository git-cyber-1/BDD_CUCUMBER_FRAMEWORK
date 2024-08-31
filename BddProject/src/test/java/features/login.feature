Feature: Login

Scenario:verify user able to login using valid credentials
   
 Given Browser is open and URL is navigated
 And login page is displayed
 When user enters valid username and valid password
 And  user clicks on login button
 Then user should be sucessfully logged in 
 And browser should closed 
