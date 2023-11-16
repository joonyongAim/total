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
		int num5 = Integer.parseInt(request.getParameter("n5"));
	
		int sum=0; 
	
		for(int i=1; i<=num5; i++) {
			sum = sum + i;
		}
	%>
	
	<%=sum %>
	

</body>
</html>