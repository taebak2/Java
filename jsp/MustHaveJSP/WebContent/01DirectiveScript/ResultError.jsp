<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ResultError</title>
</head>
<body>
	<h1>오류가 발생했음</h1>
	<h1>  오류명 : <%=exception.getClass().getName()%></h1>
</body>
</html>