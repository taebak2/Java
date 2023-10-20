<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<jsp:include page="menu.jsp"/>

		<c:if test="${not empty name}">
			<h2>${name}님 로그인 성공</h2>
		</c:if>
		<c:if test="${not empty param.error}">
			<h2>아이디 비밀번호를 확인해주세요.</h2>
		</c:if>
	
	<form action="../member/loginServlet" method="post">
		아이디 <input type="text" name="id">
		비밀번호 <input type="password" name="pw">
		   	<input type="submit" value="전송">
</form>
</body>
</html>