Feature:  Login

  Scenario Outline:  Login with data
    Given  Open the website and click the login link
    When  Enter the "<Username>""<Password>"provided
    And  Click login button
    Then Confirm the error message

    Examples:
    |Username|Password|
    |test@test.com|testingStuff|
