<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div {
		text-align: center;
	}
</style>
</head>
<body>
	<div>
	<h1>회원가입</h1>
		<form method="post" action="movieMembership">
			아이디 <input type="text" name="id"> <br> <br>
			비밀번호 <input type="text" name="pw"> <br> <br>
			이름 <input type="text" name="name"> <br> <br>
			<input type="submit" value="등록">
			<input type="reset" value="취소">
			<p>${message}</p>
		</form>
	</div>
</body>
</html>