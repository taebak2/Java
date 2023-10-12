<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OtherPage</title>
</head>
<body>
	<h4> 다른 페이지 </h4>
	<ul>
		<li> 저장된 값 : ${requestVar}</li>
		<li> 매개변수1 : ${param.user_param1}</li>
		<li> 매개변수2 : ${param.user_param2}</li>
	</ul>
	
</body>
</html>