Feature: Login in Functionality Test

  Scenario Outline: Check For successful login with valid Credentials
    Given Browser is Open
    And User is on login page
    When user enters "<username>" and "<Password>"
    And clicks on Login button
    Then user is navigated to homepage
    Examples:
      | username | Password |
      | ABC      | 12345    |
      | DEF      | 12345    |



