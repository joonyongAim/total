<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id_str = session.getId();
	long lasttime = session.getLastAccessedTime();
	long createtime = session.getCreationTime();
	long used_time = (lasttime - createtime) / (60 * 1000);
	int inactive = session.getMaxInactiveInterval() / 60;
	boolean b_new = session.isNew();
%>
	<p>세션ID : <%=id_str %></p>
	<p>세션 생성된 시간 : <%=createtime %></p>
	<p>세션 마지막 사용 시간 : <%=lasttime %></p>
	<p>세션 생성 후 머문 시간 : <%=used_time %></p>
	<p>세션 유호 기간 : <%=inactive %></p>
	<p>새로 생성된 세션 ? : <%=b_new %></p>

</body>
</html>