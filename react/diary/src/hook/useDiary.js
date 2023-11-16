import { useContext, useEffect, useState } from "react";
import { DiaryStateContext } from "../App";
import { useNavigate } from "react-router-dom";

const useDiary = (id) => {
  const data = useContext(DiaryStateContext);
  const [diary, setDiary] = useState();
  const navigate = useNavigate();

  useEffect(() => {
    const matchDiary = data.find((d) => String(d.id) === String(id));

    if(matchDiary) {
      setDiary(matchDiary);
    } else {
      alert('해당 다이어리가 없음');
    }

  }, [id, diary])

  return diary;
}

export default useDiary;