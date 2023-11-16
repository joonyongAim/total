<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<form method="post" action="custom.do">
			<p>사원등록</p>
			아이디 <input type="text" name="id"> <br>
			비밀번호 <input type="text" name="pass"> <br>
			이름 <input type="text" name="name"> <br>
			권한 <select name="lev">
					<option value="B">일반회원</option>
					<option value="A">운영자</option>
				</select> <br>
			성별 <select name="gender">
					<option value="1">남자</option>
					<option value="2">여자</option>
				</select> <br>
			전화번호 <input type="text" name="phone"> <br>
			<input type="submit" value="등록">
			<input type="reset" value="취소">
			<button onclick="location.href='main.jsp'">메인페이지</button>
		</form>
	</div>
</body>
</html>