Feature: Ask now function
  User can use ask now function to ask for any problem or any product

 Scenario Outline: User can use ask now function
    Given user scroll down to ask now and click ask now button
    When User select the specialty from
    And User enter "<title>","<question>","<age>" and complete his information
    And log by entering "<email>","<password>" and click log in
    Then assert that the question is sent

   Examples:
   |title||question||age||email||password|
   |this is a test||this nothing except a test automation project||21||mahmoud111@gmail.com||m01205456797|

