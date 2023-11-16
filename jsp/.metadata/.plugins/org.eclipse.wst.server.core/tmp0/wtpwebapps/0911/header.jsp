<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
   
   <nav class="navbar navbar-dark bg-dark">
     <div class="container-fluid">
        <div>
        <c:if test="${empty loginUser}">
          <a class="btn btn-outline-light" href="boardlist.do">게시판</a>
          <a class="btn btn-outline-light" href="login.do">로그인</a>
        </c:if>
        <c:if test="${!empty loginUser}">
          <a class="btn btn-outline-light" href="boardlist.do">게시판</a>
          <a class="btn btn-outline-light" href="logout.do">로그아웃</a>
        </c:if>
        
        <a class="btn btn-outline-light" href="writeboard.do">글쓰기</a>
       </div>
       <form class="d-flex" role="search" method="get" action="boardlist.do">
         <input class="form-control me-2" type="search" placeholder="Search" name="searchWord">
         <button class="btn btn-outline-success" type="submit">Search</button>
       </form>
     </div>
   </nav>
   
</body>
</html>