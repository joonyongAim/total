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
		int num = Integer.parseInt(request.getParameter("num"));
		String result;
	
		if(num % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
	%>
	
	<h1><%=result %></h1>

</body>
</html>