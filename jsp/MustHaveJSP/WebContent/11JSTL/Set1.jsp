<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <!-- Core" 태그 라이브러리를 JSP 페이지에서 사용하기 위한 태그 라이브러리 선언 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Set1</title>
</head>
<body>
	<c:set var="directVar" value="100"/>
	<c:set var="elVar" value="${directVar mod 5}"/>	
	<c:set var="expVar" value="<%=new Date() %>"/>	
	<c:set var="today" value='<%=new SimpleDateFormat("yyyy-MM-mm").format(new Date())%>'/>	
	<!-- new Date() 객체 생성을 따로 하지 않고 바로 스크립트값으로 받기
		 변경까지 한번에 가능  -->
	
	<h3> JSTL 변수 출력 </h3>
	<ul>
		<li>directVar : ${directVar}</li>	<!-- scope가 없다면 EL의 기본값 = page -->
		<li>elVar : ${elVar}</li>	
		<li>expVar : ${expVar}</li>	
		<li>오늘 날짜 : ${today}</li>	
	</ul>
</body>
</html>