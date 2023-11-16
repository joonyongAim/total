const name = document.querySelector('.name');
const email = document.querySelector('.email');
const pw = document.querySelector('.pw');
const button = document.querySelector('.button');

const regexMail = /^([a-z]+\d*)+(\.?\w+)+@\w+(\.\w{2,3})+$/;

button.addEventListener("click", (e) => {
  e.preventDefault();

  if(name.value === "" || email.value === "" || pw.value === "")
    alert("모든 필드를 입력하세요.");
  else if(!regexMail.test(email.value))
    alert("유호한 이메일 주소를 입력하세요.");
  else {
    alert("회원가입 성공!");
  }
});