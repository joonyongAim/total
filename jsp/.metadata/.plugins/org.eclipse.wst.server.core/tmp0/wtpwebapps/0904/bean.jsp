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
	request.setCharacterEncoding("UTF-8"); 
%>

	<jsp:useBean id="member" class="sample.javabeans.MemberBean" />
	<jsp:setProperty property="*" name="member"/>
	
	<p>이름 : <jsp:getProperty property="name" name="member"/></p>
	<p>아이디 : <jsp:getProperty property="userid" name="member"/></p>
	<p>별명 : <jsp:getProperty property="nickname" name="member"/></p>
	<p>비밀번호 : <jsp:getProperty property="pwd" name="member"/></p>
	<p>이메일 : <jsp:getProperty property="email" name="member"/></p>
	<p>전화번호 : <jsp:getProperty property="phone" name="member"/></p>
</body>
</html>