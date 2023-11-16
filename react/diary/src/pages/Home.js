import { useContext, useEffect, useState } from "react";
import Button from "../components/Button";
import Header from "../components/Header";
import { DiaryStateContext } from "../App";
import { getMonthRangeByDate, setPageTitle } from "../util/util";
import DiaryList from "../components/DiaryList";

const Home = () => {
  const data = useContext(DiaryStateContext);
  const [filterData, setFilterData] = useState([]);
  const [pivotDate, setPivotDate] = useState(new Date());
  const headerTitle = `${pivotDate.getFullYear()}년 ${pivotDate.getMonth() + 1}월`;

  useEffect(() => {
    setPageTitle('Diary');
  }, [])

  useEffect(() => {
    if(data.length >= 1) {
      const { startTimeStamp, endTimeStamp } = getMonthRangeByDate(pivotDate);
      setFilterData(
        data.filter((d) => startTimeStamp <= d.date && d.date <= endTimeStamp)
      )
    } else {
      setFilterData([])
    }
  },[data, pivotDate])

  const onIncreaseMonth = () => {
    setPivotDate(new Date(pivotDate.getFullYear(), pivotDate.getMonth()+1))
  }

  const onDecreaseMonth = () => {
    setPivotDate(new Date(pivotDate.getFullYear(), pivotDate.getMonth()-1))
  }

  return (
    <div>
      <Header title={headerTitle} 
        leftChild={<Button text={'<'} clickHandler={onDecreaseMonth} />}
        rightChild={<Button text={'>'} clickHandler={onIncreaseMonth} />}
      />
      <DiaryList filterData={filterData} />
    </div>
  );
}

export default Home;