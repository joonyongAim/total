let arr = [1,2,3,4,5];
let arr2 = [10,20,30];

let copy2 = [arr, arr2];
// Spread
let copy = [...arr, ...arr2, 100];
console.log(copy2);
console.log(copy);

let user = {
  name: '고길동',
  age: 20
};

let admin = {
  ...user
};

// for(let key in user) {
//   admin[key] = user[key];
// }
user.name='홍길동';

console.log(user);
console.log(admin);



user = {
  name: '고길동',
  age: 20,
  phone: '123-4567-1122'
};

let name2 = user.name;
let age2 = user.age;
console.log(name2, age2);
// Destructuring
let {name, age, phone} = user;
console.log(name,age,phone);

arr = ['abc', 'qwer'];

let [first, second] = arr;

console.log(first);
console.log(second);




function person(name) {
  this.name = name;

  this.fn = function() {
    console.log('hi');
  }
}

let p1 = new person('홍길동');

console.log(p1);

