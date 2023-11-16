import logo from './logo.svg';
import './App.css';
import data from './mockData';
import { Suspense, lazy, useEffect, useState } from 'react';
import { Link, Route, Routes } from 'react-router-dom';
import Header from './component/Header';
import Main from './component/Main';
// import Detail from './component/Detail';
// import About from './component/About';
import axios from 'axios';
// import Cart from './component/Cart';
import WatchedProduct from './component/WatchedProduct';

const Detail = lazy(() => import('./component/Detail'));
const About = lazy(() => import('./component/About'));
const Cart = lazy(() => import('./component/Cart'));

const URL = 'https://raw.githubusercontent.com/Naessss/study/main/fruit.json';

function App() {
  const [fruit, setFruit] = useState([]);

  useEffect(() => {
    axios.get(URL)
      .then((result) => {
        setFruit([...result.data]);
      })
      .catch((error) => {
        console.log(error);
      })
  }, [])

  useEffect(() => {
    localStorage.setItem('watched', JSON.stringify([]));
  }, [])

  return (
    <div className="App">
      <Header />
      <WatchedProduct fruit={fruit}/>
      <Suspense fallback={<div>로딩중</div>} >
        <Routes>
          <Route path='/' element={<Main fruit={fruit} />} />
          <Route path='/detail/:id' element={<Detail fruit={fruit} />} />
          <Route path='/about' element={<About />} >
            <Route path='introduce' element={<div>회사소개</div>} />
            <Route path='history' element={<div>연혁</div>} />
            <Route path='location' element={<div>오시는길</div>} />
          </Route>
          <Route path='/cart' element={<Cart />} />
          <Route path='*' element={<div>Page not found</div>} />
        </Routes>
      </Suspense>

    </div>
  );
}

export default App;
