import { useNavigate } from "react-router-dom";

const Card = ({ data }) => {
  const navigate = useNavigate();
    
  return (
    <div className="col-md-4" onClick={() => {navigate(`/detail/${data.id}`)}} style={{ cursor : 'pointer'}}>
      <img src={`https://raw.githubusercontent.com/Naessss/study/main/${data.title}.jpg`} style={{width : '80%'}} />
      <h4>{data.title}</h4>
      <p>{data.price}</p>
    </div>
  );
}

export default Card;