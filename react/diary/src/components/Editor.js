import { useCallback, useEffect, useState } from 'react';
import './Editor.css';
import { emotionList, getFormattedDate } from '../util/util';
import Button from './Button';
import { useNavigate } from 'react-router-dom';
import EmotionItem from './EmotionItem';

const Editor = ({ initData, onSubmit }) => {
  const [state, setState] = useState({
    date: getFormattedDate(new Date()),
    emotionId: 3,
    content: ''
  });
  const navigate = useNavigate();

  useEffect(() => {
    if(initData) {
      setState({
        ...initData,
        date : getFormattedDate(new Date(initData.date))
      })
    }
  }, [initData]);

  const changeHandler = (e) => {
    setState({
      ...state,
      date : e.target.value
    })
  }

  const changeContentHandler = (e) => {
    setState({
      ...state,
      content : e.target.value
    })
  }

  const changeEmotionHandler = useCallback( (emotionId) => {
    setState(state => ({  
      ...state,
      emotionId
    }))
  }, [])

  const submitHandler = () => {
    // 수정 시 완료
    // 새글 작성 시 완료
    onSubmit(state);
  }

  const gobackHandler = () => {
    navigate(-1);
  }

  return (
    <div className='Editor'>
      <div className='editor_section'>
        <h4>오늘의 날짜</h4>
        <div className='input_wrapper'>
          <input type='date' value={state.date} onChange={changeHandler} />
        </div>
      </div>
      <div className='editor_section'>
        <h4>오늘의 기분</h4>
        <div className='input_wrapper emotion_list_wrapper'>
          {
            emotionList.map((data, i) => {
              return (
                <EmotionItem key={i} {...data} 
                  onClick={changeEmotionHandler} 
                  isSelected={data.id === state.emotionId} />
              )
            })
          }
        </div>
      </div>
      <div className='editor_section'>
        <h4>오늘의 내용</h4>
        <textarea placeholder='기록하고 싶은 내용을 입력하세요'
          value={state.content} onChange={changeContentHandler} />
      </div>
      <div className='editor_section bottom_section'>
        <Button text='취소하기' type='negative' 
          clickHandler={gobackHandler}/>
        <Button text='작성완료' type='positive' 
         clickHandler={submitHandler} />
      </div>
    </div>
  );
}

export default Editor;