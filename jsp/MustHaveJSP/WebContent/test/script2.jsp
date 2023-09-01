<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
int result(int a, int b){
	int sum = a+b;
	return sum;
};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>script</title>
</head>
<body>
	<%
	int add = result(5, 7);
	%>
	합계는 <%=add%> 입니다 
</body>
</html>