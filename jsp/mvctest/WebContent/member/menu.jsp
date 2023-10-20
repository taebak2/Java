<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${empty name}">
		<a href="">로그인</a>
		<a href="">회원 가입</a>
	</c:when>
	<c:otherwise>
		<a href="../member/logout">로그아웃</a>
		<a href="">회원수정</a>
		<a href="">회원탈퇴</a>
	</c:otherwise>
</c:choose>
</body>
</html>