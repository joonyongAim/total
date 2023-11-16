<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="movieWrite.jsp">
		<h1>정보 등록</h1><br>
		제목 <input type="text" name="title"><br><br>
		
		가격 <input type="text" name="price">원<br><br>
		
		감독 <input type="text" name="director"><br><br>
		
		출연배우 <input type="text" name="actor"><br><br>
		
		시놉시스 <textarea rows="10" cols="30" name="synopsis"></textarea><br><br>
		
		장르 <select name="genre">
				<option value="로맨스">로맨스</option>
				<option value="스릴러">스릴러</option>
				<option value="미스터리">미스터리</option>
				<option value="액션">액션</option>
				<option value="코미디">코미디</option>
				<option value="애니메이션">애니메이션</option>
		    </select><br><br>
		    
		<input type="submit" value="확인">
		<input type="submit" value="취소">
	</form>

</body>
</html>