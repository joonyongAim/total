document.querySelector('#form').addEventListener('click', (e) => {
  console.log(e.target.tagName);
  alert('form태그 핸들러');
})

document.querySelector('p').addEventListener('click', (e) => {
  e.stopPropagation();
  alert('p태그 핸들러');
})