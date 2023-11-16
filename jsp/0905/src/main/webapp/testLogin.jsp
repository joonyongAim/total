<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>

	<fmt:setLocale value="${param.lang}" />
	<fmt:setBundle basename="bundle.signupBundle" var="bundle"/>

   <div class="alert alert-secondary fs-3" role="alert">
     <fmt:message key="title" bundle="${bundle}" />
   </div>

   <div class="container mt-3">
      <div class="text-end">
        <a class="btn btn-primary me-md-2" href="?lang=ko">한국어</a>
        <a class="btn btn-primary" href="?lang=en">English</a>
      </div>
      
      <form>
        <div class="mb-3">
          <label for="name" class="form-label"><fmt:message key="name" bundle="${bundle}" /></label>
          <input type="text" class="form-control" id="name">
        </div>
        
        <div class="mb-3">
          <label for="id" class="form-label"><fmt:message key="id" bundle="${bundle}" /></label>
          <input type="text" class="form-control" id="id">
        </div>
        
        <div class="mb-3">
          <label for="pw" class="form-label"><fmt:message key="pw" bundle="${bundle}" /></label>
          <input type="password" class="form-control" id="pw">
        </div>
        
        <div class="mb-3">
           <select class="form-select">
            <option value="1"><fmt:message key="select1" bundle="${bundle}" /></option>
            <option value="2"><fmt:message key="select2" bundle="${bundle}" /></option>
            <option value="3"><fmt:message key="select3" bundle="${bundle}" /></option>
           </select>
        </div>
        
        <div class="mb-3">
          <input type="radio" name="gender" value="male"><fmt:message key="checkbox1" bundle="${bundle}" />
          <input type="radio" name="gender" value="female"><fmt:message key="checkbox2" bundle="${bundle}" />
        </div>
        
        <button type="submit" class="btn btn-primary"><fmt:message key="btn" bundle="${bundle}" /></button>
      </form>
   </div>
</body>
</html>