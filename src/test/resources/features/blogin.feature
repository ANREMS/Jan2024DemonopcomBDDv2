@ALogin
  Feature: Login
  As a user I want to login in the application

  Scenario Template: Login
    Given I am on the landing page
    When I click on the login linktext
    And User fills the login form with valid data "<email>" "<password>"
    And I click on the Login button
    Then I should be on the home page


    Examples:
      |email            | password |
      | johndoe11@test.com | Johndoe |

