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
		String userId = "qwer";
		String userPw = "1234";
		String name = "고길동";
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals(userId) && pw.equals(userPw)) {
			session.setAttribute("name", name);
			
			response.sendRedirect("success.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	%>

</body>
</html>