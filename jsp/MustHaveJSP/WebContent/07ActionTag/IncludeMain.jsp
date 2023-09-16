<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String outerPath1 = "inc/OuterPage1.jsp";
	String outerPath2 = "inc/OuterPage2.jsp";
	String outerPath3 = "inc/OuterPage3.jsp";

	pageContext.setAttribute("pAttr", "동명왕"); // 페이지 영역
	request.setAttribute("rAttr", "온조왕");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include Main</title>
</head>
<body>
	<h2> 지시어로 페이지 포함하기 </h2>
	<%@ include file="inc/OuterPage1.jsp"%>
	<p> 외부 파일에 선언한 변수 : <%=newVar1%></p>
	
	<h2> 액션태그로 페이지 포함하기 </h2>
	<jsp:include page="inc/OuterPage2.jsp"/>	
	<!-- 액션 태그는 외부 파일에 선언한 변수(OuterPage2의 String newVar2), 
	페이지 영역(<%=pageContext.getAttribute("pAttr") %>) 가져올 수 없음 -->
</body>
</html>
