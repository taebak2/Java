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
<c:set var = "number" value='<%=request.getParameter("num")%>'/>
	<c:if test="${number mod 3 eq 0}" var="result">
	${number}은 3의 배수입니다.<br>
	</c:if>
	<c:if test="${not result}" var="result2">
	${number}은 3의 배수가 아닙니다.<br>
	</c:if>
</body>
</html>