
Feature: Checkout Process
  Scenario: Complete checkout
    Given I open the browser
    And Je me connecte
    When J'ajoute deux articles au panier
    And Je vérifie le panier
    And I checkout
    Then I see confirmation
