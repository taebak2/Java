<%@page import="java.text.SimpleDateFormat"%>
<%@page import="common.Person" %>
<%@page import="common.Car" %>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <!-- Core" 태그 라이브러리를 JSP 페이지에서 사용하기 위한 태그 라이브러리 선언 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="directVar" value="100"/>
	<c:set var="elVar" value="${directVar mod 5}"/>	
	<c:set var="expVar" value="<%=new Date() %>"/>	
	<c:set var="today" value='<%=new SimpleDateFormat("yyyy-MM-mm").format(new Date())%>'/>	
	<!-- new Date() 객체 생성을 따로 하지 않고 바로 스크립트값으로 받기
		 변경까지 한번에 가능  -->
	
	<h3> JSTL 변수 출력 </h3>
	<ul>
		<li>directVar : ${directVar}</li>	<!-- scope가 없다면 EL의 기본값 = page -->
		<li>elVar : ${elVar}</li>	
		<li>expVar : ${expVar}</li>	
		<li>오늘 날짜 : ${today}</li>	
	</ul>
	
	<h3> 자바빈즈 생성1 - 생성자 사용 </h3>
	<c:set var="personVar1" value='<%=new Person("박문수",50) %>' scope="request"/>
	<ul>
		<li>이름 : ${requestScope.personVar1.name}</li>
		<li>나이 : ${requestScope.personVar1.age}</li>
	</ul>
	
	<h3> 자바빈즈 생성2 - 타겟, 프로퍼티 사용 </h3>
	<c:set var="carVal1" value='<%=new Car() %>' scope="request"/>
	<c:set target="${carVal1}" property="carName" value="티코"/>
	<c:set target="${carVal1}" property="carPrice" value="50000"/>
	<c:set target="${carVal1}" property="carColor" value="빨강"/>
	
	<ul>
		<li>자동차 이름 : ${carVal1.carName}</li>
		<li>자동차 가격 : ${carVal1.carPrice}</li>
		<li>자동차 색상 : ${carVal1.carColor}</li>
	</ul>
</body>
</html>