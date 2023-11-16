<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>사원정보</h1>
	<p>${message}</p>
	
	<p>아이디 : ${loginUser.id}</p>
	<p>비밀번호 : ${loginUser.pass}</p>
	<p>이름 : ${loginUser.name}</p>
	<p>권한 : ${loginUser.lev == "A" ? "관리자" : "일반회원"}</p>
	<p>성별 : ${loginUser.gender == "1" ? "남자" : "여자"}</p>
	<p>전화번호 : ${loginUser.phone}</p>
	
	<form action="main.jsp">
		<input type="submit" value="메인페이지">
	</form>

</body>
</html>