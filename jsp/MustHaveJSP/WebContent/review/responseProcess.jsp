<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String value = request.getParameter("travel");

	if (value.equals("프랑스")) {
		response.sendRedirect("http://www.psg.com");
	}
	if (value.equals("뉴질랜드")) {
		response.sendRedirect("http://www.newzealand.com");
	}
	if (value.equals("일본")) {
		response.sendRedirect("http://www.japan.com");
	}
	if (value.equals("스위스")) {
		response.sendRedirect("http://www.swiss.com");
	}
	%>
</body>
</html>