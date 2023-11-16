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
	
	<jsp:useBean id="movie" class="com.mission.javabeans.MovieBean" />
	<jsp:setProperty property="*" name="movie"/>
	
	<h1>입력 완료된 정보</h1>
	
	<p>제목 <jsp:getProperty property="title" name="movie"/></p>
	
	<p>가격 <jsp:getProperty property="price" name="movie"/>원</p>
	
	<p>감독 <jsp:getProperty property="director" name="movie"/></p>
	
	<p>출연배우 <jsp:getProperty property="actor" name="movie"/></p>
	
	<p>시놉시스 <textarea rows="10" cols="30"><jsp:getProperty property="synopsis" name="movie"/></textarea></p>
	
	<p>장르 <jsp:getProperty property="genre" name="movie"/></p>
	
	<h1>EL로 할경우</h1>
	<p>${movie.title}</p>
	<p>${movie.price}</p>
	<p>${movie.director}</p>
	<p>${movie.actor}</p>
	<p>${movie.synopsis}</p>
	<p>${movie.genre}</p>
	
	
</body>
</html>