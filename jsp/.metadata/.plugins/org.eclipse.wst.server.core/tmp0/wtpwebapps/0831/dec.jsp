<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String str = "안녕하세요";
	int a = 5, b = -5;
	int global_cnt=0;
	
	public int abs(int n) {
		if(n < 0) {
			n = -n;
		}
		
		return n;
	}
	
	public void add(int a, int b) {
		int sum = a + b;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int local_cnt = 0;

	global_cnt++;
	local_cnt++;

	out.print("global : " + global_cnt);
	out.print("local : " + local_cnt);
	
	out.print(str + "<br>");
	out.print("<h1>global : " + global_cnt + "</h1>");
	out.print("<h1>local : " + local_cnt + "</h1>");
	out.print(a + "의 절대값 : " + abs(a) + "<br>");
	out.print(b + "의 절대값 : " + abs(b) + "<br>");
%>

	<h1>global : <%=global_cnt %></h1>
	<h1>local : <%=local_cnt %></h1>
	


</body>
</html>