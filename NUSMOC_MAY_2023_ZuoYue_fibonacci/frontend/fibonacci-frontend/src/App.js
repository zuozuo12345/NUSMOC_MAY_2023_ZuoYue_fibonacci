

import React, { useState } from "react";
import axios from "axios";
import "./App.css";

function App() {
  const [inputNumber, setInputNumber] = useState("");
  const [fibonacciResult, setFibonacciResult] = useState("");
  const [sortedResult, setSortedResult] = useState("");
  const [errorMsg, setErrorMsg] = useState("");


    const handleInputNumberChange = (event) => {
    const number = event.target.value;
        setFibonacciResult(null);
        setSortedResult(null);
    if (number < 1 || number > 100) {
        setErrorMsg("Please input a number between 1 and 100.");
    } else {
        setErrorMsg("");
    }
    setInputNumber(number);
    };

    const handleCalculateClick = async (e) => {
        e.preventDefault();
        try {
            const response = await axios.get(`/fibonacci?elements=${inputNumber}`);
            console.log(response.data)
            setFibonacciResult(response.data.fibonacci.join(","));
            setSortedResult(response.data.sorted.join(","));

        } catch (error) {
            console.log(error);
        }
    };

  return (
      <div className="App">
        <h1>Fibonacci Calculator</h1>
        <label>
          Enter a number in [1, 100]:
          <input type="number" value={inputNumber} onChange={handleInputNumberChange} min="1"
                 max="100"/>
        </label>
        <button onClick={handleCalculateClick}>Calculate Fibonacci Array</button>
          {errorMsg && <p className="error">{errorMsg}</p>}
        {fibonacciResult && (
            <p>
              The Fibonacci result for {inputNumber} is [ {fibonacciResult} ]
            </p>

        )}
          {sortedResult && (
              <p>
                  The Fibonacci sorted result for {inputNumber} is [ {sortedResult} ]
              </p>

          )}
      </div>
  );
}

export default App;
