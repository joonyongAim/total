<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
      <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
      <!-- include summernote css/js -->
	  <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
	  <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
   </head>
<body>

   <nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
      <div class="container-fluid">
         <a class="navbar-brand" href="/">Navbar</a>
         <button class="navbar-toggler" type="button"
            data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02"
            aria-controls="navbarTogglerDemo02" aria-expanded="false"
            aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
         </button>
         <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
         	<c:if test="${principal == null}">
	            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	               <li class="nav-item"><a class="nav-link active"
	                  aria-current="page" href="/auth/login">로그인</a></li>
	               <li class="nav-item"><a class="nav-link" href="/auth/insertUser">회원가입</a></li>
	            </ul>
            </c:if>
            <c:if test="${principal != null}">
	            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	               <li class="nav-item"><a class="nav-link active"
	                  aria-current="page" href="/auth/logout">로그아웃</a></li>
	               <li class="nav-item"><a class="nav-link" href="">회원정보</a></li>
	               <li class="nav-item"><a class="nav-link" href="/post/insertPost">게시물등록</a></li>
	            </ul>
            </c:if>
            <form class="d-flex" role="search">
               <input class="form-control me-2" type="search" placeholder="Search"
                  aria-label="Search">
               <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
         </div>
      </div>
   </nav>