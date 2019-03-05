import React, { Component } from "react";
import { BrowserRouter as Router, Route } from "react-router-dom";

import HomePage from "./components/HomePage";
import ListManagementPage from "./components/ListManagementPage";
import RestaurantPage from './components/RestaurantPage';
import RecipePage from './components/RecipePage';

class App extends Component {
  render() {
    return (
      <div className="App">
        <Router>
          <>
            <Route exact path="/" component={HomePage} />
            <Route path="/lists/:list" component={ListManagementPage} />
            <Route path="/restaurant" component={RestaurantPage} />
            <Route path="/recipe" component={RecipePage} />
          </>
        </Router>
      </div>
    );
  }
}

export default App;
