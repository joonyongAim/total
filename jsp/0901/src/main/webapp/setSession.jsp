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
	session.setAttribute("id", "qwer");
	session.setAttribute("pw", "1234");
	session.setAttribute("age", 20);
%>
	<a href="getSession.jsp">세션확인</a>

</body>
</html>