import logo from './logo.svg';
import './App.css';
import { useDeferredValue, useState, useTransition } from 'react';

let a = Array(10000).fill(0);

function App() {
  const [data, setData] = useState('');
  const [isPending, startTransition] = useTransition();
  const deferredState = useDeferredValue(data);

  return (
    <div className="App">
     <input onChange={(e) => {
        setData(e.target.value);
     }} />
     {
      a.map(() => {
        return (
          <div>{deferredState}</div>
        )
      })
     }
    </div>
  );
}

export default App;
