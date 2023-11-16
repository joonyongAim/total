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
	<c:set var="msg" value="hello" />
	
	<c:remove var="msg"/>
	<h1>${msg}</h1>
	
	<c:set var="age">
		30
	</c:set>
	<h1>${age}</h1>
	
	<c:set var="member" value="<%=new sample.javabeans.MemberBean() %>" />
	<c:set target="${member}" property="name" value="고길동" />
	<c:set target="${member}" property="userid" value="qwer" />
	
	<h1>${member}</h1>
	<h1>${member.name}</h1>
	<h1>${member.userid}</h1>
	
	<c:set var="add" value="${10+5}" />
	<h1>${add}</h1>
	
	<c:set var="flag" value="${10 > 5}" />
	<h1>${flag}</h1>
	
</body>
</html>