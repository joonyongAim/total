<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<fmt:setLocale value="${param.lang}" />
	<fmt:setBundle basename="bundle.loginBundle" var="bundle"/>
	
	<h1><fmt:message key="msg" bundle="${bundle}" /></h1>
	<a href="?lang=ko">한국어</a> | <a href="?lang=en">English</a>
	
	<form action="#">
		<p>
			<fmt:message key="id" bundle="${bundle}" /> :
			<input type="text">
		</p>
		<p>
			<fmt:message key="pw" bundle="${bundle}" /> :
			<input type="text">
		</p>
		<input type="submit" value='<fmt:message key="btn" bundle="${bundle}" />'>
	</form>

</body>
</html>