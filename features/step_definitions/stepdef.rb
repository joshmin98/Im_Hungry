Given("I am on the Home Page") do
  visit('http://localhost:3000')
end

Given("I have entered a search query {string}") do |string|
  fill_in 'search', with: string
end

Given("{int} for the number of results to be displayed") do |int|
  fill_in 'numResults', with: int
end

Given("I clicked the {string} button") do |string|
  click_on(string)
end

Given("I am on Results page") do
  sleep(2)
  expect(page).to have_current_path('/search')
end

Given("I clicked the {string} link") do |string|
  click_on(string)
end

Given("I am on Recipe page") do
  expect(page).to have_current_path('/recipe/')
end

Then("I see Title") do
  expect(page).to have_content('h1')
end

Then("I see picture") do
  expect(page).to have_content('img')
end

Then("I see prep time") do
  expect(page).to have_content('#prepTime')
end

Then("I see cook time") do
  expect(page).to have_content('#cookTime')
end