<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 수정</title>
<link rel="stylesheet" href="css/shopping.css">
</head>
<body>

   <div id="wrap" align="center">
      <h1>상품 수정</h1>
      <form method="post" enctype="multipart/form-data" name="frm">
      	 <input type="hidden" name="code" value="${product.code}">
         <input type="hidden" name="noupdateImg" value="${product.pictureUrl}">
         <table>
            <tr>
               <td>
           			<c:if test="${empty product.pictureUrl}">
           				<p>이미지가 없습니다.</p>
           			</c:if>
           			<c:if test="${!empty product.pictureUrl}">
           				<img src="upload/${product.pictureUrl}">
           			</c:if>
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
                           <input type="file" name="pictureUrl" value="${product.pictureUrl}">
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
                  <input type="submit" value="수정" onclick="return productCheck()">
                  <input type="reset" value="다시작성">
                  <input type="button" value="목록" onclick="location.href='productList.do'">
               </td>
            </tr>
         </table>
      </form>
   </div>

<script src="script/product.js"></script>
</body>
</html>