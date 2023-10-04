<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>ImplicitForwardResult 페이지</h2>
<h3> 각 영역에 저장된 속성 읽기 </h3>
	<ul>
		<li>페이지 영역 : ${pageScope.scopeValue}</li>
		<li>리퀘스트 영역 : ${requestScope.scopeValue}</li>
		<li>세션 영역 : ${sessionScope.scopeValue}</li>
		<li>애플리케이션 영역 : ${applicationScope.scopeValue}</li>
	</ul>
	
	<h3> 영역 지정없이 속성값 읽기 </h3>
	<ul>
		<li> ${scopeValue} </li>
		<!-- 속성값 읽을 때 가장 좁은 범위의 값을 가져옴  -->	
	</ul>
</body>
</html>