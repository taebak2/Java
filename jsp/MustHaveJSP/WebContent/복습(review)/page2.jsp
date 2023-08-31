<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<% 
		response.setIntHeader("Refresh",1); 
		// response 객체는 웹 브라우저나 클라이언트 앱에 응답을 보낼 수 있음
		// setIntHeader는 HTTP 응답 헤더의 값을 설정하는 데 사용
		// 이 메서드를 사용하면 응답 헤더에 정수 값을 설정
		out.println("<br>");
		String nowTime = hour + ":" + minute + ":" + second;
		out.println("현재 접속 시간 " + nowTime);
		%>
</body>
</html>