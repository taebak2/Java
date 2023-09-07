<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="common.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 애플리케이션 영역의 속성 읽기 </h2>
	<%
		Map<String, Person> maps = (Map<String, Person>)application.getAttribute("maps");
	
		Set<String> keys = maps.keySet(); // 위에서 가져온 맵 객체인 maps에서 모든 키를 가져와서 keys라는 이름의 Set(집합)에 저장
										  // 맵의 모든 키에 접근 가능
		for(String key:keys){
			Person person = maps.get(key);
			out.print(person.getName() + " : " + person.getAge() + "<br>");
		}
	%>
</body>
</html>