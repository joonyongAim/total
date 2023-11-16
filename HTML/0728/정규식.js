// 정규식 조건
const regexId = /^\w{8,20}$/;
const regexPw = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,20}$/;
const regexMail = /^([a-z]+\d*)+(\.?\w+)+@\w+(\.\w{2,3})+$/;
const regexTel = /^\d{2,3}-\d{3,4}-\d{4}$/;

const idBtn = document.querySelector('#id_confirm');
const pwBtn = document.querySelector('#pw_confirm');
const emailBtn = document.querySelector('#email_confirm');
const telBtn = document.querySelector('#phone_confirm');

const idCheck = document.querySelector('.id_input_check');
const pwCheck = document.querySelector('.pw_input_check');
const emailCheck = document.querySelector('.email_input_check');
const telCheck = document.querySelector('.phone_input_check');

let isId = false;
let isPw = false;
let isEmail = false;
let isTel = false;

const btns = document.querySelectorAll('.input_confirm_btn');

const regexs = [regexId, regexPw, regexMail, regexTel];
let isRegex = [false, false, false, false];

btns.forEach((btn, i) => {
  btn.addEventListener('click', (e) => {
    e.preventDefault();
    const pTage = e.target.previousElementSibling;
    const inputTag = pTage.previousElementSibling;
    let value = inputTag.value;

    if(regexs[i].test(value)) {
      pTage.innerHTML = '사용할 수 있습니다';
      pTage.style.color = 'blue';
      isRegex[i] = true;
    } else {
      pTage.innerHTML = '사용할 수 없습니다';
      pTage.style.color = 'red';
      isRegex[i] = false;
    }

    isCheck();
  })
})

function isCheck() {
  if(!isRegex.includes(false)) {
    document.querySelector('.reg_req_btn')
                                    .style.background = 'blue';
  } else {
    document.querySelector('.reg_req_btn')
                                    .style.background = 'darkgray';
  }
}

idBtn.addEventListener('click', (e) => {
  e.preventDefault();

  let id = document.querySelector('#id_txt').value;
  console.log(id);

  console.log(regexId.test(id));
  if(regexId.test(id)) {
    idCheck.innerHTML = '사용 가능한 아이디 입니다.';
    idCheck.style.color = 'blue';
    isId = true;
  } else {
    idCheck.innerHTML = '사용 불가능한 아이디 입니다.';
    idCheck.style.color = 'red';
    isId = false;
  }
  isCheck();
})

pwBtn.addEventListener('click', (e) => {
  e.preventDefault();

  let pw = document.querySelector('#pw_txt').value;
  console.log(pw);

  console.log(regexPw.test(pw));
  if(regexPw.test(pw)) {
    pwCheck.innerHTML = '사용 가능한 비밀번호 입니다.';
    pwCheck.style.color = 'blue';
    isPw = true;
  } else {
    pwCheck.innerHTML = '사용 불가능한 비밀번호 입니다.';
    pwCheck.style.color = 'red';
    isPw = false;
  }
  isCheck();
})

emailBtn.addEventListener('click', (e) => {
  e.preventDefault();

  let email = document.querySelector('#email_txt').value;
  console.log(email);

  console.log(regexMail.test(email));
  if(regexMail.test(email)) {
    emailCheck.innerHTML = '사용 가능한 이메일 입니다.';
    emailCheck.style.color = 'blue';
    isEmail = true;
  } else {
    emailCheck.innerHTML = '사용 불가능한 이메일 입니다.';
    emailCheck.style.color = 'red';
    isEmail = false;
  }
  isCheck();
})

telBtn.addEventListener('click', (e) => {
  e.preventDefault();

  let tel = document.querySelector('#phone_txt').value;
  console.log(tel);

  console.log(regexTel.test(tel));
  if(regexTel.test(tel)) {
    telCheck.innerHTML = '사용 가능한 전화번호 입니다.';
    telCheck.style.color = 'blue';
    isTel = true;
  } else {
    telCheck.innerHTML = '사용 불가능한 전화번호 입니다.';
    telCheck.style.color = 'red';
    isTel = false;
  }
  isCheck();
})

function isCheck() {
  if(isId && isPw && isEmail && isTel) {
    document.querySelector('.reg_req_btn').style.background = 'blue';
  } else {
    document.querySelector('.reg_req_btn').style.background = 'darkgray';
  }
}



