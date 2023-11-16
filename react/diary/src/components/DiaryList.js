import { useEffect, useState } from "react";
import Button from "./Button";
import './DiaryList.css';
import { useNavigate } from "react-router-dom";
import DiaryItem from "./DiaryItem";

const sortOptionList = [
  { value : 'latest', name : '최신순'},
  { value : 'oldest', name : '오래된순'}
]

const DiaryList = ({ filterData }) => {
  const [sortType, setSortType] = useState('latest');
  const [sortData, setSortDta] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    const compare = (a, b) => {
      if(sortType === 'latest') {
        return Number(b.date) - Number(a.date);
      } else {
        return Number(a.date) - Number(b.date);
      }
    }

    const copyList = [...filterData];
    copyList.sort(compare);
    setSortDta(copyList);
  }, [filterData, sortType])

  const clickNewHandler = () => {
    navigate('/new');
  }

  const changeSortTypeHandler = (e) => {
    setSortType(e.target.value);
  }



  return (
    <div className="DiaryList">
      <div className="menu_wrapper">
        <div className="left_col">
          <select value={sortType} onChange={changeSortTypeHandler}>
            {
              sortOptionList.map((data, i) => {
                return (
                  <option key={i} value={data.value}>
                    {data.name}
                  </option>
                )
              })
            }
          </select>
        </div>
        <div className="right_col">
          <Button text={'새 다이어리 작성'}
            type={'positive'} clickHandler={clickNewHandler} />
        </div>
      </div>
      <div className="list_wrapper">
        {
          sortData.map((data, i) => {
            return (
              <DiaryItem key={i} {...data} />
            )
          })
        }
      </div>
    </div>
  )
}

export default DiaryList;