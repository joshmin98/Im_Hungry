Feature: Requirement 1

Scenario: Search for food
  Given I am on the homepage
  Then I will search for "burger"
  Then I should see "burger"