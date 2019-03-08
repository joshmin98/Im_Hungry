import React, { useEffect, useState, useContext } from "react";
import { withRouter, Link } from "react-router-dom";
import styled from "styled-components";
import ButtonGroup from "./sub-components/ButtonGroup";

// TODO: Do not show
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

const PhotoBox = styled.div`
  position: relative;
  width: 100%;
  height: 40%;
  padding: 40%;
`;

const Photo = styled.img`
  position: absolute;
  width: 200px;
  top: ${props => props.top}%;
  left: ${props => props.left}%;
  transform: rotate(${props => props.rot}deg);
`;


let SearchPage = props => {
  const [restaurants, setRestaurants] = useState([{}]);
  const [recipes, setRecipes] = useState({ results: [{}] });
  const [query, setQuery] = useState("");
  const [selectedList, setSelectedList] = useState("");
  const [loading, setLoading] = useState(true);
  const [recipeOffset, setRecipeOffset] = useState(0);
  const [restaurantOffset, setRestaurantOffset] = useState(0);
  const [driveTimes, setDriveTimes] = useState([]);

    let fetchDrivetime =  (to, idx) => {
        return fetch(
            `http://www.mapquestapi.com/directions/v2/route?key=M0uBDKuMB2ap4E5dt1gMTkXqj7eYeAgc&from=USC,Los Angeles,CA&to=${
            to.address1
    },${to.city},${to.state}`
        ).then(resp => resp.json()).then(data => {
            let update = driveTimes;
            update[idx] = data.route.formattedTime;
            setDriveTimes(update);
        });
    };

  useEffect(() => {
    let localStorageRecipes = JSON.parse(localStorage.getItem("searchRecipes"));
    let localStorageRestaurants = JSON.parse(
      localStorage.getItem("searchRestaurants")
    );
    let restaurantIndex = parseInt(localStorage.getItem("restaurantIndex"));
    let recipeIndex = parseInt(localStorage.getItem("recipeIndex"));
    setRestaurants(localStorageRestaurants);
    setRestaurantOffset(restaurantIndex);
    setRecipes(localStorageRecipes);
    setRecipeOffset(recipeIndex);
    setQuery(localStorage.getItem("query"));
    setDriveTimes(new Array(restaurants.length));
    setLoading(false);
  }, []);

  let results = loading ? (
    <div>Loading...</div>
  ) : (
    <Container>
      {console.log(restaurants)}
      {console.log(recipes)}
      <HeadingLayout>
        <h1>Search Results for {query}</h1>
        <NavLayout>
          <NavSelect
            onChange={event => setSelectedList(event.target.value)}
            id="lists"
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

      <PhotoBox id="collage">
        {recipes.results.map((recipe, idx) => {
          return (
            <Photo
              key={"recipe-photo-" + idx}
                id={`recipe-photo-${idx}`}
              left={Math.random() * (idx + 25)}
              top={Math.random() * (idx + 25)}
              rot={Math.random() * (idx + 30)}
              src={recipe.image}
            />
          );
        })}
        {restaurants.map((restaurant, idx) => {
            console.log(restaurant);
          return (
            <Photo
              key={"restaurant-photo-" + idx}
              id={`restaurant-photo-${idx}`}
              left={Math.random() * (idx + 25)}
              top={Math.random() * (idx + 25)}
              rot={-Math.random() * (idx + 30)}
              src={restaurant.image_url}
            />
          );
        })}
      </PhotoBox>

      <ColumnLayout>
        <div id="restaurant-list">
          <h2>Restaurants</h2>
          {restaurants.map((restaurant, idx) => {
            let isDark =
              restaurants.length % 2 === 0 ? idx % 2 === 0 : idx % 2 !== 0;
              let driveTime = fetchDrivetime(restaurant.location, idx);
              console.log(driveTimes);

            return (
              <Link
                to={`/restaurant/${idx + restaurantOffset}`}
                key={`restaurant-${idx}`}
                id={`restaurant-${idx}`}
              >
                <ItemLayout dark={isDark}>
                  <RestaurantItemLayout>
                    <h2>{restaurant.name}</h2>
                    <p>Drive: {driveTimes[idx]}</p>
                  </RestaurantItemLayout>
                  <h2>{restaurant.price}</h2>
                </ItemLayout>
              </Link>
            );
          })}
        </div>
        <div id="recipe-list">
          <h2>Recipes</h2>
          {recipes.results.map((recipe, idx) => {
            let isDark =
              restaurants.length % 2 === 0 ? idx % 2 === 0 : idx % 2 !== 0;
            return (
              <Link to={`/recipe/${idx + recipeOffset}`} key={`recipe-${idx}`} id={`recipe-${idx}`}>
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
  return results;
};

export default withRouter(SearchPage);
