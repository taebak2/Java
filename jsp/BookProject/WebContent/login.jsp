ŵ<%@page import="common.JSFunction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="top.jsp" %>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	
	<form action="loginprocess.jsp" method="post">
	<input type="text" name="id">아이디
	<input type="password" name="pw">비밀번호 
	<input type="submit" value="전송">
	</form>
</body>
</html>