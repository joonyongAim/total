let div = document.createElement('div');

div.className = 'alert';
div.innerHTML = '새로만든 div';

// document.body.append(div); // 마지막에 삽입
// document.body.prepend(div); // 처음에 삽입
// document.body.before(div); // 해당 요소 이전에 삽입
// document.body.after(div); // 해당 요소 다음에 삽입

let test = document.getElementById('test');

let a = '<div class="alert"><b>추가</b></div>'

test.insertAdjacentHTML('beforebegin', a);
test.insertAdjacentHTML('afterend', '<p>bye</p>');
console.log('실행전', test)
test.insertAdjacentHTML('beforeend', '<p>안쪽 마지막</p>');
console.log('beforeend실행후', test)
test.insertAdjacentHTML('afterbegin', '<p>안쪽 첫번째</p>');
console.log('afterbegin실행후', test)

test.remove();

let test2 = test.cloneNode(true);
document.body.prepend(test2);