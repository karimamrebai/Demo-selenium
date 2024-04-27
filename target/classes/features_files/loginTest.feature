@loginTest
Feature: Je souhaite me connecte avec login valide et mot de passe valide sur lapplication SWAGLABS

  @connexion-cas-valide
  Scenario: Je souhaite me connecter avec login valide et mot de passe valide
    Given Je me connecte sur lapplication SWAGLABS
    When Je saisi le username "standard_user"
    And Je saisi le mot de passe "secret_sauce"
    And Je clique sur le bouton login
    And Je clique sur le burger
    And Je clique sur le Logout
    Then je me suis deconnecte de lapplication et jai atterri sur la page de connexion.