<%@page import="java.util.Date"%>
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
	<%@ include file="menu.jsp"%>
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
			<%
				Date today = new Date();
			String am_pm;
			int hour = today.getHours();
			int minute = today.getMinutes();
			int second = today.getSeconds();

			if (hour / 12 == 0) {
				am_pm = "오전";
			} else {
				am_pm = "오후";
				hour = hour - 12;
			}
			String today2 = am_pm + " " + hour + ":" + second;
			out.print("현재 접속 시간 : " + today2);
			%>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>