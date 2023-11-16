import logo from './logo.svg';
import './App.css';
import { getEmotionImgById } from './util/util';
import { Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import New from './pages/New';
import Diary from './pages/Diary';
import Edit from './pages/Edit';
import { createContext, useEffect, useReducer, useRef, useState } from 'react';

export const DiaryStateContext = createContext();
export const DiaryDispatchContext = createContext();

// const mockData = [
//   {
//     id : 'm1',
//     date : new Date().getTime()+1,
//     content : '임시데이터 1',
//     emotionId : 1
//   },
//   {
//     id : 'm2',
//     date : new Date().getTime()+2,
//     content : '임시데이터 2',
//     emotionId : 2
//   },
//   {
//     id : 'm3',
//     date : new Date().getTime()+3,
//     content : '임시데이터 3',
//     emotionId : 4
//   }
// ]

function reducer(state, action) {

  switch(action.type) {
    case 'CREATE':
      const newState = [action.data, ...state];
      localStorage.setItem('diary', JSON.stringify(newState));
      return newState;
    case 'UPDATE':
      const updateState = state.map((data) => 
        String(data.id) === String(action.data.id) ? {...action.data} : data
      )
      localStorage.setItem('diary', JSON.stringify(updateState));
      return updateState;
    case 'DELETE':
      const deleteState = state.filter((data) => 
        String(data.id) !== String(action.targetId)
      )
      localStorage.setItem('diary', JSON.stringify(deleteState));
      return deleteState;
    case 'INIT':
      return action.data;
    default:
      return state;
  }
}

function App() {
  const [state, dispatch] = useReducer(reducer, []);
  const idRef = useRef(0);
  const [isDataLoad, setIsDataLoad] = useState(false);

  useEffect(() => {
    const rawData = localStorage.getItem('diary');
    if(!rawData) {
      setIsDataLoad(true);

      return;
    }
    const localData = JSON.parse(rawData);
    if(localData.length === 0) {
      setIsDataLoad(true);
      return;
    }

    idRef.current = localData[0].id + 1;

    dispatch({
      type: 'INIT',
      data: localData
    })
    setIsDataLoad(true);

  }, [] )

  const onCreate = (date, emotionId, content) => {
    dispatch({
      type : 'CREATE',
      data : {
        id : idRef.current,
        date : new Date(date).getTime(),
        emotionId,
        content
      }
    })
    idRef.current += 1;
  }

  const onUpdate = (targetId, date, content, emotionId) => {
    dispatch({
      type : 'UPDATE',
      data : {
        id : targetId,
        date : new Date(date).getTime(),
        content,
        emotionId
      }
    })
  }

  const onDelete = (targetId) => {
    dispatch({
      type : 'DELETE',
      targetId
    })
  }

  if(!isDataLoad) {
    return <div>로딩중입니다.</div>
  } else {
    return (
      <DiaryStateContext.Provider value={state}>
      <DiaryDispatchContext.Provider value={{ onCreate, onDelete, onUpdate }}>
      <div className="App">
        <Routes>
          <Route path='/' element={<Home />} />
          <Route path='/new' element={<New />} />
          <Route path='/diary/:id' element={<Diary />} />
          <Route path='/edit/:id' element={<Edit />} />
        </Routes>
      </div>
      </DiaryDispatchContext.Provider>
      </DiaryStateContext.Provider>
    );
  }
}

export default App;
