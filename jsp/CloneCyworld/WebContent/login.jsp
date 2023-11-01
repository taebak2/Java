<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/layout.css" />
<link rel="stylesheet" href="./resources/css/index.css" />
<link rel="stylesheet" href="./resources/css/login.css" />
<script type="text/javascript" src="./resources/js/register.js"></script>
<title>로그인 페이지</title>
</head>
<body class="center-layout-column">
	<div class="center-layout-column">
		<img class="logo" alt="logo" src="./resources/img/cyworld.png" />
		<div class="center-layout-column">
			<form action="loginServlet" method="post" name="loginfrm">
				<div class="box">
					<div class="input-wrapper">
						<label>아이디</label> 
						<input type="text" name="id" />
					</div>
					<div class="input-wrapper">
						<label>비밀번호</label> 
						<input type="password" name="pw" />
					</div>
					<div>
					<c:if test="${param.error ==1 }">
						<p>존재하지 않는 아이디입니다.</p>
					</c:if>
					<c:if test="${param.error ==2 }">
						<p>비밀번호가 맞지 않습니다.</p>
					</c:if>
					</div>
					<div class="right">
						<button type="submit">로그인</button>
					</div>
				</div>
			</form>
			<p class="register right">
				계정이 없으신가요? <a href="Register.jsp" class="point">회원가입</a>
			</p>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>