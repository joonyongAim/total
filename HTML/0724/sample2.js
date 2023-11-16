const ele = document.getElementById('ele');
ele.style.background='skyblue';
ele.style.color='red';

// document.getElementById('ele').style.background='skyblue'
// document.getElementById('ele').style.color='red'


let ul = document.querySelectorAll('ul');

for(let u of ul) {
  console.log(u);
}

ul[1].style.background = 'pink';

let lastLi = document.querySelectorAll('ul > li:last-child');

lastLi[0].style.color = 'red';

let test = document.querySelector('#ele');

test.style.background = 'yellowGreen';

console.log('------');
for(let node of document.body.children) {
  if(node.matches('a[href$="zip"]'))
  console.log(node);
}

console.log("----------");
let chapter = document.querySelector('.chapter');

console.log(chapter.closest('.book'));
console.log(chapter.closest('.content'));
console.log(chapter.closest('#ele'));


document.getElementById('아이디명')
document.getElementsByClassName('클래스이름')
document.getElementsByTagName('태그명')
document.getElementsByName('name이름')