<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container my-3 text-center">
		<table class="table table-striped">
			<thead class="table-dark">
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일자</th>
					<th>조회수</th>
				</tr>
			</thead>
			<c:forEach items="${BoardList}" var="board">
				<tr>
					<td>${board.no}</td>
					<td><a href="boardDetail.do?no=${board.no}">${board.title}</a></td>
					<td>${board.id}</td>
					<td>${board.postdate}</td>
					<td>${board.visitcount}</td>
				</tr>
			</c:forEach>
		</table>
		<c:if test="${paging.page != 1}">
		<a class="btn ${page == paging.page ? 'btn-dark' : 'btn-outline-dark'}" href="boardlist.do?page=${paging.page - 1}&searchWord=${param.searchWord}">이전</a>
		</c:if>
		<c:forEach begin="1" end="${paging.totalPage}" step="1" var="page">
			<a class="btn ${page == paging.page ? 'btn-dark' : 'btn-outline-dark'}" href="boardlist.do?page=${page}&searchWord=${param.searchWord}">${page}</a>
		</c:forEach>
		<a class="btn ${page == paging.page ? 'btn-dark' : 'btn-outline-dark'}" href="boardlist.do?page=${paging.page + 1}&searchWord=${param.searchWord}">다음</a>
	</div>
</body>
</html>