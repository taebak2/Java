<%@page import="model.guestbookDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.Console"%>
<%@page import="model.memberDAO"%>
<%@page import="model.member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/layout.css" />
<link rel="stylesheet" href="./resources/css/index.css" />
<link rel="stylesheet" href="./resources/css/home.css" />
<link rel="stylesheet" href="./resources/css/guestbook.css" />
<script type="text/javascript" src="./resources/js/home.js"></script>
<title>Insert title here</title>
<%
	String id = request.getParameter("id");
	memberDAO dao = new memberDAO();
	member cyMember = dao.getMember(id);
	dao.close();
%>
</head>
<body>
	<div class="container">
		<div class="right-box">

			<div class="box-radius-5 logo-wrapper">
				<img class="literal-logo" alt="cy-literal-logo"
					src="./resources/img/Cyworld-literal.svg" />
			</div>
			<div class="box-radius-5 center-layout-column">
				<div class="bgm-wrapper">
					<p>BGM</p>
				</div>
				<div class="right-box-content">
					<div class="menu-top" style="display: flex">
						<div class="menu">일기</div>
						<div class="menu">사진</div>
					</div>
					<div style="border: 1px solid black">
						<div class="menu-wrapper" style="display: flex">
							<div class="menu">투데이</div>
							<div class="menu">주크박스</div>
						</div>
						<div class="menu-wrapper" style="display: flex">
							<div class="menu">사진첩</div>
							<div class="menu">
								<a href="guestbook.jsp?owner_id=<%=id%>">방명록</a>
							</div>
						</div>
					</div>
				</div>
				<div class="right-box-content">
					<div class="left-box">
						<div class="box-radius-5 center">${loginUserId}님의미니홈피</div>
						<div class="box-radius-5 center">Today 222 | Total 1111</div>
						<div class="box-radius-5 center-layout-column">
							<img class="profile" alt="profile"
								src="./resources/img/<%=cyMember.getImgName()%>" />
							<div class="dot-line"></div>
							<div>
								<div class="box-radius-5">화이팅문구</div>
								<div><%=cyMember.getId()%>님의미니홈피에오신것을환영합니다!
									<form action="LogoutServlet" method="post" >
										<input type="submit" value="로그아웃" />
									</form>
								</div>
							</div>
							<div class="dot-line"></div>
							<div>
								<div>소개글</div>
								<select id="pageSelect" onchange="openPage()">
									<option value="">파도타기</option>
									<option value="https://www.naver.com">네이버</option>
									<option value="https://www.google.com">구글</option>
								</select>
							</div>
						</div>
					</div>
					<img class="big-img" alt="big" src="./resources/img/home.jpg">
				</div>
			</div>
		</div>
		<div class="menu-box">
			<div class="menu" align="center">홈</div>
			<div class="menu" align="center">프로필</div>
			<div class="menu" align="center">사진첩</div>
			<div class="menu" align="center">게시판</div>
			<div class="menu" align="center">
				<a href="guestbook.jsp?owner_id=<%=id%>">방명록</a>
			</div>
		</div>
	</div>
</body>
</html>