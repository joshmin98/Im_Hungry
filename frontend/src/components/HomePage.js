import React, { useState, useEffect } from "react";
import styled from "styled-components";

const PageLayout = styled.div`
  background-color: #f5f5f5;
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

export default props => {
  const [searchQuery, setSearchQuery] = useState("");
  const [numResults, setNumResults] = useState(5);

  const sendQuery = () => {
    // Do fetch here
    console.log(searchQuery, numResults);
    alert(`query: ${searchQuery}, num results: ${numResults}`);
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
