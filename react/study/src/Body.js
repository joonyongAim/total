import './Body.css';

const Body = () => {
  const obj = {
    name : '고길동',
    age : 20
  };

  if(obj.age >= 20) {
    return (
      <div className='body'>성인</div>
    );
  } else {
    return (
      <div>청소년</div>
    );
  }
}

export default Body;