<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = (String)session.getAttribute("name");

	if(name == null) 
		response.sendRedirect("login.jsp");
%>
	<h1>로그인 성공</h1>
	<h2><%=name %>님 환영합니다.</h2>
	<form action="logout.jsp">
		<input type="submit" value="로그아웃">
	</form>
</body>
</html>