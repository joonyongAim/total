import React from 'react';
import Carousel from 'react-bootstrap/Carousel';
import { IMG_PATH } from '../constants/path';

function CarouselBN() {
  return (
    <Carousel >
      <Carousel.Item>
        <img src={IMG_PATH + '/img/ezenBnn1.png'} style={{width: '1000px', aspectRatio:'8/3'}} alt="" className='caroImg'/>
      </Carousel.Item>
      <Carousel.Item>
        <img src={IMG_PATH + '/img/ezenBnn2.png'} style={{width: '1000px', aspectRatio:'8/3'}} alt="" className='caroImg' />
      </Carousel.Item>
      <Carousel.Item>
        <img src={IMG_PATH + '/img/ezenBnn3.png'} style={{width: '1000px', aspectRatio:'8/3'}} alt="" className='caroImg' />
      </Carousel.Item>
    </Carousel>
  );
}

export default CarouselBN;
