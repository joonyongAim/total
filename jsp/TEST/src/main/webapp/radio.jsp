<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="RadioServlet">
		<label for="gender">성별 : </label>
		<label for="gender1"><input type="radio" id="gender1" name="gender" value="남자" checked>남자</label>
		<label for="gender2"><input type="radio" id="gender2" name="gender" value="여자">여자</label><br><br>
		<label for="chk_mail">메일 정보 수신 여부 : </label>
		<label for="chk_mail1"><input type="radio" id="chk_mail1" name="chk_mail" value="수신" checked onclick>수신</label>
		<label for="chk_mail2"><input type="radio" id="chk_mail2" name="chk_mail" value="거부">거부</label><br><br>
		<label for="content">간단한 가입 인사를 적어주세요^o^</label><br>
		<textarea id="content" name="content"></textarea><br>
		<input type="submit" value="전송">
	</form>

</body>
</html>