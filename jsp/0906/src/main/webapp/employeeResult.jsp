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
	String name = request.getParameter("name");
	String birthday = request.getParameter("birthday");
	String ename = request.getParameter("ename");
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, "scott", "tiger");
		
		String sql = "insert into 사원 values(?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, enumber);
		pstmt.setString(2, name);
		pstmt.setString(3, birthday);
		pstmt.setString(4, ename);
		
		pstmt.executeUpdate();
		out.print("<h1>등록 완료</h1>");
	} catch (Exception e) {
		out.print("<h1>등록 실패</h1>");
	} finally {
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	}
%>

<a href="employeeInfo.jsp">사원목록페이지</a> <br>
<a href="employee.jsp">사원등록페이지</a>

</body>
</html>