// const togglerBtn = document.querySelector('.navbar-toggler');
// const listGroup = document.querySelector('.list-group');

// let isShow = false;
// togglerBtn.addEventListener('click', () => {

//   if(isShow) {
//     listGroup.classList.remove('show');
//     isShow = false;
//   } else {
//     listGroup.classList.add('show');
//     isShow = true;
//   }

// })

const darkBtn = document.querySelector('.dark');
const lightBtn = document.querySelector('.light');

darkBtn.addEventListener('click', () => {
  document.body.style.backgroundColor = "black";
  document.body.style.color = "white";
})

lightBtn.addEventListener('click', () => {
  document.body.style.backgroundColor = "white";
  document.body.style.color = "black";
})

const colorBtn = document.querySelector('.color');

let isDark = false;

// colorBtn.addEventListener('click', () => {

//   if(isDark) {
//     // 라이트모드 적용시키는 코드
//     // colorBtn.setAttribute('value', '다크모드');
//     colorBtn.value = '다크모드';
//     document.body.style.backgroundColor = "white";
//     document.body.style.color = "black";
//     isDark = false;
//   } else {
//     // 다크모드가 적용되는 코드
//     // colorBtn.setAttribute('value', '라이트모드');
//     colorBtn.value = '라이트모드';
//     document.body.style.backgroundColor = "black";
//     document.body.style.color = "white";
//     isDark = true;
//   }
  
// })

$('.color').on('click', () => {
  if(isDark) {
    $('.color').attr('value', '다크모드');
    $('body').css('backgroundColor', 'white');
    $('body').css('color', 'black');
    isDark = false;
  } else {
    $('.color').val('라이트모드');
    $('body').css('backgroundColor', 'black');
    $('body').css('color', 'white');
    isDark = true;
  }
})
