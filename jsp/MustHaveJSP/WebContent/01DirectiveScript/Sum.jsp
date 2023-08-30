<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!
int sum = 0;	// %!는 변수 선언  
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i=1; i<=100; i++){
		sum+=i;
}
	out.println("합계는 : " + sum);

%>
</body>
</html>