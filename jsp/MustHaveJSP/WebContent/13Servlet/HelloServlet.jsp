<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloServlet</title>
</head>
<body>
	<h2> web.xml에서 매핑 후 jsp에서 출력하기 </h2>
	<p>
		<strong><%=request.getAttribute("message") %></strong>
		<br>
		<a href="./HelloServlet.do">바로가기</a>	
	</p>
	<!-- 바로가기"라는 텍스트가 하이퍼링크로 표시되며, 
	이 링크는 "./HelloServlet.do" 경로로 이동하는 링크 -->
		<!-- web.xml에 가서 servlet-mapping을 탐색  -->
</body>
</html>