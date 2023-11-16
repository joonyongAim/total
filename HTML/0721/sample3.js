/*function 함수이름(매개변수) {
  함수관련 코드들
} */
let msg = "메세지 내용";

function showMsg() {
  let msg = "메세지 변경";
  
  // console.log("JS Function");
  console.log(msg);
}

console.log(msg); 
showMsg();
console.log(msg);

function showMsg2(msg) {
  console.log(msg);
}

showMsg2("매개변수 내용");

function add(x, y) {
  return x + y;
}

console.log(add(10, 5));

/* function checkAge(age) {
  if(age >= 18) {
    return true;
  } else {
    return confirm('보호자 동의가 필요함');
  }
}

let age = prompt('나이 입력');

if( checkAge(age)) {
  document.write('접속 성공');
} else {
  document.write('접속 실패');
}
*/

/*function min(x, y) {
  if(x > y) {
    return y;
  } else {
    return x;
  }
}

console.log(min(50, 20));

fn2();

// 함수 선언문
function fn2() {
  console.log('함수선언문');
}

// 함수 표현식
let fn = function() {
  console.log('함수표현식');
};
*/

// 콜백 함수
function ask(question, yes, no) {
  if(confirm(question)) {
    yes();
  } else {
    no();
  }
}

function showOk() {
  alert('확인버튼 누름');
}

function showCancel() {
  alert('취소버튼 누름');
}

// ask('컴펌창 띄움', showOk, showCancel);

function buy(item, price, ea, callback) {
  console.log(`${item}을 ${ea}개 가짐`)
  console.log('계산중임...');

  setTimeout(function() {
    let total = price * ea;
    callback(total);
  }, 3000);
}

function pay(n) {
  console.log(`총 금액 ${n}원`);
}

buy('과자', 2500, 5, pay);

// 즉시 실행 함수
(function() {
  console.log('asdasd');
})();

age = 10;
let showHi

if(age < 18) {
  showHi = function() {
    console.log('안녕');
  }
} else {
  showHi = function() {
    console.log('안녕하십니까');
  }
}

showHi();

// 화살표 함수 (람다)

let sum = function(x, y) {
  return x + y;
};

let sum2 = (x, y) => {
  return x + y;
};

let sum3 = (x, y) => x + y;

let sum4 = function(x) {
  return x + 10;
};

let sum5 = x => x + 10;

let showHello = () => {
  console.log('asd');
  console.log('asd');
  console.log('asd');
};