<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>메일 전송</h1>
	<form method="post" action="send">
		받는 사람 : <input type="text" name="to"><br>
		제목 : <input type="text" name="subject"><br>
		내용 : <textarea rows="8" cols="40" name="content"></textarea>
		<br>
		<input type="submit" value="전송">
	</form>
	<h3>${msg}</h3>
</body>
</html>