import { useNavigate, useParams } from "react-router-dom";
import useDiary from "../hook/useDiary";
import Header from "../components/Header";
import Button from "../components/Button";
import { useContext, useEffect } from "react";
import { DiaryDispatchContext } from "../App";
import Editor from "../components/Editor";
import { setPageTitle } from "../util/util";

const Edit = () => {
  const { id } = useParams();
  const data = useDiary(id);
  const navigate = useNavigate();
  const { onDelete } = useContext(DiaryDispatchContext);
  const { onUpdate } = useContext(DiaryDispatchContext);

  const onSubmit = (updateData) => {
    if(window.confirm('정말로 수정하시겠습니까?')) {
      onUpdate(updateData.id , updateData.date, updateData.content, updateData.emotionId);
      navigate('/');
    }
  }

  const deleteHandler = () => {
    if(window.confirm('정말로 삭제하시겠습니까?')) {
      onDelete(id);
      navigate('/');
    }
  }

  if(!data) {
    return <div>로딩중...</div>
  } else {
    const goBack = () => {
      navigate(-1);
    }

    return (
      <div>
        <Header title={'다이어리 수정'}
          leftChild={<Button text={'<뒤로가기'} clickHandler={goBack} />}
          rightChild={<Button text={'삭제하기'} type={'negative'} clickHandler={deleteHandler}/>}
        />
        <Editor initData={data} onSubmit={onSubmit} />
      </div>
    );
  }
}

export default Edit;