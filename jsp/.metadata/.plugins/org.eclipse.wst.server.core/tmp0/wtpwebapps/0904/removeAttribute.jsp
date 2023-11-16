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
	session.setAttribute("name1", "첫번째 값");
	session.setAttribute("name2", "두번째 값");
	session.setAttribute("name3", "세번째 값");
	
	out.print("세션 삭제 전<br>");
	
	Enumeration<String> names = session.getAttributeNames();
	
	while(names.hasMoreElements()) {
		String name = names.nextElement();
		String value = session.getAttribute(name).toString();
		out.print(name + " : " + value + "<br>");
	}
	
	session.removeAttribute("name2");
	
	out.print("name2삭제 후 <br>");
	
	names = session.getAttributeNames();
	
	while(names.hasMoreElements()) {
		String name = names.nextElement();
		String value = session.getAttribute(name).toString();
		out.print(name + " : " + value + "<br>");
	}
%>

</body>
</html>