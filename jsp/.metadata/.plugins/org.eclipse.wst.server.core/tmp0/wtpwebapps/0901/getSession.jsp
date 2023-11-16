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
	String id = (String) session.getAttribute("id");
	String pw = (String) session.getAttribute("pw");
	Integer age = (Integer) session.getAttribute("age");
	
	Enumeration<String> names = session.getAttributeNames();
	
	while(names.hasMoreElements()) {
		String name = names.nextElement();
		String value = (String)session.getAttribute(name).toString();
		out.print("<h2>" + name + " : " + value + "</h2>");
	}
%>
	<h3><%=id %></h3>
	<h3><%=pw %></h3>
	<h3><%=age %></h3>
</body>
</html>