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
	String name = (String)request.getAttribute("name");
	String age = request.getParameter("age");
%>
	<h1>이름 : <%=name%> 나이 : <%=age%></h1>
	
</body>
</html>