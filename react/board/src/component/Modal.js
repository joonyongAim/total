import './Modal.css';

const Modal = (props) => {
  return (
    <div className="Modal">
      <h4>{props.title[props.titleIndex]}</h4>
      <p>작성일 : {props.board[props.titleIndex].date}</p>
      <p>내용</p>
      <button onClick={() => {
        let _title = [...props.title];
        _title[0] = 'JS'
        props.setTitle(_title);
      }}>변경</button>
    </div>
  );
}

export default Modal;