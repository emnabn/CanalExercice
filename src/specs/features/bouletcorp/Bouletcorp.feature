 
 
  Feature: Verification des widgets - bouletcorp

  @bouletcore
  Scenario: Verification of Aleatoire page
    Given I am on bouletcorp Website
    When I click on Aleatoire button
    Then page is changed
    And widgets facebook, twitter et tumblr are displayed

  