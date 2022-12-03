Feature: contact us function
  User can use contact us function to contact with the website owner

 Scenario Outline: user use contact us service
    Given user in the home page and click on contact us button
    When  user enter his "<name>","<phone>","<email>","<comment>", amd click sendComment
    Then assert that the user used the service successfully

   Examples:
   |name||phone||email||comment|
   |mahmoud||01203445677||mmmqw@gmail.com||this nothing but a test automation project|