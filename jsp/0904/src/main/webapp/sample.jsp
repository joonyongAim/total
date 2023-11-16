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
	String id = request.getParameter("id");
%>
	1. <%=id == "abc"%> <br>
	2. <%=id.equals("abc") %> <br>
	3. ${param.id == "abc"}
</body>
</html>