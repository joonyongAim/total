<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean class="sample.javabeans.MemberBean" id="member" />
	
<%
	member.setName("고길동");
	member.setNickname("검성");
%>
	
	<h1>자바 코드로 작업한거</h1>
	<h1><%=member.getNickname() %> <%=member.getName() %></h1>
	
	<h1>액션 태그로 작업하기</h1>
	<jsp:setProperty property="name" name="member" value="홍길동"/>
	<jsp:setProperty property="nickname" name="member" value="hong"/>
	
	<h1>
		<jsp:getProperty property="nickname" name="member" />
		<jsp:getProperty property="name" name="member" />
	</h1>
</body>
</html>