const pre = document.querySelector('.pre');
const btn1 = document.querySelector('.btn1');
const btn2 = document.querySelector('.btn2');
const btn3 = document.querySelector('.btn3');
const next = document.querySelector('.next');
const carousel = document.querySelector('.carousel');

let no = 1; // 캐러셀 이미지가 몇번째에 있는지 알려주는 변수

setInterval(() => {
  carousel.style.transform = `translateX(-${no}00vw)`;
  no++;
  if(no === 3)
    no = 0;
}, 5000);

pre.addEventListener('click', () => {
  if(no > 1) {
    carousel.style.transform = `translateX(-${no-2}00vw)`;
    no--;
  }
})

next.addEventListener('click', () => {
  if(no < 3) {
    carousel.style.transform = `translateX(-${no}00vw)`;
    no++;
  }
})


btn1.addEventListener('click', () => {
  carousel.style.transform = 'translateX(0)';
  no = 1;
})

btn2.addEventListener('click', () => {
  carousel.style.transform = 'translateX(-100vw)';
  no = 2;
})

btn3.addEventListener('click', () => {
  carousel.style.transform = 'translateX(-200vw)';
  no = 3;
})

