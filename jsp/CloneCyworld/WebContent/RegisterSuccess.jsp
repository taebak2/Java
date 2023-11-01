<%@page import="org.apache.taglibs.standard.tag.common.fmt.RequestEncodingSupport"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%String id = (String)session.getAttribute("id"); %>	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/layout.css" />
<link rel="stylesheet" href="./resources/css/index.css" />
<title>회원가입 성공</title>
</head>
<body>
<body class="center-layout-column">
	<div class="center-layout-column">
		<img class="logo" alt="logo" src="./resources/img/cyworld.png" />
		<div class="center-layout-column">
			<h2><%=id%>님 가입을 환영합니다.</h2>
			<button onclick="location.href='login.jsp';">
				로그인 페이지로
			</button>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>