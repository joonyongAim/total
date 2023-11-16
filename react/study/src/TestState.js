import { useState } from "react";

const Child = (props) => {
  console.log('자식컴포넌트임');

  return (
    <div>자식컴포넌트
      <p>{props.number}</p>
      <button onClick={() => {
        props.setNumber(props.number - 1);
      }}>자식버튼</button>
    </div>
  );
}

const TestState = () => {
  const [number, setNumber] = useState(0);
  console.log(number);
  return (
    <div>
      <h1>state 확인 컴포넌트</h1>
      <h2>{number}</h2>
      <button onClick={() => {
        setNumber(number + 1);
      }}>증가</button>
      <Child number={number} setNumber={setNumber} />
    </div>
  );
}

export default TestState;