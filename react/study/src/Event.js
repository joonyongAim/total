function Event({clickEvent}) {

  const clickHandler = () => {
    alert('bye');
  }

  return (
    <div>
      <button onClick={(e) => {
        alert(e.target.innerText);
      }}>버튼</button>
      <button onClick={clickHandler}>버튼2</button>
      <button onClick={clickEvent}>App에서 만든 함수 실행</button>
    </div>
  );
}

export default Event;