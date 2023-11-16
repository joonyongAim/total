<%@page import="java.net.URLDecoder"%>
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
	String name = URLDecoder.decode(request.getParameter("name"), "utf-8");
%>
	<h1>사용자 페이지 입니다.</h1>
	<h2>사용자명 : <%=name%></h2>

</body>
</html>