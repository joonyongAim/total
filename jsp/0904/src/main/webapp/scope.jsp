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
	pageContext.setAttribute("name", "page scope");
	request.setAttribute("name", "request scope");
	session.setAttribute("name", "session scope");
	application.setAttribute("name", "application scope");
%>
	<h1>${sessionScope.name}</h1>

</body>
</html>