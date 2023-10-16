<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>애너테이션으로 매핑하기</title>
</head>
<body>
<strong>${message}</strong>
<br>
<a href="<%=request.getContextPath()%>/13Servlet/AnnoMapping.do">바로가기</a>
	<!-- request.getContextPath() : 컨텍스트 루트 경로를 반환 = /MustHaveJSP -->
</body>
</html>