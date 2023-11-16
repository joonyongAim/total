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

	<table>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>권한</th>
		</tr>
		<c:forEach items="${empList}" var="emp">
			<tr>
				<th>${emp.id}</th>
				<th>${emp.pass }</th>
				<th>${emp.name }</th>
				<th>${emp.lev == "A" ? "관리자" : "일반회원"}</th>
			</tr>
		</c:forEach>
	</table>

</body>
</html>