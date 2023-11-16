import { useQuery } from "@tanstack/react-query";
import axios from "axios";
import { Container, Nav, Navbar } from "react-bootstrap";
import { Link, useNavigate } from "react-router-dom";

const Header = () => {
  const navigate = useNavigate();

  const userInfoQuery = useQuery(['userInfo'], () => 
    axios.get('https://raw.githubusercontent.com/Naessss/study/main/userinfo.json')
      .then((result) => {
        console.log(result);
        return result.data;
      })
  )

  // const 결과저장변수 = useQuery(['쿼리이름'], () => {
  //   서버요청 코드
  // })

  return (
    <Navbar bg="dark" data-bs-theme="dark">
      <Container>
        <Navbar.Brand href="/">Navbar</Navbar.Brand>
        <Nav className="me-auto">
          <Nav.Link onClick={() => {navigate('/')}}>Home</Nav.Link>
          <Nav.Link onClick={() => {navigate('/detail')}}>상세페이지</Nav.Link>
          <Nav.Link onClick={() => {navigate('/about')}}>about</Nav.Link>
          <Nav.Link onClick={() => {navigate('/cart')}}>장바구니</Nav.Link>
        </Nav>
        <Nav style={{color : 'white'}}>
          {userInfoQuery.isLoading && '로딩중'}
          {userInfoQuery.isError && '오류'}
          {userInfoQuery.data && userInfoQuery.data[0].name}
        </Nav>
      </Container>
    </Navbar>
  );
}

export default Header;