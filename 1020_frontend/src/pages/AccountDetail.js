import { Link, useNavigate } from "react-router-dom";
import axiosInstance from "../utils/axiosInstance";

const AccountDetail = ({userInfo, accountInfo, setAccountInfo, setUpdate}) => {
  const transactionList = accountInfo.transactionList;
  const navigate = useNavigate();

  if (!transactionList) {
    return (
      <div className="AccountDetail mainBorder p-5">
        <h2 className='my-2 fontColor1'>계좌내역</h2>
        <hr style={{width:'100%'}}/>
        <h5 className='m-5'>표시할 내역이 없습니다.</h5>
        <Link className='m-5 text-nowrap btn btn-success header-Btn' to="/account">목록 돌아가기</Link>
      </div>
    );
  }
  let total = userInfo.role==='MANAGER' ? 1000000000 : 0;
  return(
    <div className="AccountDetail mainBorder p-5" style={{Height:'500px'}}>
      <h2 className='my-2 fontColor1'>계좌내역</h2>
      <hr style={{width:'100%'}}/>
      <table>
        <thead>
          <tr>
            <th>거래시각</th>
            <th>찾으신 금액</th>
            <th>맡기신 금액</th>
            <th>잔액</th>
            <th>취급점</th>
            <th>거래 메모</th>
            <th>수정</th>
          </tr>
        </thead>
        {
          transactionList.map((transaction, i) => {
            total = total - transaction.money;
            return (
              <tr key={i}>
                <td className="text-start">{new Date(transaction.time).toLocaleDateString('ko-KR')}</td>
                <td className="text-end">{transaction.money > 0 ? transaction.money.toLocaleString('ko-KR')+'원' : ''}</td>
                <td className="text-end">{transaction.money > 0 ? '' : (-transaction.money).toLocaleString('ko-KR')+'원'}</td>
                <td className="text-end">{total.toLocaleString('ko-KR')+'원'}</td>
                <td className="text-start">{transaction.subject}</td>
                <td className="text-start">{transaction.memo}</td>
                <td className="text-center">
                  <button className="btn btn-success text-end" onClick={() => {
                    let _memo = prompt('수정할 내용을 입력하세요.');
                    if(_memo) {
                      axiosInstance.put(`/transaction/${transaction.id}`, {accountId:accountInfo.id, money:1, memo:_memo})
                        .then(response => {
                          if(response.status === 200) {
                            alert('내용 수정 완료');
                            setUpdate(false);
                            navigate('/account');
                          } else
                            alert('내용 수정 실패');
                        }).catch(error => console.log(error))
                  }}}>수정</button>
                </td>
              </tr>
            );
          })
        }
      </table>
    </div>
  )
}

export default AccountDetail;