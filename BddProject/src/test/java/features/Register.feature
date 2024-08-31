Feature:Register

Scenario:user should be able to register using valid credentials

Given Browser is open
And url is navigated to register page
When user enters valid credentials
And user clicks on register button
Then a new account should be created
And browser should close

 