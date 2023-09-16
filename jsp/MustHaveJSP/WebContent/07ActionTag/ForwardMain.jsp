<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	pageContext.setAttribute("pAttr", "김유신");
	request.setAttribute("rAttr", "계백");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forward Main</title>
</head>
<body>
	<h2> 액션 태그를 이용한 포워딩 </h2>
	<jsp:forward page="/07ActionTag/ForwardSub.jsp"/>
	<!-- forward로 페이지가 넘어가도 주소는 변경되지 않음 -->
	<!-- request영역은 공유되기 때문에 출력 가능
		 pageContext 영역은 출력 X -->
	
	
</body>
</html>
