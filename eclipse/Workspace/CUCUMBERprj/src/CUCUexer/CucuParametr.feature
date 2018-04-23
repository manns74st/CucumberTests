
Feature: As an user
  I want to search google search

  
 Scenario Outline: Google search
    Given The <url> of the page
    When I check for the <keywords> in step
    Then give enter 
    
    Examples: 
      | url  | keywords |
      | https://www.google.co.in/ | Selenium |
      | https://www.google.co.in/ | WebDriver commands |
