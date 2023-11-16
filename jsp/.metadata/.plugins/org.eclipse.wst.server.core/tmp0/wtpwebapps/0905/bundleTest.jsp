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

	<fmt:bundle basename="bundle.test" prefix="user_">
		<fmt:message key="name" />
		<fmt:message key="title" var="msg" />
	</fmt:bundle>
		
	<p>${msg}</p>
	
	<fmt:setBundle basename="bundle.test" var="test" />
	
	<fmt:message bundle="${test}" key="user_name" />
	
	


</body>
</html>