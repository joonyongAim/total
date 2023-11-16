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

	<jsp:useBean id="board" class="com.mission.javabeans.BoardBean" />
	<jsp:setProperty property="*" name="board"/>
	
	<h1>입력 완료된 정보</h1>
	
	<p>작성자 <jsp:getProperty property="name" name="board"/></p>
	<p>비밀번호 <jsp:getProperty property="pass" name="board"/></p>
	<p>이메일 <jsp:getProperty property="email" name="board"/></p>
	<p>글제목 <jsp:getProperty property="title" name="board"/></p>
	<p>글내용 <jsp:getProperty property="content" name="board"/></p>

</body>
</html>