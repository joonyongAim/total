<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>게시글 상세보기</h1>
	<form method="post" action="board">
		<table>
			<tr>
				<th>작성자</th> <td>${board.name}</td> 
			</tr>
			<tr>
				<th>작성일</th> <td>${board.writedate}</td> 
			</tr>
			<tr>
				<th>이메일</th> <td>${board.email}</td> 
			</tr>
			<tr>
				<th>조회수</th> <td>${board.readcount}</td> 
			</tr>
			<tr>
				<th>제목</th> <td>${board.title}</td> 
			</tr>
			<tr>
				<th>내용</th> <td>${board.content}</td> 
			</tr>
		</table>
	<input type="button" value="게시글 수정" onclick="location.href='board?command=boardUpdate&num=${board.num}">
	<input type="button" value="게시글 삭제" onclick="location.href='board?command=boardDelete&num=${board.num}'">
	</form>
</body>
</html>