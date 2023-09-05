<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page</title>
</head>
<body>
	<%
	Date today =  new Date(); // 현재 날짜와 시간을 가져오기
	int hour = today.getHours();
	int minute = today.getMinutes();
	int second = today.getSeconds();
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	String todayStr = dateFormat.format(today);
	out.println(todayStr);
	%>
</body>
</html>