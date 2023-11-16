import { Outlet, useNavigate } from "react-router-dom";

const About = () => {
  const navigate = useNavigate();
  return (
    <>
      <button onClick={() => {navigate('/about/introduce')}}>회사소개</button>
      <button onClick={() => {navigate('/about/history')}}>연혁</button>
      <button onClick={() => {navigate('/about/location')}}>오시는길</button>

      <Outlet></Outlet>

      <p>다른 공통적인 내용들이 있는 부분</p>
    </>
  );
}

export default About;