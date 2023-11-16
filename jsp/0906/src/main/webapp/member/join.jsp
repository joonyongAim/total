<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>회원가입</h2>
	
	<form action="join.do" method="post" name="frm">
		이름 <input type="text" name="name">*<br>
		아이디 <input type="text" name="userid">*
			<input type="hidden" name="reid">
			<input type="button" value="중복체크" onclick="idCheck()"><br>
		비밀번호 <input type="password" name="pwd">*<br>
		비밀번호 확인 <input type="password" name="pwd_check">*<br>
		이메일 <input type="text" name="email"><br>
		전화번호 <input type="text" name="phone"><br>
		등급 <input type="radio" name="admin" value="0"> 일반회원
		<input type="radio" name="admin" value="1"> 관리자 <br>
		<input type="submit" value="가입" onclick="return joinCheck()"><br>
	</form>
	<span>${message}</span>
	
	<script src="script/member.js"></script>
</body>
</html>