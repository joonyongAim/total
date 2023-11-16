import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Modal from './component/Modal';

function App() {
  const [title, setTitle] = useState(['Java', 'HTML']);
  const [like, setLike] = useState([0, 0, 0]);
  const [modal, setModal] = useState(false);
  const [titleIndex, setTitleIndex] = useState(0);
  const [newTitle, setNewTitle] = useState('');
  const [board, setBoard] = useState([
    {
      title : 'Java',
      date : '2023-08-01'
    },
    {
      title : 'HTML',
      date : '2023-07-22'
    }
  ]);

  return (
    <div className="App">
      <div className='black-nav'>
        <h3>게시판</h3>
      </div>
      <button onClick={() => {
        // title = ['JS', 'HTML', 'React'];
        let _title = [...title];
        _title[0] = 'JS';
        setTitle(_title);
      }}>첫번째 제목 변경 버튼</button>

      <button onClick={() => {
        let copy = [...title];
        copy.sort();
        setTitle(copy);
      }}>오름차순</button>

      <button onClick={() => {
        let copy = [...title];
        copy.reverse();
        setTitle(copy);
      }}>내림차순</button>

      {
        board.map((data, i) => {
          return (
            <div className='list' key={i} onClick={() => {
              setModal(!modal);
              setTitleIndex(i);
            }}>
              <h4>
                {data.title}
                <button onClick={(e) => {
                  e.stopPropagation();
                  let _like = [...like];
                  _like[i] = _like[i] + 1;
                  setLike(_like);
                }}>따봉</button> {like[i]}
              </h4>
              <p>작성일 : {board[i].date}</p>
              <button onClick={(e) => {
                e.stopPropagation();
                let _title = [...title];
                _title.splice(i, 1);
                setTitle(_title);
              }}>삭제</button>
              <button onClick={(e) => {
                e.stopPropagation();
                let a = prompt('타이틀 수정');
                if(a === null) {
                  setTitle(title);
                } else if(a === '') {
                  alert('타이틀을 입력하세요');
                } else {
                  let _title = [...title];
                  _title[i] = a;
                  setTitle(_title);
                }
              }}>수정</button>
            </div>
          );
        })
      }

      <input type='text' value={newTitle} onChange={(e) => {
        setNewTitle(e.target.value);
      }} />
      <button onClick={() => {
        if (newTitle === '') {
          alert('등록못함');
        } else {
          // title, like state추가 관련 코드
          let copy = [...title];
          copy.unshift(newTitle);
          setTitle(copy);
          setLike([0, ...like]);

          // board state추가 관련 코드
          let today = new Date();
          let month = String(today.getMonth() + 1).padStart(2, 0);
          let date = `${today.getFullYear()}-${month}-${today.getDate()}`;

          let _board = [...board];
          _board.unshift({title : newTitle, date : date});
          setBoard(_board);
          
          setNewTitle('');
        }
      }}>등록</button>

      {
        modal ? <Modal title={title} setTitle={setTitle} titleIndex={titleIndex} board={board}/> : null
      }


    </div>
  );
}

export default App;
