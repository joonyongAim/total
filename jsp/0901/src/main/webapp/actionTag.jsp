<%@page import="java.net.URLEncoder"%>
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
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String loginCheck = request.getParameter("loginCheck");
	
	if(loginCheck.equals("관리자")) {
%>
	<jsp:forward page="adminPage.jsp">
		<jsp:param value='<%=URLEncoder.encode("고길동", "utf-8") %>' name="name"/>
	</jsp:forward>
<%
	} else {
%>
		<jsp:forward page="userPage.jsp">
			<jsp:param value='<%=URLEncoder.encode("홍길동", "utf-8") %>' name="name"/>
		</jsp:forward>
<%
	}
%>

</body>
</html>