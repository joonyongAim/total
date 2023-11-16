const url = "ws://172.30.1.86:8181/chat/chatingServer";

let webSocket = new WebSocket(url);
let chatWindow = document.querySelector('#chatWindow');
let msg = document.querySelector('#msg');
let chatId = document.querySelector('#chatId');

function sendMsg() {
	chatWindow.innerHTML += '<div class="myMsg">' + msg.value + '</div>';
	webSocket.send(chatId.value + ":" + msg.value);
	msg.value = '';
	chatWindow.scrollTop = chatWindow.scrollHeight;
}

function enterKey() {
	if(window.event.keyCode == 13) {
		sendMsg()
	}
}

function disconnect() {
	webSocket.close();
}

webSocket.onopen = () => {
	chatWindow.innerHTML += '<div>채팅방에 접속하셨습니다</div>';
}

webSocket.onclose = () => {
	chatWindow.innerHTML += '<div>채팅방을 나가셨습니다</div>';
}

webSocket.onerror = () => {
	chatWindow.innerHTML += '<div>채팅서버 에러!!</div>';
}

webSocket.onmessage = (e) => {
	let rMsg = e.data.split(':');
	let sender = rMsg[0];
	let content = rMsg[1];
	
	if(content != '') {
		
		if(content.match('/')) {
			
			if(content.match('/' + chatId.value)) {
				let temp = content.replace('/' + chatId.value, '[DM] : ');
				chatWindow.innerHTML += '<div class="dm">' + sender + temp + '</div>';
			}
			
		} else {
			chatWindow.innerHTML += '<div>' + sender + " : " + content + '</div>';
		}
	}
	chatWindow.scrollTop = chatWindow.scrollHeight;
}