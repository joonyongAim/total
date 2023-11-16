<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>악세사리</h2>
	관심항목을 선택하세요.<hr>
	<form method="get" action="CheckboxServlet">
		<label for="1"><input type="checkbox" id="1" name="item" value="신발">신발</label>
		<label for="2"><input type="checkbox" id="2" name="item" value="가방">가방</label>
		<label for="3"><input type="checkbox" id="3" name="item" value="벨트">벨트</label><br>
		<label for="4"><input type="checkbox" id="4" name="item" value="모자">모자</label>
		<label for="5"><input type="checkbox" id="5" name="item" value="시계">시계</label>
		<label for="6"><input type="checkbox" id="6" name="item" value="쥬얼리">쥬얼리</label><br>
		
		<select name="job" multiple>
			<option value="학생">학생</option>
			<option value="공무원">공무원</option>
			<option value="군인">군인</option>
		</select>
		
		<input type="submit" value="전송">
	</form>

</body>
</html>