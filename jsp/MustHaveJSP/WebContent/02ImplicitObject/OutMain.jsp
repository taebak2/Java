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
		out.print("출력되지 않는 텍스트");
		out.clearBuffer(); // 출력 안하고 버퍼 비우기
		
		out.print("<h2>out 내장 객체</h2>");
		
		out.print("출력 버퍼의 크기 : " + out.getBufferSize() + "<br>"); // 버퍼 사이즈
		out.print("남은 버퍼의 크기 : " + out.getRemaining() + "<br>"); // 남은 버퍼 사이즈
		
		out.flush(); // 출력하고 버퍼 비우기
		out.print("flush 후 버퍼의 크기 : " + out.getRemaining() + "<br>");
		
		
	%>
</body>
</html>