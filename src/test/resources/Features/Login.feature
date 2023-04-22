Feature: Login verification of medable application

  Scenario Outline: User try to login medable site with valid credentials
    Given user launch Chrome browser
    When User open url ""
    When User enter email as "" and password
    Then User able to login medable site app

    Examples: 
      | organisation    | username                   | password   | name     |
      | locpatch2_nopii | sthakur_pr+su@medable.com  | Qwerty@123 | username |
      | locpatch2_pii   | sthakur_pr+su1@medable.com | Qwerty@123 | email    |
