<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
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
	<h1>로그인페이지</h1>
		<form method="post" action="login.do">
			<p>로그인</p>
			아이디 <input type="text" name="id"><br>
			비밀번호 <input type="text" name="pass"><br>
			레벨 <select name="lev">
				<option value="B">일반회원</option>
				<option value="A">운영자</option>
			</select> <br>
			<input type="submit" value="로그인">
			<input type="reset" value="취소">
		</form>
		<p>${message}</p>
	</div>

</body>
</html>