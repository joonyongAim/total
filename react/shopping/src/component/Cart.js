import { Table } from "react-bootstrap";
import { useDispatch, useSelector } from "react-redux";
import { addCount, subCount, removeCart } from "../redux/store";
import { memo, useMemo, useState } from "react";

const Test = memo(({ num }) => {
  console.log('test컴포넌트');

  return (
    <div>
      <h1>{num}</h1>
      메모이제이션 테스트중
    </div>
  );
})
// 재귀 함수
const fact = (n) => {
  if(n <= 1)
    return 1;

  return n * fact(n-1);
}

const Cart = () => {
  const cart = useSelector((state) => state.cart);
  const dispatch = useDispatch();
  const [num, setNum] = useState(0);
  const [n, setN] = useState(10);

  const result = useMemo(() => {
    return (
      fact(n)
    );
  }, [n])
  
  return (
    <>
    <input type="number" value={n} onChange={(e) => {
      setN(e.target.value);
    }} />
    {result}
    <Test num={num} />
    <button onClick={() => {
      setNum(num + 1);
    }}>버튼</button>
    <Table>
      <thead>
        <tr>
          <th>번호</th>
          <th>상품명</th>
          <th>수량</th>
          <th>변경</th>
        </tr>
      </thead>
      <tbody>
        {
          cart.map((data, i) => {
            return (
              <tr key={i}>
                <td>{data.id}</td>
                <td>{data.title}</td>
                <td>
                  <button onClick={() => {
                    dispatch(subCount(data.id));
                  }}>-</button>
                  {data.count}
                  <button onClick={() => {
                    dispatch(addCount(data.id));
                  }}>+</button>
                  </td>
                <td>
                  <button onClick={() => {
                    dispatch(removeCart(data.id));
                  }}>삭제</button>
                </td>
              </tr>
            )
          })
        }
      </tbody>
    </Table>
    </>
  );
}

export default Cart; 