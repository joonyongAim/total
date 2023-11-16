import { Link } from 'react-router-dom';
import CarouselBN from '../components/CarouselBN';
import '../styles/Main.css';
import React, { useState } from 'react';
import { IMG_PATH } from '../constants/path';

const Main = () => {
  const [isHovered, setHovered] = useState(false);

  const handleMouseEnter = () => {
    setHovered(true);
  };

  const handleMouseLeave = () => {
    setHovered(false);
  };

  return (
    <div className='mains-container'>
      <div className='mains container'>
        <div className='mains-box1'>
          <div className='mains-banner'>
            <CarouselBN />
          </div>
        </div>
        &nbsp;&nbsp;
        <div className='mains-box2'>
          <div className='mains-btn1'>
            {/* <img src='../assets/logo.png' className="colored-icon" alt="icon" />
            &nbsp;&nbsp;
            <a href='/send' className='btn btn-success mainBtn2'>이체</a> */}
            <div className='mains-icon'>
              <div className={`icon1 icons ${isHovered ? 'hovered' : ''}`} onMouseEnter={handleMouseEnter} onMouseLeave={handleMouseLeave}>
                <Link to="/transaction">
                  <img src={IMG_PATH + '/img/swap.png'} alt="swap" href="#" className='icons' />
                </Link>
                <strong>이체</strong>
              </div>
              <div className={`icon2 icons ${isHovered ? 'hovered' : ''}`} onMouseEnter={handleMouseEnter} onMouseLeave={handleMouseLeave}>
                <Link to="/exchange">
                  <img src={IMG_PATH + '/img/exchange1.png'} alt="exchange1" href="#" className='icons' />
                </Link>
                <strong>환율</strong>
              </div>
              <div className={`icon1 icons ${isHovered ? 'hovered' : ''}`} onMouseEnter={handleMouseEnter} onMouseLeave={handleMouseLeave}>
                <Link to="/event">
                  <img src={IMG_PATH + '/img/event1.png'} alt="event1" href="#" className='icons' />
                </Link>
                <strong>이벤트</strong> 
              </div>
              <div className={`icon2 icons ${isHovered ? 'hovered' : ''}`} onMouseEnter={handleMouseEnter} onMouseLeave={handleMouseLeave}>
                <Link to="/security">
                  <img src={IMG_PATH + '/img/security1.png'} alt="security1" href="#" className='icons' />
                </Link>
                <strong>보안센터</strong>
              </div>
              <div className={`icon2 icons ${isHovered ? 'hovered' : ''}`} onMouseEnter={handleMouseEnter} onMouseLeave={handleMouseLeave}>
                <Link to="/customer">
                  <img src={IMG_PATH + '/img/customer1.png'} alt="customer" href="/customer" className='icons' />
                </Link>
                <strong>고객센터</strong>
              </div>
              <div className={`icon2 icons ${isHovered ? 'hovered' : ''}`} onMouseEnter={handleMouseEnter} onMouseLeave={handleMouseLeave}>
                <Link to="/about">
                  <img src={IMG_PATH + '/img/map.png'} alt="map" href="/about" className='icons' />
                </Link>
                <strong>영업점찾기</strong>
              </div>


            </div>

          </div>
        </div>
      </div>
      {/* <div className='mains-box3'>

      </div> */}
    </div>
  )
}

export default Main;