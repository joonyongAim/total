import axios from "axios";
import { useEffect, useState } from "react";
import { Accordion } from "react-bootstrap";
import '../styles/Approval.css';
import axiosInstance from "../utils/axiosInstance";
import { useNavigate } from "react-router-dom";
function Approval () {
  const navigate = useNavigate();

  const [notUserInfo, setNotUserInfo] = useState([]); // 서버에서 받아온 notUser 정보들 담을 스테이트   
  const [checkValue, setCheckValue] = useState([]);  // 체크된 값들 담아줄 스테이트 

  useEffect(() => {
    axiosInstance.get(`/approval`)
    .then(response => {
      if(response.status == 200) {
        // alert('권한 변경 승인이 완료되었습니다.');
        setNotUserInfo(response.data);   
        console.log(response.data);
      }
      else {
        alert('관리자만 조회 가능한 기능입니다.');
        navigate('/');
      }
    }).catch(error => {
      console.log(error);
    })
  }, [])

  const handleAllCheck = (checked) => {
    if(checked) {
      const idArray = [];
      notUserInfo.forEach((el) => idArray.push(el));
      setCheckValue(idArray); 
    } else {
      setCheckValue([]);
    }
  }

  const handleSingleCheck = (checked, info) => {    // 체크박스 단일선택 함수 
    if (checked)
      setCheckValue(copy => [...copy, info]);
    else
      setCheckValue(checkValue.filter((el) => el !== info));
  };

  // console.log(checkValue);
  return(
    <div className="Approval-Container mainBorder p-5">
      <h2 className='my-2 fontColor1'>권한설정 페이지</h2>
      <hr style={{width:'100%'}}/>
      <div className="approvalSelectAllCheckDiv">
        <input type='checkbox' id="approvalSelectAllCheck" className="my-2 text-start" onChange={(e) => handleAllCheck(e.target.checked)} checked={checkValue.length === notUserInfo.length ? true : false} />
        <label for="approvalSelectAllCheck" className="ms-2 my-2">전체선택</label>
      </div>
          {
            notUserInfo && notUserInfo.map((info, i) => {
              return(
                <Accordion key={i} className="mb-2">
                  <Accordion.Item eventKey={i}>
                    <Accordion.Header className="approval-accordion-header">
                          <input className="approval-checkbox me-2" type="checkbox" readOnly value={info} onClick={(e) => {
                              e.stopPropagation() 
                              handleSingleCheck(e.target.checked, info)
                            }} checked={checkValue.includes(info) ? true : false}/> {info.username} 
                  </Accordion.Header>
                    <Accordion.Body>
                      <div className="approval-accordion-body">
                        <div>이름 :{" " + info.fname}</div>
                        <div>주민번호 :{" " + info.idNo}</div>
                        <div>휴대폰번호 :{" " + info.phone}</div>
                        <div>국적 :{" " + info.country}</div>
                        <div>자택주소 :{" " + info.address}</div>
                        <div>상세주소 :{" " + info.addressDetail}</div>
                        <div>직장명 :{" " + info.jobname}</div>
                        <div>부서명 :{" " + info.teamname}</div>
                        <div>직장주소 :{" " + info.jobAddress}</div>
                        <div>상세주소 :{" " + info.jobAddressDetail}</div>
                        <div>직장연락처 :{" " + info.jobPhone}</div>
                      </div>
                    </Accordion.Body>
                  </Accordion.Item>
                </Accordion>
              );
            })
          }
        <div className="mb-5">
          <button className="btn btn-success" onClick={() => {
            if(checkValue.length === 0)
              alert('회원을 한명도 선택하지 않았습니다');
            else{
              axiosInstance.post(`/approval`,checkValue)
              .then(response => {
                alert(response.data);
                navigate("/");
              }).catch(error => {
                console.log(error);
              })
            }
          }}>권한변경</button>
        </div>
    </div>
  )
};

export default Approval;



