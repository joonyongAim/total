<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 삭제</title>
<link rel="stylesheet" href="css/shopping.css">
</head>
<body>

   <div id="wrap" align="center">
      <h1>상품 삭제</h1>
      <form method="post" action="productDelete.do">
      <input type="text" name="code" value="${product.code}">
         <table>
            <tr>
               <td>
                  <c:choose>
                     <c:when test="${empty product.pictureUrl}">
                        <p>등록된 이미지가 없습니다</p>
                     </c:when>
                     <c:otherwise>
                        <img src="upload/${product.pictureUrl}">
                     </c:otherwise>
                  </c:choose>
               </td>
               <td>
                  <table>
                     <tr>
                        <th style="width: 80px">상품명</th>
                        <td>
                           <input type="text" name="name" value="${product.name}">
                        </td>
                     </tr>
                     <tr>
                        <th>가격</th>
                        <td>
                           <input type="text" name="price" value="${product.price}">
                        </td>
                     </tr>
                     <tr>
                        <th>사진</th>
                        <td>
                           <input type="file" name="pictureUrl">
                        </td>
                     </tr>
                     <tr>
                        <th>설명</th>
                        <td>
                           <textarea cols=80 rows=10 name="description">${product.description}</textarea>
                        </td>
                     </tr>
                  </table>
                  <br>
                  <input type="submit" value="삭제">
                  <input type="button" value="목록" onclick="location.href='productList.do'">
               </td>
            </tr>
         </table>
      </form>
   </div>

</body>
</html>