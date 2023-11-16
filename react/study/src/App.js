import logo from './logo.svg';
import './App.css';
import Footer from './Footer.js';
import Body from './Body';
import Event from './Event';
import TestState from './TestState';
import Prac from './Prac';
import Info from './Info';

const Header = ({person, number}) => {
  console.log('person', person);
  console.log('number', number);

  const {name, age} = person;

  console.log('name', name);
  console.log('age', age);

  return (
    <header>
      <h1>Header영역</h1>
      <h4></h4>
      <h4></h4>
    </header>
  );
};

Header.defaultProps = {
  number : 100
}

function App() {
  const person = {
    name : '고길동',
    age : 20
  };
  const number = 10;

  const clickEvent = () => {
    alert('app함수');
  }

  return (
    <div className="App">
      <Info />
      <Prac />
      <TestState />
      <Event clickEvent={clickEvent} />
      <Header person={person} />
      <h1>hello react</h1>
      <Body />
      <Footer />
    </div>
  );
}

export default App;
