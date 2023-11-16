<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int result = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int num3 = Integer.parseInt(request.getParameter("n3"));
		
		result = result + num3;
	%>
	
	<h1><%=result%></h1>
	

</body>
</html>