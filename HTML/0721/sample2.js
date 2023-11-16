// 문자로 형변환
let value = 10;
console.log(typeof value);
value = String(value);
console.log(typeof value);
value = true;
console.log(value);
console.log(typeof value);
value = String(value);
console.log(value);
console.log(typeof value);

value = null;
console.log(value);
console.log(typeof value);
value = String(value);
console.log(value);
console.log(typeof value);

// 숫자형 변환

console.log('6' / '2'); // 묵시적 형변환

let str = '123';
str = Number(str);
console.log(str, typeof str);

let str1= 'abc123';
str1 = Number(str1);
console.log(str1, typeof str1);

let data;
console.log(typeof data);

data = Number(data);
console.log(data, typeof data);

data = null;
data = Number(data);
console.log(data, typeof data);

data = true; // false -> 0으로 변환
data = Number(data);
console.log(data, typeof data);

data = '1 2 3';
data = Number(data);
console.log(data, typeof data);

data = '          ';
data = Number(data);
console.log(data, typeof data);

// boolean 형변환
let bool = 1;
bool = Boolean(bool);
console.log(bool, typeof bool);

bool = 'true';
bool = Boolean(bool);
console.log(bool, typeof bool);

// 연산자
// + - * / %
// ** : 거듭제곱

let a, b, c;

a = b = c = 5 + 10;
console.log(c, b, a);

c = 5 + 10;
b = c;
a = c;

let value1 = 123;
let value2 = '123';

console.log(value1 == value2); // 동등 연산자
console.log(value1 === value2); // 일치 연산자

// != 동등    !== 일치

value1 = 0;
value2 = false;
console.log(value1 == value2);

// 조건문
// if
//let age = Number(prompt('나이를 입력하세요'));
let age = 50;

if(age >= 20) {
  console.log('성인');
} else {
  console.log('청소년');
}

let result = age >= 20 ? "성인" : "청소년";
console.log(result);

let num = 3;

switch(num) {
  case 1:
    console.log('num이 1일때 실행');
    break;
  case 2:
    console.log('num이 2일때 실행');
    break;
  case 3:
    console.log('num이 3일때 실행');
    break; 
  default:
    console.log("num이 1,2,3이 아닐경우 실행");
}
/*
let password = prompt("비밀번호 입력받아");

 if(Number(password) === 1234) {
  alert("로그인 성공");
} else if(password === null || password === "") {
  alert("로그인 취소");
} else {
  alert("비밀번호 오류");
} */

// 반복문
for(let i=0; i<10; i++) {
  console.log(i);
}

let i = 0;
while(i<10) {
  console.log(" while문 : " + i);
  i++;
}

outer;
for(i=0; i<5; i++) {
  for(let j=0; j<10; j++) {

    if(j === 5)
  

    console.log(i);

  }
}

i = 0;
do {
  console.log(i);
  i++;
} while(i < 5);