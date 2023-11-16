import { useNavigate } from "react-router-dom";
import Button from "../components/Button";
import Header from "../components/Header";
import Editor from "../components/Editor";
import { useContext, useEffect } from "react";
import { DiaryDispatchContext } from "../App";
import { setPageTitle } from "../util/util";

const New = () => {
  const navigate = useNavigate();

  const { onCreate } = useContext(DiaryDispatchContext);

  const goBack = () => {
    navigate(-1);
  }

  useEffect(() => {
    setPageTitle('새 다이어리 작성');
  }, [])

  const onSubmit = (data) => {
    onCreate(data.date, data.emotionId, data.content);
    alert('다이어리 작성 완료');
    navigate('/');
  }
  
  return (
    <div>
      <Header title={'새 다이어리 작성'}
        leftChild={<Button text={'<뒤로가기'} clickHandler={goBack} />}
      />
      <Editor onSubmit={onSubmit} />
    </div>
  );
}

export default New;