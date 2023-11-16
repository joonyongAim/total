import { useSelector } from 'react-redux';
import bg from '../bg.jpg';
import { useNavigate } from 'react-router-dom';

function WatchedProduct({fruit}) {
  const watched = useSelector((state) => state.watched);
  const navigate = useNavigate();

  return (
    <div className="recent-container">
      <div className="cards">
      <p>최근 본 상품</p>
        {watched.map((item) => (
          <div className="card" key={item.id} onClick={() => {
            navigate('/detail/' + item);
          }}>
            <img src={'https://raw.githubusercontent.com/Naessss/study/main/' + fruit[item].title + '.jpg'} alt={fruit[item].title} />
            <p>{fruit[item].title}</p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default WatchedProduct;