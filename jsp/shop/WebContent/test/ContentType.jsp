<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ContentType</title>
</head>
<body>
	<%
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		String day = dateFormat.format(today);
	%>
	오늘 날짜 :<%=day%>
</body>
</html>
