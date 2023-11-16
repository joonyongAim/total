<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/movie.css">
</head>
<body>
	<div id="wrap" align="center">
      <h1>정보 수정</h1>
      <form method="post" enctype="multipart/form-data" name="frm">
      	 <input type="hidden" name="code" value="${movie.code}">
         <input type="hidden" name="noupdateImg" value="${movie.poster}">
         <table>
            <tr>
               <td style="width: 200px">
           			<c:if test="${empty movie.poster}">
           				<p>이미지가 없습니다.</p>
           			</c:if>
           			<c:if test="${!empty movie.poster}">
           				<img src="images/${movie.poster}">
           			</c:if>
               </td>
               <td>
                  <table>
                     <tr>
                        <th style="width: 80px">제목</th>
                        <td>
                           <input type="text" name="title" size="60" value="${movie.title}">
                        </td>
                     </tr>
                     <tr>
                        <th>가격</th>
                        <td>
                           <input type="text" name="price" value="${movie.price}">원
                        </td>
                     </tr>
                     <tr>
                        <th>감독</th>
                        <td>
                           <input type="text" name="director" size="60" value="${movie.director}">
                        </td>
                     </tr>
                     <tr>
                        <th>배우</th>
                        <td>
                           <input type="text" name="actor" size="60" value="${movie.actor}">
                        </td>
                     </tr>
                     <tr>
                        <th>시놉시스</th>
                        <td>
                           <textarea cols=80 rows=10 name="synopsis">${movie.synopsis}</textarea>
                        </td>
                     </tr>
                     <tr>
                        <th>사진</th>
                        <td>
                           <input type="file" name="poster" value="${movie.poster}">
                        </td>
                     </tr>
                  </table>
                  <br>
                  <input type="submit" value="수정" onclick="return productCheck()">
                  <input type="button" value="목록" onclick="location.href='movieList.do'">
                  <input type="button" value="포스터다운" onclick="location.href='download?poster=${movie.poster}&title=${movie.title}'">
               </td>
            </tr>
         </table>
      </form>
   </div>
</body>
</html>