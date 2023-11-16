<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String enumber = request.getParameter("enumber");
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, "scott", "tiger");
		
		String sql = "delete from 사원 where 사원번호=?";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, enumber);
		
		pstmt.executeUpdate();
		out.print("<h1>삭제 완료</h1>");
	} catch (Exception e) {
		out.print("<h1>삭제 실패</h1>");
	} finally {
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	}
	
	%>
	<a href="employeeInfo.jsp">사원목록페이지</a> <br>
	<a href="employeeRemove.jsp">사원삭제페이지</a>
</body>
</html>