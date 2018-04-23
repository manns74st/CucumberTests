
Feature: As an user
  I want to search google

  @tag1
  Scenario: Google Search
    Given the url of the webpage
    And Enter keywords for search
    When Given Enter
        Then Should search the keywords

  