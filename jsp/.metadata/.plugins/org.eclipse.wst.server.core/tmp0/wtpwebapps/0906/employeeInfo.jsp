<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String pwd = "tiger";
	String sql = "select * from 사원";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>사원정보</h1>

	<table width='500' border='1'>
		<tr>
			<th>사원번호</th>
			<th>이름</th>
			<th>생년월일</th>
			<th>부서명</th>
		</tr>
	<%
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, pwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				out.print("<tr>");
				out.print("	<td>" + rs.getString("사원번호") + "</td>");
				out.print("	<td>" + rs.getString("이름") + "</td>");
				out.print("	<td>" + rs.getString("생년월일") + "</td>");
				out.print("	<td>" + rs.getString("부서명") + "</td>");
				out.print(" <td><a href='employeeCorrection.jsp?enumber=" + rs.getString("사원번호") + "'>수정</a></td>");
				out.print("</tr>");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
		}
	%>
	</table>
	
	<a href="employee.jsp">사원등록페이지</a> <br>
	<a href="employeeRemove.jsp">사원삭제페이지</a>

	

</body>
</html>