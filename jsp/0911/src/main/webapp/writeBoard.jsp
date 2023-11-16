<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container p-3">
   <form method="post" action="writeboard.do">
      <div class="mb-3">
         <label class="form-label">글 제목</label>
         <input type="text" class="form-control" name="title">
      </div>
      <div class="mb-3">
         <label class="form-label">내용</label>
         <textarea class="form-control" rows="5" name="content"></textarea>
         <input type="hidden" name="id" value="${loginUser.id}">
      </div>
      <button class="btn btn-outline-dark" type="submit">등록</button>
      <button class="btn btn-outline-dark" type="reset">재입력</button>
      <button class="btn btn-outline-dark" type="button">목록</button>
   </form>
</div>
</body>
</html>