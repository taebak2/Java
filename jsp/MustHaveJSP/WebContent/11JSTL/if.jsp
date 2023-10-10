<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="number" value="100"/>
	<c:set var="string" value="JSP"/>
	<form action="if1.jsp">
	<input type="text" name="num">
	<input type="submit" value="판단하기">
	</form>
	
	<h3> 짝수 홀수 판단하기</h3>
	<c:if test="${number mod 2 eq 0 }" var = "result">	<!-- 조건부 태그 (2로 나눈 나머지가 0이랑 같다) -->
		${number}는 짝수입니다.<br>
	</c:if>
	<c:if test="${not result}" var = "result2">			<!-- result가 참이 아니라면~ -->	
		${number}는 홀수입니다.<br>
	</c:if>
</body>
</html>