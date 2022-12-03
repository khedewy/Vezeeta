Feature: Change Country
  User can change the country

  Scenario: user can change to saudi Arabia
    Given user in the home page and click on country dropDown items to select country
    When user change to SaudiArabia
    Then  user check that it changed to SaudiArabia

  Scenario: User change to Jordan
    Given user in the hom page and click to change country
    When user change to Jordan
    Then assert that it changed to jordan

  Scenario: User change to Nigeria
    Given user in the home page and clicks on dropdown to select country
    When  usr change to Nigeria
    Then  assert that it changed to Nigeria
