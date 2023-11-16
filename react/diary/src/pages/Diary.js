import { useNavigate, useParams } from "react-router-dom";
import useDiary from "../hook/useDiary";
import Header from "../components/Header";
import Button from "../components/Button";
import { getFormattedDate, setPageTitle } from "../util/util";
import Viewer from "../components/Viewer";
import { useEffect } from "react";

const Diary = () => {
  const { id } = useParams();
  const data = useDiary(id);
  const navigate = useNavigate();

  useEffect(() => {
    setPageTitle(`${id}번 다이어리`);
  }, [])

  if(!data) {
    return <div>데이터를 읽어오는 중입니다..</div>
  } else {
    const {date, content, emotionId} = data;
    const title = `${getFormattedDate(new Date(date))} 다이어리`;

    const goBack = () => {
      navigate(-1);
    }

    const goEdit = () => {
      navigate('/edit/' + id);
    }

    return (
      <div>
        <Header title={title}
          leftChild={<Button text={'<뒤로가기'} clickHandler={goBack} />}
          rightChild={<Button text={'수정하기'} clickHandler={goEdit} />}
        />
        <Viewer emotionId={emotionId} content={content} />
      </div>
    );
  }
}

export default Diary;