import React from 'react';
import '../styles/ErrorPage.css';
import { IMG_PATH } from '../constants/path';

const ErrorPage = () => {
  return (
    <div className='error-container'>
      <div className='error-box'>
        <img src={IMG_PATH + '/img/error.png'} alt="error" href="#" />
      </div>
      <div className='error-text'>
        <strong ><br />죄송합니다. 페이지를 찾을 수 없습니다.<br />
          존재하지 않는 주소를 입력하셨거나,<br />
          요청하신 페이지의 주소가 변경, 삭제되어 찾을 수 없습니다.<br />
        </strong>
      </div>
    </div>
  )
}

export default ErrorPage;