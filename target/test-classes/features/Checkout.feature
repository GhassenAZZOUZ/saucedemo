
Feature: Checkout Process
  Scenario: Complete checkout
    Given I open the browser
    And I login
    When I add products
    And I checkout
    Then I see confirmation
