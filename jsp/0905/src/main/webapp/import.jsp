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
	<c:url var="token" value="http://localhost:8181/0905/forToken.jsp" />
	${token}
	
	<c:redirect url="forToken.jsp" />
	<c:import var="page" url="${token}" />
	
	${page}
	
	<hr>
	
	${page}
	
	<c:catch var="errmsg">
		<p>대충 내용 구현</p>
		<%=1/0 %>
		<p>대충 내용 구현2222</p>
	</c:catch>
	
	${errmsg}
</body>
</html>