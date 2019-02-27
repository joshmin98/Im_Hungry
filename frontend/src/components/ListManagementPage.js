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

  /* Start Testing data */
  const recipes = [
    { id: 1, title: "Recipe 1", prepTime: 3, cookTime: 20, price: 4.15 },
    { id: 2, title: "Recipe 2", prepTime: 4, cookTime: 22, price: 8.3 },
    { id: 3, title: "Recipe 3", prepTime: 5, cookTime: 24, price: 12.45 }
  ];
  const restaurants = [
    { id: 4, title: "Restaurant 1", driveTime: 20, price: 11.95 },
    { id: 5, title: "Restaurant 2", driveTime: 5, price: 5.95 },
    { id: 6, title: "Restaurant 3", driveTime: 30, price: 5.65 }
  ];
  /* End Testing Data */

  /* Load data from localStorage */
  useEffect(() => {
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
