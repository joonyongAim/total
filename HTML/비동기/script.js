// setTimeout(() => {
//   document.querySelector('.alert').style.display = 'none';
// }, 5000);

// setInterval(() => {
//   console.log(1);
// }, 1000);

// let t = 5;
// let interval = setInterval(() => {
//                   t--;
//                   document.querySelector('.time').innerHTML = t;
//                   }, 1000);

// setTimeout(() => {
//   clearInterval(interval);
//   document.querySelector('.alert').style.display = 'none';
// }, 6000)

// console.log(data.getFullYear()); // 년
// console.log(data.getMonth()); // 월 (0~11)
// console.log(data.getDay()); // 요일 (일요일:0 ~ 토요일:7)
// console.log(data.getDate()); // 일
// console.log(data.getHours()); // 시
// console.log(data.getMinutes()); // 분
// console.log(data.getSeconds()); // 초

function showClock() {
  const data = new Date(); // 날짜 객체 생성

  let hour = String(data.getHours()).padStart(2,0);
  let minute = String(data.getMinutes()).padStart(2,0);
  let second = String(data.getSeconds()).padStart(2,0);

  let time = `${data.getHours()}:${data.getMinutes()}:${data.getSeconds()}`

  const clock = document.querySelector('.clock');
  clock.innerHTML = time;
}

showClock();
setInterval(showClock, 1000);

