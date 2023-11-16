function handler() {
  alert('hello');
}

btn.onclick = function() {
  alert('두번째 hi');
}


// btn.addEventListener(이벤트, handler);

const fn = () => {
  alert('이벤트리스너 작업함');
}
const fn2 = () => {
  alert('또 이벤트리스너 작업함');
}

document.querySelector('.a')
        .addEventListener('click', fn);
document.querySelector('.a')
        .addEventListener('click', fn2);       

// document.querySelector('.a')
//         .removeEventListener('click', fn);


document.querySelector('.b')
        .addEventListener('click', (event) => {
            console.log(event.type + '이벤트가' + event.currentTarget + '에서 발생');
            console.log('좌표값 : ' + event.clientX + "," + event.clientY);
        })