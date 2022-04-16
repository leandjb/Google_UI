Feature: probar la busqueda en Google

  @Test
  Scenario: As a user enter a search criteria in google page
    Given i am Google Search Page
    When i enter search criteria
    And click on search button
    Then the results match with criteria