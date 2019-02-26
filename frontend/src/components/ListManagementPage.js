import React, { useState, useEffect } from "react";

export default props => {
  useEffect(() => {
    alert("loaded");
  }, []);

  return (
    <div>
      <h1>Test</h1>
    </div>
  );
};
