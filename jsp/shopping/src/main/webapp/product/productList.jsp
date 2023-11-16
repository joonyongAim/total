<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/shopping.css">
</head>
<body>

	<div id="wrap" align="center">
		<h1>상품 목록 - 관리자 페이지</h1>
		<table class="list">
			<tr>
				<td colspan="5" style="border: white; text-align: right">
					<a href="productWrite.do">상품 등록</a>
				</td>
			</tr>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>가격</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			
			<c:forEach items="${productList}" var="product">
				<tr class="record">
					<td>${product.code}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>
						<a href="productUpdate.do?code=${product.code}">수정</a>
					</td>
					<td>
						<a href="productDelete.do?code=${product.code}">삭제</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>