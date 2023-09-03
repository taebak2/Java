<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IncludeFile2.jsp"%>

<!-- IncludeFile.jsp라는 파일을 현재 JSP 페이지로 포함시키는 역할을 수행  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IncludeMain2</title>
</head>
<body>
	<%
		out.println(name + "님 " + todaytime.getHour() + "시 " + todaytime.getMinute() + " 분에 출석하셨습니다.");
	
	%>
</body>
</html>
