<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>second page</h1>
	<h1>page : <%=pageContext.getAttribute("name") %></h1>
	<h1>request : <%=request.getAttribute("name") %></h1>
	<h1>session : <%=session.getAttribute("name") %></h1>
	<h1>application : <%=application.getAttribute("name") %></h1>
	
	<a href="third.jsp">이동</a>

</body>
</html>