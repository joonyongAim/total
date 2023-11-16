<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div {
		text-align: center;
	}
</style>
</head>
<body>
	<div>
		<form method="post" action="mypage.do">
			<p>마이페이지</p>
			아이디 <input type="text" name="id" value="${loginUser.id}"> <br>
			비밀번호 <input type="text" name="pass" value="${loginUser.pass}"> <br>
			이름 <input type="text" name="name" value="${loginUser.name}"> <br>
			권한 <select name="lev">
					<option value="B">일반회원</option>
					<option value="A">운영자</option>
				</select> <br>
			성별 <select name="gender">
					<option value="1">남자</option>
					<option value="2">여자</option>
				</select> <br>
			전화번호 <input type="text" name="phone" value="${loginUser.phone}"> <br>
			<input type="submit" value="수정">
			<input type="reset" value="취소">
		</form>
	</div>

</body>
</html>