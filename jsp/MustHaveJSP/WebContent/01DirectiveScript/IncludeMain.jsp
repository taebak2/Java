<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="IncludeFile.jsp" %>
    
    <!-- IncludeFile.jsp라는 파일을 현재 JSP 페이지로 포함시키는 역할을 수행  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IncludeMain</title>
</head>
<body>
	<%
		out.print("오늘 날짜 : " + today);	
		out.print("<br>");
		out.print("내일 날짜 : " + tomorrow);	
	%>
</body>
</html>
