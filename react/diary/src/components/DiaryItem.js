import { useNavigate } from 'react-router-dom';
import { getEmotionImgById } from '../util/util';
import Button from './Button';
import './DiaryItem.css';

const DiaryItem = ({ id, date, content, emotionId}) => {
  const navigate = useNavigate();

  const goDiary = () => {
    navigate('/diary/' + id)
  }

  const goEdit = () => {
    navigate('/edit/' + id)
  }

  return (
    <div className="DiaryItem">
      <div className={'img_section ' + `img_section_${emotionId}`}>
        <img src={getEmotionImgById(emotionId)} alt='' />
      </div>
      <div className='info_section' onClick={goDiary}>
        <div className='date_wrapper'>
          {new Date(date).toLocaleDateString()}
        </div>
        <div className='content_wrapper'>
          {content.slice(0, 20)}
        </div>
      </div>
        <div className='button_section'>
          <Button text={'수정하기'} clickHandler={goEdit} />
        </div>
    </div>
  )
}

export default DiaryItem;