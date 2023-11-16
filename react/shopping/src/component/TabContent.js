import { useEffect, useState } from "react";

const TabContent = ({tabNumber}) => {
  const [fade, setFade] = useState(null);

  useEffect(() => {
    
    let timer = setTimeout(() => {
      setFade('end');
    }, 10)
    
    return () => {
      clearTimeout(timer);
      setFade(null);
    }
  }, [tabNumber])

  return (
    <div className={"start " + fade}>
      {
        [<div>상세정보</div>, <div>리뷰</div>, <div>교환,반품정보</div>][tabNumber]
      }
    </div>
  );
}

export default TabContent;