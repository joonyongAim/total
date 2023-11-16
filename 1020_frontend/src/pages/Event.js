import Customersub from '../components/Customersub';
import { IMG_PATH } from '../constants/path';
import '../styles/Event.css';
import React from 'react';

const Event = () => {
  return (
    <div className='event-container'>
      <div className='event-leftbox'>
        <Customersub />
      </div>
      <div className='event-rightbox'>

        <div className='event-banner'>
          <img src={IMG_PATH + '/img/ezenBnn1.png'} alt="ezenbnn1" href="#" />
          <img src={IMG_PATH + '/img/ezenBnn2.png'} alt="ezenbnn2" href="#" />
          <img src={IMG_PATH + '/img/ezenBnn3.png'} alt="ezenbnn3" href="#" />
        </div>
      </div>
    </div>
  )
}

export default Event;