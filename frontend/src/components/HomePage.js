import React, { useState, useEffect } from "react";
import { withRouter } from "react-router-dom";
import styled from "styled-components";

import { HungryProvider, HungryConsumer } from "./Context";

const url_prefix = "http://localhost:9999";

const PageLayout = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
`;

const SearchLayout = styled.div`
  display: flex;
  flex-direction: row;
`;

const SearchInput = styled.input`
  background-color: white;
  margin: 5px;
`;

const SearchButton = styled.button`
  background-color: white;
  margin: 5px;
`;

let HomePage = props => {
  const [searchQuery, setSearchQuery] = useState("");
  const [numResults, setNumResults] = useState(5);
  const [loading, setLoading] = useState(false);

  const sendQuery = () => {
    if (numResults < 5) {
      alert("Results must be greater than 5!");
      return;
    }

    setLoading(true);

    fetch(
      `${url_prefix}/RecipeServlet?query=${searchQuery}&numResults=${numResults}`
    )
      .then(resp => resp.json())
      .then(data => {
        localStorage.setItem("searchRecipes", JSON.stringify(data));

        let recipes = JSON.parse(localStorage.getItem("recipes"));
        if (recipes == null) {
          recipes = localStorage.getItem("searchRecipes");
          localStorage.setItem("recipes", recipes);
        } else {
          let newRecipes = JSON.parse(localStorage.getItem("searchRecipes"));
          recipes = JSON.parse(localStorage.getItem("recipes"));
          recipes.results.push(...newRecipes.results);
          localStorage.setItem("recipes", JSON.stringify(recipes));
        }
      })
      .then(() => {
        fetch(
          `${url_prefix}/RestaurantServlet?query=${searchQuery}&numResults=${numResults}`
        )
          .then(resp => resp.json())
          .then(data => {
            localStorage.setItem(
              "searchRestaurants",
              JSON.stringify(data.businesses)
            );

            let restaurants = JSON.parse(localStorage.getItem("restaurants"));
            if (restaurants == null) {
              restaurants = localStorage.getItem("searchRestaurants");
              localStorage.setItem("restaurants", restaurants);
            } else {
              let newRestaurants = JSON.parse(
                localStorage.getItem("searchRestaurants")
              );
              restaurants = JSON.parse(localStorage.getItem("restaurants"));
              restaurants.push(...newRestaurants);
              localStorage.setItem("restaurants", JSON.stringify(restaurants));
            }
          });
      })
      .then(() => {
        // {restaurant: true, id: xxx}
        if (localStorage.getItem("Favorites") == null) {
          localStorage.setItem(
            "Favorites",
            JSON.stringify({
              recipes: [],
              restaurants: []
            })
          );
        }
        if (localStorage.getItem("To Explore") == null) {
          localStorage.setItem(
            "To Explore",
            JSON.stringify({
              recipes: [],
              restaurants: []
            })
          );
        }
        if (localStorage.getItem("Do Not Show") == null) {
          localStorage.setItem(
            "Do Not Show",
            JSON.stringify({
              recipes: [],
              restaurants: []
            })
          );
        }
      })
      .then(() => {
        localStorage.setItem("query", searchQuery);
        let restaurants = JSON.parse(localStorage.getItem("restaurants"));
        let recipes = JSON.parse(localStorage.getItem("recipes"));
        window.setTimeout(() => {
          props.history.push("/search");
        }, 1000);
      });
  };

  return (
    <PageLayout>
      <h1>I'm Hungry</h1>
      <SearchLayout>
        <SearchInput
          value={searchQuery}
          onChange={event => {
            setSearchQuery(event.target.value);
          }}
        />
        <SearchInput
          value={numResults}
          onChange={event => {
            setNumResults(event.target.value);
          }}
        />
        <SearchButton onClick={sendQuery}>I'm Hungry</SearchButton>
      </SearchLayout>
      {loading ? <p>Loading...</p> : null}
    </PageLayout>
  );
};

export default withRouter(HomePage);
