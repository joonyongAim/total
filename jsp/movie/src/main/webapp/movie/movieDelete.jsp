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
      <h1>정보 삭제</h1>
      <form method="post" action="movieDelete.do">
      <input type="hidden" name="code" value="${movie.code}">
         <table>
            <tr>
               <td>
                  <c:choose>
                     <c:when test="${empty movie.poster}">
                        <p>등록된 이미지가 없습니다</p>
                     </c:when>
                     <c:otherwise>
                        <img src="images/${movie.poster}">
                     </c:otherwise>
                  </c:choose>
               </td>
               <td>
                  <table>
                    <tr>
                        <th style="width: 80px">제목</th>
                        <td>
                           ${movie.title}
                        </td>
                     </tr>
                     <tr>
                        <th>가격</th>
                        <td>
                           ${movie.price}원
                        </td>
                     </tr>
                     <tr>
                        <th>감독</th>
                        <td>
                           ${movie.director}
                        </td>
                     </tr>
                     <tr>
                        <th>배우</th>
                        <td>
                           ${movie.actor}
                        </td>
                     </tr>
                     <tr>
                        <th>시놉시스</th>
                        <td>
                        	${movie.synopsis}
                        </td>
                     </tr>
                     <tr>
                        <th>사진</th>
                        <td>
                           ${movie.poster}
                        </td>
                     </tr>
                  </table>
                  <br>
                  <input type="submit" value="삭제">
                  <input type="button" value="목록" onclick="location.href='movieList.do'">
               </td>
            </tr>
         </table>
      </form>
   </div>
</body>
</html>