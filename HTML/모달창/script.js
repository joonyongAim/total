const modifyBtn = document.querySelector('#modify-btn');
const blackBg = document.querySelector('.black-bg');
const closeBtn = document.querySelector('.close');

const toggleShow = () => {
  blackBg.classList.toggle('show');
}

// JS
modifyBtn.addEventListener('click', toggleShow)
closeBtn.addEventListener('click', toggleShow)

// JQuery
// $('#modify-btn').on('click',() => {
//   $('.black-bg').fadeIn('show');
// })

// $('.close').on('click', () => {
//   $('.black-bg').fadeOut('show');
// })