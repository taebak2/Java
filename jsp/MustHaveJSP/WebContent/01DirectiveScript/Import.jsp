<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 페이지의 속성을 설정 language 속성으로 페이지 언어를 설정, contentType 속성으로 페이지의 콘텐츠 타입을 설정, 여기서는 UTF-8 문자 인코딩을 사용하도록 설정 -->
    <%@ page import="java.text.SimpleDateFormat" %>
    <%@ page import="java.util.Date" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Date today = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String todayStr = dateFormat.format(today);
	out.println("오늘 날짜 : " + todayStr);

%>
</body>
</html>