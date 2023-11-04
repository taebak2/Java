<%@page import="javax.websocket.Decoder.Text"%>
<%@page import="model.guestbook"%>
<%@page import="java.util.List"%>
<%@page import="model.guestbookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.memberDAO"%>
<%@page import="model.member"%>	
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/layout.css" />
<link rel="stylesheet" href="./resources/css/index.css" />
<link rel="stylesheet" href="./resources/css/home.css" />
<script type="text/javascript" src="./resources/js/home.js"></script>
<title>guestbook</title>
<%

	String owner_id = request.getParameter("owner_id");
	guestbookDAO dao2 = new guestbookDAO();
	List<guestbook> guest = dao2.selectList(owner_id);
	dao2.close();
%>

</head>
<body>
	<div class="container">
		<div class="right-box">
			<form action="LogoutServlet" method="post">
				<input type="submit" value="로그아웃" />
			</form>
			<div class="box-radius-5 logo-wrapper">
				<img class="literal-logo" alt="cy-literal-logo"
					src="./resources/img/Cyworld-literal.svg" />
			</div>
			<div class="box-radius-5 center-layout-column">
				<div class="bgm-wrapper">
					<p>BGM</p>
				</div>
				<div class="right-box-content">
					<div>
						<p>일기</p>
						<p>사진</p>
					</div>
					<div style="border: 1px solid black">
						<div class="menu-wrapper" style="display: flex">
							<div class="menu">투데이</div>
							<div class="menu">주크박스</div>
						</div>
						<div class="menu-wrapper" style="display: flex">
							<div class="menu">사진첩</div>
							<div class="menu"><input type="button" onclick="location.href='guestbook.jsp';"/>방명록</div>
						</div>
					</div>
				</div>
				<form name="write" class="form-signin" action="GuestBookServlet" method="post">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="내용" 
					name="content" required />
					<input type="hidden" name="id" value="${loginUserId}" >
					<input type="hidden" name="owner_id" value="${param.owner_id}" >
				</div>
				
				<button class="btn btn-lg btn-success btn-block" 
					type="submit">글작성</button>
			</form>
			</div>
			</div>
			<div class="gesipan">
			<c:forEach var="text" items="<%=guest%>">
				<div>${text.id }</div>
				<div>${text.created }</div>
				<div>${text.content }</div>
			</c:forEach>
			</div>
		</div>
</body>
</html>
