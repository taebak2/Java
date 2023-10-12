<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="iTag">
		i 태그는 <i>기울임</i> 을 표현합니다.
	</c:set>
	
	<c:out value="${iTag}"/>	<!-- out 태그는 변수를 출력할 때 사용 -->
	<br>
	<c:out value="${iTag}" escapeXml="false"/>	<!--value : 출력할 변수 특수문자 처리 유무  -->
	<br>
	<c:out value="${param.name}" default="넘겨온 값이 없습니다."/>	<!-- param.name값 중 넘어온 값이 없기 때문에 default값이 출력 -->
																	<!-- value값이 공백인 경우 null값으로 인식하지 않기 때문에 공백이 출력 --> 
</body>
</html>