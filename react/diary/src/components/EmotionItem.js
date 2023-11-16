import './EmotionItem.css';

const EmotionItem = ({ id, img, name, onClick, isSelected }) => {
  const onClickHandler = () => {
    onClick(id);
  };

  return (
    <div className={"EmotionItem " + (isSelected ? `EmotionItem_on_${id}` : 'EmotionItem_off')}
      onClick={onClickHandler}>
      <img src={img} alt={`emotion${id}`} />
      <span>{name}</span>
    </div>
  );
};

export default EmotionItem;