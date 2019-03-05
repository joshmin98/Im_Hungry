import React, { useEffect, useState } from "react";

export default props => {
  const [restaurants, setRestaurants] = useState([]);
  const [recipes, setRecipes] = useState([]);

  useEffect(() => {
    setRestaurants(JSON.parse(localStorage.getItem("restaurants")));
    setRecipes(JSON.parse(localStorage.getItem("recipes")));
    console.log("Restaurants", restaurants);
    console.log("Recipes", recipes);
  }, []);

  return (
    <div>
      <h1>Search Results</h1>
    </div>
  );
};
