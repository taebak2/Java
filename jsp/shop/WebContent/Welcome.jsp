<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!String greeting = "쇼핑몰 방문을 환영합니다";
	String tagline = "자바 쇼핑몰에 어서오세요";%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href=".welcome.jsp">홈</a>
				<!-- ".welcome.jsp" : 현재 디렉토리에서 welcome.jsp 파일을 찾아라 -->
			</div>
		</div>
	</nav>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3"><%=greeting%></h1>
			<!-- "display-3" 클래스는 큰 제목에 적용되는 스타일 -->
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3>
				<%=tagline%>
			</h3>
		</div>
	</div>
	<footer class="container">
		<p>&copy; JSP쇼핑몰</p>
	</footer>
</body>
</html>