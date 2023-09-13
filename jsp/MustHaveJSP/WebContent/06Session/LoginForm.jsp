<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인 페이지</h2>
	<span style="color: red; font-size: 1.2em;"> 
	<%= request.getAttribute("LoginErrMsg") == null ?	// request 내장 객체 영역에 
														// LoginErrMsg속성 확인 후 내용 출력
			"" : request.getAttribute("LoginErrMsg") %>	
	</span>
	<%
		if(session.getAttribute("UserId")==null){
	%>
	<script>
		function validateForm(form){
			if(!form.user_id.value){
			alert("아이디를 입력하세요");
			return false;	
			
			}
			if(form.user_pw.value == ""){
			alert("패스워드를 입력하세요"};
			return false;
		}
	</script>
	<form action="LoginProcess.jsp" method="post" name="loginFrm" onsubmit="return validateForm(this)"> 
		<!-- onsubmit = validateForm(this) 함수를 호출하고, 이 함수가 true를 반환하면 LoginProcess.jsp로 데이터를 제출 -->
		<!-- this=form 태그 전체, this가 validateForm안으로 들어감 -->
		아이디 : <input type="text" name="user_id"><br>
		비밀번호 : <input type ="password" name="user_pw"><br>
		<input type="submit" value="로그인하기">
	</form>
	<%} else { %>
	<%=session.getAttribute("UserName") %> 회원님, 로그인하셨습니다. <br>
	<a href="Logout.jsp">[로그아웃]</a>
	
	<%} %>
</body>
</html>