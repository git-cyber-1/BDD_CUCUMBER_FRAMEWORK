Feature: ShopperStackLogin

  Scenario: validate shopper can login using valid credentials
    Given Browser is open and URL navigated
    And shopper login is displayed
    When user enters "shopperkumar@gmail.com" and "Shopper@3770"
    And clicks on Login button
    Then shopper should be sucessfully logged in
    And Close Browser

  Scenario: validate merchant can login using valid credentials
    Given Browser is open and URL navigated
    And merchant login is displayed
    When user enters "girija37701@gmail.com" and "Girija@3770"
    And clicks on Login button
    Then merchant should be sucessfully logged in
    And Close Browser

  Scenario: validate admin can login using valid credentials
    Given Browser is open and URL navigated
    And admin login is displayed
    When user enters valid "qa_testadmindell@gmail.com" and "password@123"
    And clicks on Login button
    Then admin should be sucessfully logged in
    And Close Browser
