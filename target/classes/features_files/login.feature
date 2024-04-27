@login
Feature: Test de la fonctionalite de l authentification de laplication SWAGLABS 
Antant que utilisateur je souhaite teste de la conexion de lapplication SWAGLABS 
Background:
  Given Je me connecte sur lapplication SWAGLABS
  @connexion-cas-passant
  Scenario: Je souhaite teste la page de connexion avec la cas passant
      When Je saisi le username "standard_user"
    And Je saisi le mot de passe "secret_sauce"
    And Je clique sur le bouton login
    Then je me rederige vers la page daccueil "Products"
 @connexion-cas-nonpassant
  Scenario: Je souhaite teste la page de connexion avec la cas passant
        When Je saisi le username "karima"
    And Je saisi le mot de passe "karima1234"
    And Je clique sur le bouton login
    Then Un message derreur saffiche "Epic sadface: Username and password do not match any user in this service"
    @login-config-file
    Scenario: Je souhaite teste la page de connexion avec la cas passant
      When Je saisi le username
    And Je saisi le mot de passe
    And Je clique sur le bouton login
    Then je me rederige vers la page daccueil "Products"
    