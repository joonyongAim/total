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
	String selected = request.getParameter("selected");

	if(selected.equals("daum")) {
		response.sendRedirect("https://www.daum.net");
	} else {
		response.sendRedirect("https://www." + selected + ".com");
	}
	
%>

</body>
</html>