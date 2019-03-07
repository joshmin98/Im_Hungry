Given("that I am on the homepage") do
  visit("http://localhost:3000")
end

When("I enter {string} into the text box labeled: Enter Food") do |string|
  find('search').set(string)
end

When("I enter a number greater than or equal to {int} into the text box with a default value of {int}") do |int, int2|
  find('numResults').set(int2)
end

When("I click the button with the label: Feed Me!") do
  click_on('Feed Me!')
end

Then("I will transition to the Results Page") do
  pending # Write code here that turns the phrase above into concrete actions
end
