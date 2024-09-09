import logo from "./logo.svg";
import "./App.css";
import { useState } from "react";

function App() {
  const [state, setState] = useState({ color: "red", name: "", log: [] });
  const onChangeHandler = (e) => {
    // console.log(e.target);
    const { name, value } = e.target;
    if (name === "name")
      return setState({ ...state, [name]: value, log: [...state.log, value] });
    setState({ ...state, [name]: value });
  };
  console.log(state);

  return (
    <div className="App">
      <input type="color" onChange={onChangeHandler} />
      <div
        style={{
          width: "100px",
          height: "100px",
          backgroundColor: state.color,
        }}
      />
      <input name="name" onChange={onChangeHandler} value={state.name} />
      {state.log.map((value, index, arr) => (
        <div> {value}</div>
      ))}
    </div>
  );
}

export default App;
