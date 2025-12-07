
Feature: Validation panier
  Scenario: Validation panier à 2 produits
    Given I open the browser
    And Je me connecte
    When J'ajoute deux articles au panier
    And Je vérifie le panier
    And Je renseigne mes informations
    And Je valide le panier
    Then Le message de confirmation est affiché
