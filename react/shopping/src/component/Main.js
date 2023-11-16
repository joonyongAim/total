import Card from "./Card";
import bg from '../bg.jpg';
import { useState } from "react";

const Main = ({ fruit }) => {
  const [viewCount, setViewCount] = useState(3);
  let viewFruit = fruit.slice(0, viewCount);

  return (
    <>
      <div className='main-bg' 
        style={{backgroundImage : 'url(' + bg + ')'}}></div>
      <div className="container mt-3">
        <div className="row">
          {
            viewFruit.map((data, i) => {
              return (
                <Card data={data} key={i} />
              );
            })
          }
        </div>

        {
          viewCount > fruit.length
          ? <div className="alert alert-danger">가져올 상품 없음</div>
          : <button onClick={() => {
            setViewCount(viewCount + 3);
          }}>더보기</button>
        }
        
      </div>
    </>
  );
}

export default Main;