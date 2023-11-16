<%@page import="java.sql.PreparedStatement"%>
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
	
	<form method="post" action="eremoveResult.jsp">
		<h1>사원삭제페이지</h1>
		<h3>삭제할 사원번호를 입력해주세요</h3>
		<input type="text" name="enumber">
		<input type="submit" value="삭제">
	</form>

</body>
</html>