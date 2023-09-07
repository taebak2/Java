<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="er500.jsp"%>
    <!-- errorPage 속성은 에러가 발생했을 때 이동할 페이지를 지정, 에러 페이지로는 er500.jsp가 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int myAge = Integer.parseInt(request.getParameter("age")) + 10; // request.getParameter("age")는 사용자가 입력한 나이 값을 가져오는 메서드
	out.println("10년 후 당신의 나이는 " + myAge + "입니다.");
%>
</body>
</html>