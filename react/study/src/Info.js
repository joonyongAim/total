import { useState } from "react"
import Child from "./Child";

function Info() {
  const [person, setPerson] = useState({
    name : '',
    age : '',
    gender : ''
  });

  function changeHandler(e) {
    let value = e.target.value;
    let targetName = e.target.name;

    let copy = {...person};
    copy[targetName] = value;

    setPerson(copy);
  }

  return (
    <div>
      <h1>Info컴포넌트</h1>
      <input onChange={changeHandler} name="name" type="text" /><br/>
      <input onChange={changeHandler} value={person.age} name="age" type="number" /><br/>
      <select onChange={changeHandler} name="gender">
        <option>남</option>
        <option>여</option>
      </select>
      <div>
        이름 : {person.name}<br/>
        나이 : {person.age}<br/>
        성별 : {person.gender}
      </div>
      <Child person={person} setPerson={setPerson} />
    </div>
  );
}


export default Info;


