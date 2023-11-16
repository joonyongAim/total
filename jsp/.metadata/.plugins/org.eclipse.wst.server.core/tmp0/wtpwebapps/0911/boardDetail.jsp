<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container p-3">
      <div class="mb-3">
         <label class="form-label">글 제목</label>
         <div class="form-control">
         	${boardDetail.title}
         </div>
      </div>
      <div class="mb-3">
         <label class="form-label">내용</label>
         <div class="form-control">
         	${boardDetail.content }
         </div>
      </div>
      
      <button class="btn btn-outline-dark" type="button" onClick="location.href='updateBoard.do?no=${boardDetail.no}&id=${boardDetail.id}&loginId=${loginUser.id}'">수정</button>
      <button class="btn btn-outline-dark" type="button" onClick="location.href='boardDelete.do?no=${boardDetail.no}&id=${boardDetail.id}&loginId=${loginUser.id}'">삭제</button>
      <button class="btn btn-outline-dark" type="button" onClick="location.href='boardlist.do'">목록</button>
      
      <c:if test="${!empty message}">
	      <div class="alert alert-danger">
	      	${message}
	      </div>
      </c:if>
</div>

</body>
</html>
