<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="el.MyELClass"%>
<%
	MyELClass myClass = new MyELClass();
	pageContext.setAttribute("myClass",myClass); 	// EL 사용하려면 항상 저장 해줘야함
	String jumin2 = request.getParameter("jumin");	// myClass.java를 불러오지 않으면, String 값 = null인 상태 
	if(jumin2 !=null){								// 따라서 null의 index값을 불러오기 때문에 오류가 발생
		pageContext.setAttribute("result", myClass.getGender(jumin2));
	String email = request.getParameter("mail1") + "@" + request.getParameter("mail2");
	pageContext.setAttribute("result2", myClass.getId(email));
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		이름 : <input type="text" name="name"><br>
		주민등록번호 : <input type="text" name="jumin"><br>
		이메일 :
		<input type="text" name="mail1">@
		<select name="mail2">
		<option value="google.com">google.com</option>
		<option value="naver.com">naver.com</option>
		<option value="daum.net">daum.net</option>
		</select>
		<br>
		<input type="submit" value="전송">
		</form>
	<h1> 성별 확인 </h1>
	<h3>${param.name}님의 성별은 ${result} </h3>
	<h3>이메일 아이디: ${result2}</h3>
</body>
</html>