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
	
	<p><fmt:formatNumber value="123456.78" /></p>
	<p><fmt:formatNumber value="123456.78" groupingUsed="false" /></p>
	<p><fmt:formatNumber value="0.5" type="percent" /></p>
	<p><fmt:formatNumber value="123456" type="currency" /></p>
	<p><fmt:formatNumber value="123456" type="currency" currencySymbol="$" /></p>
	<p><fmt:formatNumber value="123456.78" pattern="0.0" /></p>
	<p><fmt:formatNumber value="123456.78" pattern="$#,##0.0" var="num" /></p>
	
	${num }
</body>
</html>