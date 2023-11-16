<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시판 글쓰기</h3>
	<form method="post" action="boardWrite.jsp">
		작성자 <input type="text" name="name"> <br><br>
		비밀번호 <input type="password" name="pass"> (게시글 수정 삭제시 필요합니다.) <br><br>
		이메일 <input type="text" name="email"> <br><br>
		글 제목 <input type="text" name="title"> <br><br>
		글 내용 <textarea rows="10" cols="30" name="content"></textarea> <br><br>
		<input type="submit" value="등록">
		<input type="submit" value="다시 작성">
		
	</form>

</body>
</html>