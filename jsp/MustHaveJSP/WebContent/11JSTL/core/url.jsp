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
	<h4> url 태그로 링크 걸기 </h4>
	<c:url value="/11JSTL/inc/OtherPage.jsp" var="url">	<%-- <c:url> 태그는 URL을 생성하는 데 사용 --%>
														<!-- value 속성은 생성하려는 URL의 경로를 지정 -->
		<c:param name="user_param1" value="Must"/>	<!-- OtherPage.jsp의 param.user_param을 가져오고 value값을 Must로 변경 -->
		<c:param name="user_param2" value="Have"/>
	</c:url>
	
	<a href="${url}">다른 페이지 연결하기</a>
	
	<c:url value="https:www.daum.net" var="daum"></c:url>
	<a href="${daum}"> 다음 페이지 연결하기</a>
</body>
</html>