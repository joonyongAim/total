<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인</h2>
	
	<form method="post" action="login.do" name="frm">
		아이디 <input type="text" name="userid" value="${userid}"> <br>
		암호 <input type="password" name="pwd"> <br>
		<input type="submit" value="로그인" onclick="return loginCheck()">
		<input type="reset" value="취소">
		<input type="button" value="회원 가입" onclick="location.href='join.do'">
	</form>
	<br>
	<span>${message}</span>
	
	<script src="script/member.js"></script>
</body>
</html>