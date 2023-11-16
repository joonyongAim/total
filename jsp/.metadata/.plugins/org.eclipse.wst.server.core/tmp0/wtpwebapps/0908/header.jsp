<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td {
		border:1px solid black;
		width: 250px;
		text-align: center;
	}
</style>

</head>
<body>
	<table>
		<c:if test="${empty loginUser}">
			<tr>
				<td></td>
				<td></td>
				<td><a href="login.do">로그인</a></td>
				<td>사원등록</td>
				<td>마이페이지</td>
			</tr>
		</c:if>
		<c:if test="${!empty loginUser}">
			<tr>
				<td>${loginUser.name}님 반갑습니다.</td>
				<td>레벨 : ${loginUser.lev}</td>
				<td><a href="logout.do">로그아웃</a></td>
				<c:if test="${loginUser.lev == 'A'}">
					<td><a href="custom.do">사원등록</a></td>
				</c:if>
				<c:if test="${loginUser.lev == 'B'}">
					<td>
						사원등록<br> 
						(관리자로 로그인 후 사용 가능)
					</td>
				</c:if>
				<td><a href="mypage.do">마이페이지</a></td>
				<td><a href="emplist.do">사원목록</a></td>
			</tr>
		</c:if>
	</table>

</body>
</html>