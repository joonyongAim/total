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
      <h1>수정페이지</h1>
      <form method="post" action="updateBoard.do">
         <div class="mb-3">
            <label class="form-label">글 제목</label>
            <input class="form-control" type="text" name="title" value="${boardDetail.title}">
         </div>
         <div class="mb-3">
            <label class="form-label">내용</label>
            <textarea class="form-control" rows="5" name="content">${boardDetail.content}</textarea>
         </div>
		 <input type="hidden" name="no" value="${boardDetail.no}">
         <input class="btn btn-outline-dark" type="submit" value="수정">
         <input class="btn btn-outline-dark" type="button" value="돌아가기" onclick="">
      </form>
   </div>
</body>
</html>