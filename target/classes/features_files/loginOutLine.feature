@loginOutLine
Feature: Je souhaite me connecte avec plusieurs comptes a lapplication SWAGLABS

  Scenario Outline: Je souhaite me connecte avec plusieurs comptes a lapplication SWAGLABS
    Given Je me connecte sur lapplication SWAGLABS
    When Je saisi le username "<username>"
    When Je saisi le mot de passe "<motdepasse>"
    When Je clique sur le bouton login

    Examples: 
      | username                | motdepasse |              |
      | standard_user           |            | secret_sauce |
      | locked_out_user         |            | secret_sauce |
      | problem_user            |            | secret_sauce |
      | performance_glitch_user |            | secret_sauce |
      | error_user              |            | secret_sauce |
      | visual_user             |            | secret_sauce |
