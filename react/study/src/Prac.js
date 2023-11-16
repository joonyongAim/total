import { useState } from "react";

const Prac = () => {
  const [person, setPerson] = useState({
    name : '',
    gender : '',
    birth : '',
    info : ''
  });

  const changeHanlder = (e) => {
    // let copy = {...person};
    // copy[e.target.name] = e.target.value;
    // setPerson(copy);
    setPerson({
      ...person,
      [e.target.name] : e.target.value
    })
  }

  console.log('재런더링 되나?');
  console.log(person);
  return (
    <div>
      <h1>상태 연습용 컴포넌트</h1>
      <input name="name" type="text" onChange={changeHanlder}/><br/>
      <select name="gender" onChange={changeHanlder}>
        <option>남자</option>
        <option>여자</option>
      </select><br/>
      <input name="birth" type="date" onChange={changeHanlder}/><br/>
      <textarea name="info" onChange={changeHanlder}></textarea><br/>
    </div>
  );
}

export default Prac;