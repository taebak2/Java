<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginResult</title>
</head>
<body>
	<h2> web.xml에서 매핑 후 jsp에서 출력하기 2 </h2>
	<p>
	<strong><%=request.getAttribute("id") %></strong>
	<strong><%=request.getAttribute("pw") %></strong>
	<br>
	<a href="./loginResult.do">아이디 비번 확인하기</a>	
	<!-- 앵커 태그와 url-pattern이름을 일치 시켜야함 -->
	</p>
</body>
</html>
