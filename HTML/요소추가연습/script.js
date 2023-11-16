let fruits = [
  { name : 'apple', memo : '새콤달콤사과'},
  { name : 'mango', memo : '달달한 망고'},
  { name : 'melon', memo : '맛있는 메론'},
  { name : 'watermelon', memo : '수박~~~~~'},
  { name : 'strawberry', memo : '딸기딸기딸기딸기'}
];

// for(let i=0; i<fruits.length; i++) {
//   // Jquery 문법
//   $('.card-body > h5').eq(i).html(fruits[i].name);
//   $('.card-body > h5').eq(i).html(fruits[i].memo);
//   $('.card > img').eq(i).attr('src', `../img/${fruits[i].name}.jpg`);

//   // JS 문법
//   // document.querySelectorAll('.card-body > h5')[i].innerHTML = fruits[i].name;
//   // document.querySelectorAll('.card-body > p')[i].innerHTML = fruits[i].memo;
//   // document.querySelectorAll('.card > img')[i].setAttribute('src', `../img/${fruits[i].name}.jpg`);
// }

// let first = document.createElement('div');
// first.classList.add('col');
// first.innerHTML = 
//   `<div class="card" style="width: 18rem;">
//     <img src="../img/${fruits[0].name}.jpg" class="card-img-top">
//     <div class="card-body">
//       <h5 class="card-title">${fruits[0].name}</h5>
//       <p class="card-text">${fruits[0].memo}</p>
//       <button class="btn btn-primary">담기</button>
//     </div>
//   </div>`;

// document.querySelector('.row').appendChild(first);

// let second = 
//   `<div class="col">
//     <div class="card" style="width: 18rem;">
//       <img src="../img/${fruits[1].name}.jpg" class="card-img-top">
//       <div class="card-body">
//         <h5 class="card-title">${fruits[1].name}</h5>
//         <p class="card-text">${fruits[1].memo}</p>
//         <button class="btn btn-primary">담기</button>
//       </div>
//     </div>
//   </div>`;

//   document.querySelector('.row').insertAdjacentHTML('beforeend', second);

//   $('.row').append(second);

// for(let i=0; i<fruits.length; i++) {
//   let all = document.createElement('div');
//   all.classList.add('col');
//   all.innerHTML = 
//   `<div class="card" style="width: 18rem;">
//     <img src="../img/${fruits[i].name}.jpg" class="card-img-top">
//     <div class="card-body">
//       <h5 class="card-title">${fruits[i].name}</h5>
//       <p class="card-text">${fruits[i].memo}</p>
//       <button class="btn btn-primary">담기</button>
//     </div>
//   </div>`;

//   document.querySelector('.row').appendChild(all);

// }


const rowBox = $('.row');

fruits.forEach((fruit) => {
  let content = 
    `<div class="col">
      <div class="card" style="width: 18rem;">
        <img src="../img/${fruit.name}.jpg" class="card-img-top">
        <div class="card-body">
          <h5 class="card-title">${fruit.name}</h5>
          <p class="card-text">${fruit.memo}</p>
          <button class="btn btn-primary cart">담기</button>
        </div>
      </div>
    </div>`;
  
  rowBox.append(content);
})

// let arr = [1,2,3,4,5];
// localStorage.setItem('arr', arr);
// let arr2 = localStorage.getItem('arr');
// console.log(arr2, typeof arr2);

// let user = {
//   name : '홍길동',
//   age : 20
// };
// localStorage.setItem('user', JSON.stringify(user));
// let user2 = localStorage.getItem('user');
// user2 = JSON.parse(user2);
// console.log(user2, typeof user2);


// document.querySelectorAll('.cart')[0]
//         .addEventListener('click', function() {
//           alert('hi');

// })

$('.cart').on('click', function(event) {
  // js
  console.log(event.target.previousElementSibling.previousElementSibling);
  // Jquery
  let name = $(event.target).siblings('h5').text();
  console.log(name);

  if(localStorage.getItem('fruits') == null) {
    localStorage.setItem('fruits', JSON.stringify([{'name' : name, 'cnt' : 1}]));
  } else {
    let temp = JSON.parse(localStorage.getItem('fruits'));
    let index; // 장바구니에 담을 과일이 몇번쨰 배열에 위치하는지 저장할 변수
    let isHave; // 로컬스토리지에 담을 과일이 있냐 없냐를 저장하는 변수

    temp.forEach((data, i) => {
      if(name == data.name) {
        index = i;
        isHave = true;
      }
    })

    if(isHave) {
      // 로컬스토리지에 그거 있음
      temp[index].cnt++;
    } else {
      // 로컬스토리지에 없음
      temp.push({'name' :  name, 'cnt' : 1});
    }

    localStorage.setItem('fruits', JSON.stringify(temp));
    // let item = localStorage.getItem('name'); // String으로 변환
    // item = JSON.parse(item); // 배열로 변환
    // item.push(name);
    // console.log(item);
    // localStorage.setItem('name', JSON.stringify(item));
  }

})

let list = JSON.parse(localStorage.getItem('fruits'));

list.forEach((data) => {
  $('.list').append(`<div>과일명 : ${data.name} 수령 : ${data.cnt}</div>`);
})

