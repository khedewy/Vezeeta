Feature: Login
  User can log in

  Scenario Outline: User can login with valid email and valid password
    Given  user in the home page and click login
    When  user enter valid "<email>" ,"<password>" and click login
    And assert that the user login successfully
    Then click logout
   Examples:
   |email||password|
   |mahmoud111@gmail.com||m01205456797|
  Scenario Outline: User login with invalid email and valid password
   Given user in the home page and click login Button
   When user enter invalid "<email>", and valid "<password>" and click log
   Then assert that the app shows error message

   Examples:
   |email||password|
   |mmm@gmail.com||m01205456797|
