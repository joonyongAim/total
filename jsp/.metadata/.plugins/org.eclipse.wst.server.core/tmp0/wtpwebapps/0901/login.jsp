<%@page import="java.net.URLEncoder"%>
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
	String id = "qwer";
	String pw = "1234";
	String name = "고길동";
	
	String userId = request.getParameter("id");
	String userPw = request.getParameter("pw");
	
	if(id.equals(userId) && pw.equals(userPw)) {
		response.sendRedirect("success.jsp?name=" + URLEncoder.encode(name, "utf-8"));
	} else {
		response.sendRedirect("testLogin.jsp");
	}
%>

</body>
</html>