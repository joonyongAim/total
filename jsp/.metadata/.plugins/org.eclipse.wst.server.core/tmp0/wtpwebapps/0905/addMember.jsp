<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	
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
	String name = request.getParameter("name");
	String userid = request.getParameter("userid");
	String pwd = request.getParameter("pwd");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	int admin = Integer.parseInt(request.getParameter("admin"));
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, "scott", "tiger");
		stmt = conn.createStatement();
		
		String sql = "insert into member values('" + name + "', '" + userid + "', '" + pwd + "', '" + email + "', '" + phone + "', " + admin + ")";
		stmt.executeUpdate(sql);
		/* String sql = "insert into member values(?, ?, ?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, name);
		pstmt.setString(2, userid);
		pstmt.setString(3, pwd);
		pstmt.setString(4, email);
		pstmt.setString(5, phone);
		pstmt.setInt(6, admin);
		
		
		pstmt.executeUpdate(); */
		out.print("<h1>DB저장 성공</h1>");
	} catch(Exception e) {
		e.printStackTrace();
		out.print("<h1>DB저장 실패</h1>");
	} finally {
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	}

%>

</body>
</html>