<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="MembershipServlet">
		이름 <input type="text" name="이름"><br>
		주민등록번호 <input type="text" name="주민등록번호1"> - <input type="text" name="주민등록번호2"><br>
		아이디 <input type="text" name="아이디"><br>
		비밀번호 <input type="password" name="비밀번호"><br>
		비밀번호 확인 <input type="password" name="비밀번호 확인"><br>
		이메일 <input type="text" name="이메일1"> @ <input type="text" class="domain" name="이메일2"> <select class="sel" name="이메일3">
																					<option value="직접입력">직접입력</option>
																					<option value="nate.com">nate.com</option>
																					<option value="gmail.com">gmail.com</option>
																					<option value="naver.com">naver.com</option>
																				  </select><br>
		우편번호 <input type="text" name="우편번호"><br>
		주소 <input type="text" name="주소1">  <input type="text" name="주소2"><br>
		핸드폰번호 <input type="tel" name="핸드폰번호"><br>
		직업 <select name="직업">
				<option value="학생">학생</option>
				<option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
				<option value="연론">연론</option>
				<option value="공무원">공무원</option>
		   </select><br>
		메일/SMS 정보 수신 <label for="chk_mail1"><input type="radio" id="chk_mail1" name="chk_mail" value="수신" checked onclick>수신</label>
					   <label for="chk_mail2"><input type="radio" id="chk_mail2" name="chk_mail" value="거부">수신거부</label><br>
		관심분야 <label for="1"><input type="checkbox" id="1" name="item" value="생두">생두</label>
			  <label for="2"><input type="checkbox" id="2" name="item" value="원두">원두</label>
			  <label for="3"><input type="checkbox" id="3" name="item" value="로스팅">로스팅</label>
			  <label for="4"><input type="checkbox" id="4" name="item" value="핸드드립">핸드드립</label>
			  <label for="5"><input type="checkbox" id="5" name="item" value="에스프레소">에스프레소</label>
			  <label for="6"><input type="checkbox" id="6" name="item" value="창업">창업</label><br>
		<input type="submit" value="회원가입">
		<input type="button" value="취소">
		
		
	</form>
	
	

</body>
</html>