<%@page import="java.util.Enumeration"%>
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
		int age = Integer.parseInt(request.getParameter("age"));
		String category = request.getParameter("category");
		String[] color = request.getParameterValues("color");
		Enumeration<String> names = request.getParameterNames();
		
		while(names.hasMoreElements()) {
			out.print(names.nextElement()+"<br>");
		}
		
		
		out.print(age + "세기 가장 많이 구매한 " + category + "들을 조회합니다.<br><br>");
		

		if(color == null) {
			out.print("선호하는 색상이 없습니다.");
		} else {
			out.print("선호하는 색상 : ");
			for(String c : color) {
				out.print(c + " ");
			}
			out.print("입니다.");
		}
	
	%>

</body>
</html>