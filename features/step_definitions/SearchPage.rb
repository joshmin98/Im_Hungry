Given("I am on the Search Page") do
  visit('http://localhost:3000')
end

Given("I have entered a search query {string}") do |string|
  fill_in 'Enter Food', with: string
end

Given("{int} for the number of results to be displayed") do |int|
  fill_in 'numResults', with: int
end

Given("I clicked the {string} button") do |string|
  click_on(string)
end

Given("I am on the Results Page") do
  sleep(2)
  expect(page).to have_current_path('/search')
end

Then("the page will have the title: Results for {string}") do |string|
  expect(page).to have_content(string)
end

Then("the page will have a collage of photos related to the search query") do
  pending # Write code here that turns the phrase above into concrete actions
end

Then("the page will have a dropdown box with the predefined lists") do
  pending # Write code here that turns the phrase above into concrete actions
end

Then("the page will have a button labeled {string}") do |string|
  pending # Write code here that turns the phrase above into concrete actions
end

Then("the page will have two columns of results titled: Restaurants, Recipes") do
  pending # Write code here that turns the phrase above into concrete actions
end

Then("the page will have at most {int} restaurant and recipe results in each column") do |int|
  pending # Write code here that turns the phrase above into concrete actions
end

Then("each restaurant item on the page will have an address, name, and minutes") do
  pending # Write code here that turns the phrase above into concrete actions
end

Then("each recipe item on the page will have a name, stars, prep time, and cook time") do
  pending # Write code here that turns the phrase above into concrete actions
end

When("I select {string} from the dropdown") do |string|
  select string
end

When("I click the {string} button") do |string|
  click_on string
end

Then("I will be on the {string} list page") do |string|
  sleep(1)
  expect(page).to have_current_path('/lists/' + string)
end

Then("I will be on the Search Page") do
  sleep(1)
  expect(page).to have_current_path('/')
end

When("I click on a restaurant with name {string}") do |string|
  click_on string
end

Then("I will be on the Restaurant Page of restaurant {string}") do |string|
  # TODO
  expect(page).to have_content(string)
end

When("I click on a recipe with name {string}") do |string|
  click_on string
end

Then("I will be on the Recipe Page of recipe {string}") do |string|
  # TODO
  expect(page).to have_content(string)
end

