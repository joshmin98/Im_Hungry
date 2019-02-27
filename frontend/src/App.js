import React, { Component } from "react";
import { BrowserRouter as Router, Route } from "react-router-dom";

import HomePage from "./components/HomePage";
import ListManagementPage from "./components/ListManagementPage";

class App extends Component {
  render() {
    return (
      <div className="App">
        <Router>
          <>
            <Route exact path="/" component={HomePage} />
            <Route path="/lists/:list" component={ListManagementPage} />
            <Route path="/search" component={<div>TODO</div>} />
          </>
        </Router>
      </div>
    );
  }
}

export default App;
