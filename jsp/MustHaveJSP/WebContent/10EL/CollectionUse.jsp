<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="common.Car"%>
<%@page import="common.Person"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CollectionUse</title>
</head>
<body>
<%
	List<Object> aList = new ArrayList<>();
	aList.add("청해진");
	aList.add(new Person("장보고",28));
	aList.add(new Car("Genesis","Black",100000000));
	
	pageContext.setAttribute("Ocean", aList);
%>

<ul>
	<li>0번째 요소 : ${Ocean[0]}</li>
	<li>1번째 요소 : ${Ocean[1].name},${Ocean[1].age}</li>
	<li>2번째 요소 : ${Ocean[2].carName},${Ocean[2].carColor},${Ocean[2].carPrice}</li>
</ul>

<%
	Map<String, String> map = new HashMap<>();
	map.put("한글", "훈민정음");
	map.put("Eng", "English");
	pageContext.setAttribute("King", map);
%>
<h2> 맵 컬렉션 </h2>
<ul>
	<li>영문 : ${King.Eng}</li>
	<li>한글 : ${King["한글"]}, \${King.한글}</li>
</ul>
</body>
</html>