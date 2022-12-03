Feature: Book a doctor by completing information

  Scenario: User can book a doctor
    Given User in the home page and choose the the speciality, city, area
    When User click on search
    Then Assert that the search process is successfully completed