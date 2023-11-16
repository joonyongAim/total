const Child = (props) => {
  console.log(props.person.age);

  return (
    <div>
      <h1>Child컴포넌트</h1>
      {/* {
        props.person.age % 2 === 0 ? '짝수' : '홀수'
      }
      <button onClick={() => {
        let copy = {...props.person};
        copy.age = parseInt(copy.age) + 1;
        props.setPerson(copy);
      }}>버튼</button> */}
    </div>
  );
}

export default Child;