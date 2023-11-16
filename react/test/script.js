const stars = document.querySelectorAll('.star');
const reviewInput = document.getElementById('reviewInput');
const submit = document.getElementById('submit');
const review = document.getElementById('review');

stars.forEach(star => {
  star.addEventListener('click', () => {
    select = star.dataset.rating;
    setStarColor();
  })
})

function setStarColor() {
  stars.forEach((star, i) => {
    if(i < select)
      star.classList.add('selected');
    else
      star.classList.remove('selected');
  })
}

submit.addEventListener('click', () => {
  if(reviewInput.value != '' && select != 0) {
    const reviewList = document.createElement('li');
    reviewList.innerHTML = `평점 : ${select} / 리뷰 : ${reviewInput.value}`;
    list.appendChild(reviewList);

    reviewInput.value = '';
    select = 0;
    setStarColor();
  }
})