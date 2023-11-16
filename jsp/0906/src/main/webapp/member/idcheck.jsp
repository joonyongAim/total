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
	<h2>아이디 중복확인</h2>
	<form action="idCheck.do" name="frm">
		아이디 <input type="text" name="userid" value="${userid}">
		<input type="submit" value="중복체크"><br>
	</form>
	
	<c:if test="${result == 1}">
		<script>
			opener.document.frm.userid.value = "";
		</script>
		<p>${userid}는 이미 사용 중인 아이디입니다.</p>
	</c:if>
	<c:if test="${result == -1}">
		<p><span class="checkId">${userid}</span>는 사용 가능한 아이디입니다.
		<input type="button" value="사용" class="cancel" onclick="idok()">
		</p>
	</c:if>
	
	<script src="script/member.js"></script>
</body>
</html>