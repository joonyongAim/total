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
		int end = Integer.parseInt(request.getParameter("end"));
		int sum=0; 
	%>
	<h1>1부터 <%=end %>까지 자연수 합 구하기</h1>
		<p>
	<%
		for(int i=1; i<end; i++) {
			sum = sum + i;
	%>
		<%=i %> + 
	<%
		}
	%>
		<%=end %> = <%=sum + end %>
		</p>
		
</body>
</html>