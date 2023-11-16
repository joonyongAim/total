// e.preventDefault(); // 기본동작 막음

btn.onclick = function(e) {

  if(e.shiftKey) {
    alert('쉬프트 클릭');
  }

  if(e.altKey) {
    alert('알트클릭');
  }

  if(e.ctrlKey) {
    alert('컨트롤클릭');
  }
}

document.querySelector('div').addEventListener('click', (e) => {
  console.log(`clientX : ${e.clientX} clientY : ${e.clientY}`);
  console.log(`pageX : ${e.pageX} pageY : ${e.pageY}`);
})

document.querySelector('h1').addEventListener('mousedown', (e) => {
  e.preventDefault();
})

document.querySelector('h1').addEventListener('dblclick', (e) => {
  e.preventDefault();
  alert('asd');
})

document.querySelector('p').addEventListener('copy', (e) => {
  e.preventDefault();
  alert('복사금지');
})

document.querySelector('p').addEventListener('contextmenu', (e) => {
  e.preventDefault();
})