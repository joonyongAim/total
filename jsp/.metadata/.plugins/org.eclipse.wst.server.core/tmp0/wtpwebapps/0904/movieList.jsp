<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] movieList = { "타이타닉", "시네마 천국", "혹성 탈출", "킹콩" };
	pageContext.setAttribute("movieList", movieList);
%>

	<c:forEach items="${movieList}" var="movie" varStatus="s">
		<span>first : ${s.first}</span>
		<span>last : ${s.last}</span>
		<span>인덱스 : ${s.index}</span>
		<span>카운트 : ${s.count}</span>
		<span>${movie}</span><br>
	</c:forEach>
	
	<c:forEach var="cnt" begin="1" end="5" step="2">
		<span>${cnt}</span><br>
	</c:forEach>
</body>
</html>