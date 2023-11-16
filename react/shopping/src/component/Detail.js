import { useEffect, useState } from "react";
import { Nav } from "react-bootstrap";
import { useParams } from "react-router-dom";
import TabContent from "./TabContent";
import { useDispatch } from "react-redux";
import { addCart } from "../redux/store";
import { setWatched } from "../redux/watchedSlice";

const Detail = ( {fruit} ) => {
  const {id} = useParams();
  const [alert, setAlert] = useState(true);
  const [tabNumber, setTabNumber] = useState(0);
  const dispatch = useDispatch();

  useEffect(() => {
    // 로컬스토리지에 저장된 값을 빼옴
    let watched = localStorage.getItem('watched');
    watched = JSON.parse(watched);

    if(watched.length === 3 && !watched.includes(id))
      watched.pop();

    // 빼온 데이터에 내가 방문한 상품의 id를 추가
    watched = [id, ...watched];
    // 다시 로컬스토리지에 추가된 데이터를 등록
    // 중복 제거
    watched = new Set(watched);
    // 배열로 변환
    watched = Array.from(watched);

    localStorage.setItem('watched', JSON.stringify(watched));
    dispatch(setWatched(watched));
  }, [])

useEffect(() => {
  let timer = setTimeout(() => {
    setAlert(false);
    console.log('useEffect내부 코드임');
  }, 5000)

  return () => {
    console.log('clean up function');
    clearTimeout(timer);
  }
},[]);

  let result = fruit.find(data => data.id === parseInt(id));

  if(!result) {
    return (
      <div>없는 상품</div>
    );
  }

  return (
    <div className="container mt-3">
      {
        alert &&
          <div className="alert alert-danger">
            반짝 할인 상품
          </div>
      }
      <div className="row">
        <div className="col-md-6">
          <img src={`https://raw.githubusercontent.com/Naessss/study/main/${fruit[id].title}.jpg`} width="100%" />
        </div>
        <div className="col-md-6">
          <h4 className="pt-5">{fruit[id].title}</h4>
          <p>{fruit[id].content}</p>
          <p>{fruit[id].price}</p>
          <button className="btn btn-danger" onClick={() => {
            dispatch(addCart( { id : +id, title : fruit[id].title, count : 1} ))
            }}>주문하기</button> 
        </div>
      </div>

      <Nav className="mt-4" justify variant="tabs" defaultActiveKey="link-0">
        <Nav.Item>
          <Nav.Link eventKey="link-0" onClick={() => {
            setTabNumber(0)
          }}>상세정보</Nav.Link>
        </Nav.Item>
        <Nav.Item>
          <Nav.Link eventKey="link-1" onClick={() => {
            setTabNumber(1)
          }}>리뷰</Nav.Link>
        </Nav.Item>
        <Nav.Item>
          <Nav.Link eventKey="link-2"onClick={() => {
            setTabNumber(2)}}>반품,교환정보</Nav.Link>
        </Nav.Item>
      </Nav>

      <TabContent tabNumber={tabNumber} />

    </div>
  );
}

export default Detail;