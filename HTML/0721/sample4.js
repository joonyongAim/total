let arr = [1,2,'asd',3,4, true];
console.log(arr);
console.log(arr[0]);

// arr.push('새로추가');
// arr.unshift('앞에추가');
// console.log(arr.pop());
// arr.shift();
arr.splice(2,3);

for(let i=0; i<arr.length; i++) {
  console.log(arr[i], typeof arr[i]);
}

arr.forEach(data => {
  console.log(data);
})

for(let data in arr) {
  console.log(arr[data]);
}

for(let data of arr) {
  console.log(data);
}

// Object
let user = {
  name : '홍길동',
  age : 30,
  'nick name' : '별명'
};

console.log(user);
console.log(user.name);
console.log(user.age);
console.log(user['nick name']);

/*let fruit = prompt('과일 입력하셈');

let cart = {
  [fruit] : 5
};

console.log(cart[fruit]);
cart.price = 1000;

console.log(cart);*/

function makePerson(name,age) {
  return {
    name,
    age
  };
}

// let p1 = makePerson('고길동', 50);

let persons = [];

for(let i=0; i<10; i++) {
  persons.push(makePerson('사람' + i, i + 10));
}

console.log(persons);

let p1 = makePerson('고길동', 50);

for(let key in p1) {
  console.log(key, p1[key]);
}

let codes = {
  '44' : 'a',
  '43' : 'b',
  '30' : 'c',
  '60' : 'd',
  '1' : 'f'
};

for(let key in codes) {
  console.log(key, codes[key]);
}

let player = {
  name : '고길동',
  age : 20
};

player.showHi = () =>{
  console.log('hi');
};

console.log(player);
player.showHi();

function showHi2() {
  console.log('hi2');
}

player.showHi2 = showHi2;
console.log(player);
player.showHi2();

let player2 = {
  name: '홍길동',
  age: 20,
  showHello: function() {
    console.log('hello');
  },
  showBye() {
    console.log(player2.name + 'bye');
  }
};

/*let p3 = player2;
player2 = null;
p3.showBye();

player2.showHello();
player2.showBye();*/


// let al = {
//   name: '홍길동'
// }
// let a2 = {
//   name: '고길동'
// }
// let name = '이름';
// function fnHi() {
//   console.log(this.name);
// }

// a1.f = fnHi;
// a2.f = fnHi;

// a1.f();
// a2.f();

let calc = {
  read() {
    this.x = Number(prompt('값입력하셈'));
    this.y = Number(prompt('값입력하셈'));
  },

  sum() {
    return this.x + this.y;
  },

  mul() {
    return this.x * this.y;
  }
};

calc.read();

console.log( calc.sum() );
console.log( calc.mul() );
