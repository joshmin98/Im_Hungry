import React, { Component } from "react";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

import HomePage from "./components/HomePage";
import ListManagementPage from "./components/ListManagementPage";

class App extends Component {
  render() {
    return (
      <div className="App">
        <Router>
          <>
            <Route exact path="/" component={HomePage} />
            <Route path="/lists" component={ListManagementPage} />
          </>
        </Router>
      </div>
    );
  }
}

export default App;
