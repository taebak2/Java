<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" buffer="1kb" autoFlush="false"%>
    
    <!-- buffer의 값이 작으면 작을수록 출력 버퍼가 빨리 가득 차게 됨, 
    autoFlush가 false로 설정되어 있다면, 버퍼가 가득 차더라도 데이터가 출력되지 않으며,
    autoFlush가 true로 설정되어 있다면 버퍼가 가득 차면 자동으로 데이터가 출력  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for(int i=1; i<=100; i++){
		out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		}
	
	%>
</body>
</html>
