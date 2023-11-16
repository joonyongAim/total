<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
	PreparedStatement stmt = conn.prepareStatement("select * from item");
	ResultSet rs = stmt.executeQuery();
	
	while(rs.next()) {
		out.print("<tr>");
		out.print("	<td>" + rs.getString("name") + "</td>");
		out.print("	<td>" + rs.getString("address") + "</td>");
		out.print("	<td>" + rs.getString("ssn") + "</td>");
		out.print("</tr>");
	}
%>
	
</body>
</html>