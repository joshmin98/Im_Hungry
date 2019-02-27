import React, { useState, useEffect } from "react";
import { withRouter } from "react-router-dom";
import styled from "styled-components";

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
  background-color: ${props => (props.dark ? "grey" : "#f5f5f5")};
`;

let ListManagementPage = props => {
  const [loading, setLoading] = useState(true);

  const recipes = [{ title: "test1" }, { title: "test2" }, { title: "test3" }];

  useEffect(() => {
    setLoading(false);
  }, []);

  let results = loading ? (
    <p>Loading...</p>
  ) : (
    <div>
      <HeadingLayout>
        <h1>Favorites</h1>
        <NavLayout>
          <NavSelect>
            <option>Favorites</option>
            <option>To Explore</option>
            <option>Do Not Show</option>
          </NavSelect>
          <NavButton>Manage Lists</NavButton>
          <NavButton>Return to Results</NavButton>
          <NavButton>Return to Search</NavButton>
        </NavLayout>
      </HeadingLayout>
      {recipes.map((recipe, idx) => {
        return (
          <ItemLayout key={idx} dark={idx % 2 === 0}>
            <h2>{recipe.title}</h2>
            {console.log(idx)}
          </ItemLayout>
        );
      })}
    </div>
  );
  return results;
};

export default withRouter(ListManagementPage);
