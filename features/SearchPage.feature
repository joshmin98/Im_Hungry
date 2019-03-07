Feature: Results Page

Background:
  Given a search query "burger"
  And 5 for the number of results to be displayed

Scenario:
  Given I am on the Results Page
  Then the page will have the title: Results for "burger"
  And the page will have a collage of photos related to the search query
  And the page will have a dropdown box with the predefined lists
  And the page will have a button labeled "Manage List"
  And the page will have two columns of results titled: Restaurants, Recipes
  And the page will have at most 5 restaurant and recipe results in each column
  And each restaurant item on the page will have an address, name, and minutes
  And each recipe item on the page will have a name, stars, prep time, and cook time

Scenario:
  Given I am on the Results Page
  When I select "Favorites" from the dropdown
  And I click the "Manage List" button
  Then I will be on the "Favorites" list page

Scenario:
  Given I am on the Results Page
  When I click the "Return to Search Page" button
  Then I will be on the Search Page

