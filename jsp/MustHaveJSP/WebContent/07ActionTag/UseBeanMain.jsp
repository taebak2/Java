<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 유즈빈 액션태그 </h2>
	
	<h3> 자바빈즈 사용하기 </h3>
	<jsp:useBean id="person" class="common.Person" scope="request"/>
	<jsp:setProperty property="name" value="임꺽정" name="person"/>
	<jsp:setProperty property="age" value="40" name="person"/>
	
	<ul>
		<li> 이름 : <jsp:getProperty property="name" name="person"/></li>
		<li> 나이 : <jsp:getProperty property="age" name="person"/></li>
	</ul>
</body>
</html>