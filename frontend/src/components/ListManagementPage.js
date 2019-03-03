import React, { useState, useEffect } from "react";
import { withRouter, Link } from "react-router-dom";
import styled from "styled-components";

/* Start page styling */
const HeadingLayout = styled.div`
  display: flex;
  flex-direction: row;
  padding: 10px;
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

const ItemLayout = styled.div`
  display: flex;
  flex-direction: row;
  padding: 10px;
  align-items: flex-start;
  justify-content: space-between;
  background-color: ${props => (props.dark ? "grey" : "#f5f5f5")};
`;

const RestaurantItemLayout = styled.div`
  display: flex;
  flex-direction: column;
`;
const RecipeItemLayout = styled.div`
  display: flex;
  flex-direction: column;
`;
/* End page styling */

let ListManagementPage = props => {
  /* Initialize page state */
  const [loading, setLoading] = useState(true);
  const [selectedList, setSelectedList] = useState("");
  const [recipes, setRecipes] = useState([]);
  const [restaurants, setRestaurants] = useState([]);

  /* Load data from localStorage */
  useEffect(() => {
    // setRecipes(localStorage.getItem());
    // setRestaurants(localStorage.getItem());
    setLoading(false);
  }, []);

  let results = loading ? (
    <p>Loading...</p>
  ) : (
    <div>
      <HeadingLayout>
        <h1>{props.match.params.list}</h1>
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
          <NavButton onClick={() => props.history.push("/search")}>
            Return to Results
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

      <button onClick={() => setRecipes([])}>TEST</button>

      {recipes.map((recipe, idx) => {
        return (
          <Link to={`/recipe/${recipe.id}`} key={"recipe" + idx}>
            <ItemLayout dark={idx % 2 === 0}>
              <RecipeItemLayout>
                <h2>{recipe.title}</h2>
                <p>Cook Time: {recipe.cookTime}</p>
                <p>Prep Time: {recipe.prepTime}</p>
              </RecipeItemLayout>
              <h2>${recipe.price}</h2>
            </ItemLayout>
          </Link>
        );
      })}
      {restaurants.map((restaurant, idx) => {
        let isDark = recipes.length % 2 === 0 ? idx % 2 === 0 : idx % 2 !== 0;
        return (
          <Link to={`/restaurant/${restaurant.id}`} key={"restaurant" + idx}>
            <ItemLayout dark={isDark}>
              <RestaurantItemLayout>
                <h2>{restaurant.title}</h2>
                <p>Drive Time: {restaurant.driveTime} mins</p>
              </RestaurantItemLayout>
              <h2>${restaurant.price}</h2>
            </ItemLayout>
          </Link>
        );
      })}
    </div>
  );
  return results;
};

export default withRouter(ListManagementPage);
