<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int num1 = 3;
		pageContext.setAttribute("num2", 4);
		pageContext.setAttribute("num3", "5");
		pageContext.setAttribute("num4", 8);
		pageContext.setAttribute("num5", "가나다");
	%>
	<h3> 변수 할당 및 출력 </h3>
	<p>${num1}</p>
	<p><%=num1%></p>
	<p>${num2}</p>
	<p>${num2+num2}</p>
	<p>${num2+num3}</p>
	<p>${num4=10}</p>
	
	<h3> 비교 연산자 </h3>
	<p>${num2 gt num4}</p>
	
</body>
</html>