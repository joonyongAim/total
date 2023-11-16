const box = document.querySelector('.box');

let boxY = box.scrollHeight;
console.log(boxY);

let boxHeight = box.clientHeight;
console.log(boxHeight);

let isDisabled = true;

box.addEventListener('scroll', () => {
  let scroll = box.scrollTop;
  console.log(scroll);

  if(isDisabled && (boxHeight + scroll > boxY - 5)) {
    document.querySelector('#chk').disabled = false;
    isDisabled = false;
  }
})

let windowHeight = window.innerHeight;
console.log('windowHeight', windowHeight);
let bodyHeight = document.querySelector('body').clientHeight;
console.log('bodyHeight', bodyHeight);

window.addEventListener('scroll', () => {

  barWidth = window.scrollY / (bodyHeight - windowHeight) * 100;

  document.querySelector('.bar').style.width = `${barWidth}%`;
  
})
