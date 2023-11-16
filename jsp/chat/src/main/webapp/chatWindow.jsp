<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#chatWindow {
		border: 1px solid black;
		width: 330px;
		height: 400px;
		overflow: scroll;
	}
	
	.myMsg {
		color : skyblue;
	}
	
	.dm {
		color : blue;
	}
</style>
</head>
<body>
	
	<div>
		닉네임 : <input id="chatId" type="text" value="${param.chatId}" readonly>
		<button id="exitBtn" onclick="disconnect()">채팅종료</button>
	</div>
	<div id="chatWindow"></div>
	<div>
		<input type="text" id="msg" onkeyup="enterKey()">
		<button id="sendBtn" onclick="sendMsg()">전송</button>
	</div>
	
	<script src="chat.js"></script>
</body>
</html>