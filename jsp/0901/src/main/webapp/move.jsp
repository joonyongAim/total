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
	request.setAttribute("name", "request");
	// RequestDispatcher rd = request.getRequestDispatcher("second.jsp");
	// rd.forward(request, response);
%>
	<jsp:forward page="second.jsp" >
		<jsp:param value="1234" name="num"/>
	</jsp:forward>
	
</body>
</html>