<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>쿠키값 확인하기</h2>
	<%
		Cookie[] cookies = request.getCookies();
	for (Cookie cookie : cookies) {
		if (cookie != null) {
			out.print(cookie.getName() + " : " + cookie.getValue() + "<br>");
		}
	}
	%>

</body>
</html>