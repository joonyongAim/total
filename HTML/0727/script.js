// const xhr = new XMLHttpRequest();
// xhr.open('get', 'https://jsonplaceholder.typicode.com/posts');
// xhr.setRequestHeader('content-type', 'application/json');

// let data = {
//   id: 1,
//   name: '홍길동',
//   age: 20
// }

// xhr.send(JSON.stringify(data));

// xhr.onload = () => {
//   if(xhr.status === 200) {
//     const res = JSON.parse(xhr.response);
//     console.log(res);
//   } else {
//     console.error(xhr.status, xhr.statusText);
//   }
// }


// $.get('https://jsonplaceholder.typicode.com/posts')
//   .done((response) => {
//     console.log(response);
//   })
//   .fail(() => {
//     console.log('요청실패');
//   })

// let fruit;
// $('.btn').on('click', () => {
//   $.get('https://raw.githubusercontent.com/Naessss/study/main/fruit.json')
//     .done((data) => {
//       $('.content').html(data);
//     })
//     .fail(() => {
//       alert('요청 실패');
//     })
// })

// fetch('https://jsonplaceholder.typicode.com/posts/1')
//   .then((response) => {
//     return response.json();
//   })
//   .then((data) => console.log(data))
//   .catch(() => console.log('요청실패'));

console.log(1)
console.log(2)
const p = new Promise(function(resolve, reject) {
  setTimeout(() => {
    // resolve('성공');
    reject(new Error('실패'));
  }, 3000)
})

p.then((data) => {
  console.log(data);
})
.catch((error) => {
  console.log(error);
})

console.log(3)
console.log(4)