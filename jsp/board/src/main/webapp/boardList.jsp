<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="boardWrite.jsp">게시물 등록</a>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		
		<c:forEach items="${boards}" var="board">
			<tr>
				<td>${board.num}</td>
				<td><a href="board?command=boardDetail&num=${board.num}">${board.title}</a></td>
				<td>${board.name}</td>
				<td>
					<fmt:formatDate value="${board.writedate}"/>
				</td>
				<td>${board.readcount}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>