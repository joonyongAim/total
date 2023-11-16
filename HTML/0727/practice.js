const todos = document.getElementById('todos'); // form 태그
const todoList = document.querySelector('.todo-list');
const todoInput = document.querySelector('#todos > input');

let arrTodo = [];
console.log('arrTodo : ' + arrTodo);

let savedTodos = localStorage.getItem('todos');
savedTodos = JSON.parse(savedTodos);
if(savedTodos != null) {
  arrTodo = savedTodos;
  savedTodos.forEach((data) => {
    showTodo(data);
  })
}

// todo를 전송할떄 실행되는 함수
function todoSubmit(e) {
  e.preventDefault();
  let newTodo = todoInput.value;
  let newTodoObj = {
    'key' : Date.now(),
    'text' : newTodo
  };

  arrTodo.push(newTodoObj);
  console.log('arrTodo : ' + arrTodo)
  saveTodos();

  showTodo(newTodoObj);
  todoInput.value = '';
}

function saveTodos() {
  localStorage.setItem('todos', JSON.stringify(arrTodo));
}

// 내용을 받아와서 화면에 표시해주는 함수
function showTodo(newTodoObj) {
  const li = document.createElement('li');
  li.id = newTodoObj.key;
  const button = document.createElement('button');
  button.innerHTML = 'x';

  button.addEventListener('click', deleteTodo);

  li.innerHTML = newTodoObj.text;
  li.append(button);

  todoList.append(li);
}

function deleteTodo(event) {
  const removeLi = event.target.parentElement;
  removeLi.remove();
  // 로컬스토리지에 있는 것도 지워야함
 arrTodo = arrTodo.filter((data) => data.key != removeLi.id);

 localStorage.setItem('todos', JSON.stringify(arrTodo));
}

todos.addEventListener('submit', todoSubmit);





