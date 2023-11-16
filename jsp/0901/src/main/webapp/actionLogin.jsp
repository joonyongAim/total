<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="actionTag.jsp">
		ID : <input type="text" name="id">
		PW : <input type="text" name="pw"><br>
		<input type="radio" name="loginCheck" value="사용자">사용자
		<input type="radio" name="loginCheck" value="관리자">관리자
		<input type="submit" value="로그인">
	</form>

</body>
</html>