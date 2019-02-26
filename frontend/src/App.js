import React, { Component } from "react";
import logo from "./logo.svg";
import HomePage from "./components/HomePage";
import { BrowserRouter } from "react-router-dom";

class App extends Component {
  render() {
    return (
      <div className="App">
        <BrowserRouter>
          <HomePage />
        </BrowserRouter>
      </div>
    );
  }
}

export default App;
