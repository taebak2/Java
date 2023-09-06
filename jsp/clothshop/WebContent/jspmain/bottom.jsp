<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../resources/js/jquery_1.12.4_jquery.min.js"></script>
<script>
	$(function(){
		function getClock(){
		var date = new Date();
		var today = date.toLocaleTimeString();
		$("#clock").text(today);
	}
	getClock();
	setInterval(getClock,1000);
	});
</script>
</head>
<body>
	<h1 id="clock"></h1>
	<br>
</body>
</html>