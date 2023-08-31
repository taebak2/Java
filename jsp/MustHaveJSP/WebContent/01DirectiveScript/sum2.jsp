<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!int sum=0; 	// <%!: 선언부
    int add(){		// 메소드 선언
    	for(int i=1; i<=100; i++){
    		sum+=i;
    	}
    	return sum;
    };
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	// <%: 스크립틀릿(자바 코드), <%-- : 출력 표현식 
		int result = add();
	%>
	<h1>합계 결과는 <%=result%> 입니다</h1>
	
</body>
</html>