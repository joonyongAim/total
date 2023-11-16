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

	<h2>회원 정보 수정</h2>
	
	<form method="post" action="memberUpdate.do" name="frm">
		이름 <input type="text" name="name" value="${vo.name}"> <br>
		아이디 <input type="text" name="userid" value="${vo.userid}"> <br>
		비밀번호 <input type="password" name="pwd"> <br>
		비밀번호 확인 <input type="password" name="pwd_check"> <br>
		이메일 <input type="text" name="email" value="${vo.email}"> <br>
		전화번호 <input type="text" name="phone" value="${vo.phone}"> <br>
		
		<c:choose>
			<c:when test="${vo.admin == 0}">
				<input type="radio" name="admin" value="0" checked> 일반회원
				<input type="radio" name="admin" value="1"> 관리자
			</c:when>
			<c:otherwise>
				<input type="radio" name="admin" value="0"> 일반회원
				<input type="radio" name="admin" value="1" checked> 관리자
			</c:otherwise>
		</c:choose>
			<br>
			<input type="submit" value="수정" onclick="return.joinCheck()">
	</form>
		
		<script type="script/member.js"></script>

</body>
</html>