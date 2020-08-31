Feature: Checking the login functionality

  Scenario Outline: Validating the login functionality using valid credentials
    Given Browser is open
    And User is on login page
    When User enters valid <username> and <password>
    And User clicks on Login
    Then User is navigated to the home page

    Examples: 
      | username | password |
      | Sally    |    12345 |
      | Amro     |    12345 |
