<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="now" value="<%=new Date() %>"></c:set>
	<p>${now}</p>
	
	<p><fmt:formatDate value="${now}" type="date" /></p>
	<p><fmt:formatDate value="${now}" type="time" /></p>
	<p><fmt:formatDate value="${now}" type="both" /></p>
	
	<p><fmt:formatDate value="${now}" type="both" dateStyle="default" timeStyle="default" /></p>
	<p><fmt:formatDate value="${now}" type="both" dateStyle="short" timeStyle="short" /></p>
	<p><fmt:formatDate value="${now}" type="both" dateStyle="medium" timeStyle="medium" /></p>
	<p><fmt:formatDate value="${now}" type="both" dateStyle="long" timeStyle="long" /></p>
	<p><fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full" /></p>
	
	<p><fmt:formatDate value="${now}" pattern="yyyy년 MM월 dd일 E hh시 mm분 ss초" var="date" /></p>
	
	<fmt:timeZone value="GMT">
		<p><fmt:formatDate value="${now}" type="both" /></p>
	</fmt:timeZone>
	
	<fmt:timeZone value="CET">
		<p><fmt:formatDate value="${now}" type="both" /></p>
	</fmt:timeZone>
	
	<fmt:setLocale value="ja_jp"/>
	<fmt:formatNumber value="10000" type="currency" />
	<fmt:formatDate value="${now}" />
	
	<fmt:setLocale value="en_us"/>
	<fmt:formatNumber value="10000" type="currency" />
	<fmt:formatDate value="${now}" />
</body>
</html>