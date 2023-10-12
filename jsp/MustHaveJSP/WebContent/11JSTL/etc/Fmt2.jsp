<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="today" value="<%=new java.util.Date() %>"/>
	
	<h4> 날짜 포맷 </h4>
	full : <fmt:formatDate value="${today}" type="date" dateStyle="full"/><br>	<!-- full : 요일까지 -->
	long : <fmt:formatDate value="${today}" type="date" dateStyle="long"/><br> <!-- long : 날짜까지 -->
	default : <fmt:formatDate value="${today}" type="date" dateStyle="default"/><br>
	
	<h4> 시간 포맷 </h4>
	full : <fmt:formatDate value="${today}" type="time" timeStyle="full"/><br>
	default : <fmt:formatDate value="${today}" type="time" timeStyle="default"/><br>
	
	<h4> 날짜 + 시간 포맷 </h4>
	<fmt:formatDate value="${today}" type="both" pattern="yyy-MM-dd-hh:mm:ss"/><br>
	
	<h4> 타임존 설정 </h4>
	<fmt:timeZone value="America/Chicago">
		<fmt:formatDate value="${today}" type="both" pattern="yyy-MM-dd-hh:mm:ss"/><br>
	</fmt:timeZone>
	
	<h4> 로케일 설정 </h4>
	<fmt:setLocale value="ja_JP"/>
	<fmt:formatNumber value="99999" type="currency"/>
	
</body>
</html>