import React, { useState } from "react";
import { withRouter } from "react-router-dom";
import styled from "styled-components";

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

  const sendQuery = () => {
    let recipePromise = fetch(
      `${url_prefix}/RecipeServlet?query=${searchQuery}&numResults=${numResults}`
    );
    let restaurantPromise = fetch(
      `${url_prefix}/RestaurantServlet?query=${searchQuery}&numResults=${numResults}`
    );

    recipePromise
      .then(resp => resp.json())
      .then(data => {
        localStorage.setItem("recipes", JSON.stringify(data));
        console.log(
          "Restaurants:",
          JSON.parse(localStorage.getItem("recipes"))
        );
      });

    restaurantPromise
      .then(resp => resp.json())
      .then(data => {
        localStorage.setItem("restaurants", JSON.stringify(data.businesses));
        console.log(
          "Recipes:",
          JSON.parse(localStorage.getItem("restaurants"))
        );
      });

    // {restaurant: true, id: xxx}
    if (localStorage.getItem("Favorites") == null) {
      localStorage.setItem("Favorites", JSON.stringify([]));
      console.log("created favorites");
    }
    if (localStorage.getItem("To Explore") == null) {
      localStorage.setItem("To Explore", JSON.stringify([]));
      console.log("created to explore");
    }
    if (localStorage.getItem("Do Not Show") == null) {
      localStorage.setItem("Do Not Show", JSON.stringify([]));
      console.log("created do not show");
    }
    // TODO: Search
    alert("wait!");
    props.history.push("/search");
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
    </PageLayout>
  );
};

export default withRouter(HomePage);
