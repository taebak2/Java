<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OuterPage1</title>
</head>
<body>
	<h2> 외부 파일 3</h2>
	<%
		String newVar3 = "신라 박혁거세";
	%>
	<ul>
	<li> 페이지 영역 속성 : <%=pageContext.getAttribute("pAttr") %></li> 
	<li> 리퀘스트 영역 속성 : <%=request.getAttribute("rAttr") %></li>
	
	
	</ul>
</body>
</html>