import React, { useEffect, useState } from "react";
import { withRouter, Link } from "react-router-dom";
import styled from "styled-components";
import ButtonGroup from "./sub-components/ButtonGroup";

let Container = styled.div`
  padding-left: 10px;
  padding-right: 10px;
`;

let ColumnLayout = styled.div`
  display: grid;
  grid-template-columns: 6fr 6fr;
  grid-template-rows: 1fr 1fr;
  grid-gap: 20px;
`;

const ItemLayout = styled.div`
  display: flex;
  flex-direction: row;
  padding: 10px;
  align-items: flex-start;
  justify-content: space-between;
  background-color: ${props => (props.dark ? "grey" : "#f5f5f5")};
  height: 10%;
`;

const RestaurantItemLayout = styled.div`
  display: flex;
  flex-direction: column;
`;
const RecipeItemLayout = styled.div`
  display: flex;
  flex-direction: column;
`;

const HeadingLayout = styled.div`
  display: flex;
  flex-direction: row;
  align-items: flex-start;
  justify-content: space-between;
`;

const NavLayout = styled.div`
  width: 200px;
  display: flex;
  flex-direction: column;
`;

const NavSelect = styled.select`
  background-color: white;
  margin: 5px;
`;

const NavButton = styled.button`
  background-color: white;
  margin: 5px;
`;

let SearchPage = props => {
  const [restaurants, setRestaurants] = useState([{}]);
  const [recipes, setRecipes] = useState({ results: [{}] });
  const [selectedList, setSelectedList] = useState("");
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    let localStorageRecipes = JSON.parse(localStorage.getItem("recipes"));
    let localStorageRestaurants = JSON.parse(
      localStorage.getItem("restaurants")
    );
    setRestaurants(localStorageRestaurants);
    setRecipes(localStorageRecipes);
    setLoading(false);
  }, []);

  let results = <div>Loading...</div>;
  if (!loading) {
    results = (
      <Container>
        <HeadingLayout>
          <h1>Search Results for </h1>
          <NavLayout>
            <NavSelect
              onChange={event => setSelectedList(event.target.value)}
              defaultValue=""
            >
              <option value="" hidden="hidden" />
              <option>Favorites</option>
              <option>To Explore</option>
              <option>Do Not Show</option>
            </NavSelect>
            <NavButton
              onClick={() => {
                if (selectedList !== "") {
                  props.history.push(`/lists/${selectedList}`);
                }
              }}
            >
              Manage Lists
            </NavButton>
            <NavButton
              onClick={() => {
                props.history.push("/");
              }}
            >
              Return to Search
            </NavButton>
          </NavLayout>
        </HeadingLayout>
        <ColumnLayout>
          <div>
            <h2>Restaurants</h2>
            {restaurants.map((restaurant, idx) => {
              let isDark =
                restaurants.length % 2 === 0 ? idx % 2 === 0 : idx % 2 !== 0;
              return (
                <Link
                  to={`/restaurant/${restaurant.id}`}
                  key={`restaurant-${idx}`}
                >
                  <ItemLayout dark={isDark}>
                    <RestaurantItemLayout>
                      <h2>{restaurant.name}</h2>
                      <p>Drive: </p>
                      <p />
                    </RestaurantItemLayout>
                    <h2>{restaurant.price}</h2>
                  </ItemLayout>
                </Link>
              );
            })}
          </div>
          <div>
            <h2>Recipes</h2>
            {recipes.results.map((recipe, idx) => {
              let isDark =
                restaurants.length % 2 === 0 ? idx % 2 === 0 : idx % 2 !== 0;
              return (
                <Link to={`/recipe/${recipe.id}`} key={`recipe-${idx}`}>
                  <ItemLayout dark={isDark}>
                    <RecipeItemLayout>
                      <h2>{recipe.title}</h2>
                      <p>
                        Prep:{" "}
                        {recipe.preparationMinutes
                          ? recipe.preparationMinutes
                          : "?"}{" "}
                        minutes
                      </p>
                      <p>Cook: {recipe.readyInMinutes} minutes</p>
                    </RecipeItemLayout>
                    <h2>${recipe.pricePerServing / 100}</h2>
                  </ItemLayout>
                </Link>
              );
            })}
          </div>
        </ColumnLayout>
      </Container>
    );
  }
  return results;
};

export default withRouter(SearchPage);
