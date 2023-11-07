<%@page import="javax.websocket.Decoder.Text"%>
<%@page import="model.guestbookReplyDAO"%>
<%@page import="model.guestbookReply"%>
<%@page import="model.guestbook"%>
<%@page import="java.util.List"%>
<%@page import="model.guestbookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.memberDAO"%>
<%@page import="model.member"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	String owner_id = request.getParameter("owner_id");
	memberDAO dao = new memberDAO();
	member cyMember = dao.getMember(owner_id);
	dao.close();
	guestbookDAO guestbook = new guestbookDAO();
	List<guestbook> guestbooklist = guestbook.selectList(owner_id);
	guestbook.close();
%>
</head>
<body>
	<c:if test="${loginUserId ne param.id}">
		<form action="GuestBookServlet" method="post">
			<input type="hidden" name="owner_id" value=<%=owner_id%> />
		</form>
	</c:if>
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
									<form action="LogoutServlet" method="post">
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
					<div class="left-box2">
						<form name="write" class="form-signin" action="GuestBookServlet"
							method="post">
							<div class="form-group">
							<input type="hidden" name="id" value="${loginUserId}"> 
							<input type="hidden" name="owner_id" value="${param.owner_id}">
								<input type="text" class="form-control" placeholder="내용" name="content" required /> 
							</div>
							<button class="btn btn-lg btn-success btn-block" type="submit">글작성</button>
						</form>
						<div class="gesipan">
							<c:forEach var="text" items="<%=guestbooklist%>">
								<div>${text.id}${text.created}</div>
								<div class="gesipan-list">
								<div class="img">
									<img class="profile" alt="profile" src="./resources/img/${text.imgName}" />
									<div class="content">${text.content}</div>
								</div>
								<%
								guestbookReplyDAO gReply = new guestbookReplyDAO();
								guestbook dto = (guestbook) pageContext.getAttribute("text");
								List<guestbookReply> gBookReply = gReply.selectGuest(dto.getNo());
								gReply.close();
								%>
								<c:forEach var="gtext" items="<%=gBookReply%>">
									<div>${gtext.id}${gtext.b_no}${gtext.content}
										${gtext.created}</div>
								</c:forEach>
								<form action="GuestBookReplyServlet" method="post">
									<div class="form-group">
										<input type="hidden" name="b_no" value="${text.no}"> 
										<input type="text" class="form-control" name="content" />
										<button class="btn btn-lg btn-success btn-block" type="submit">댓글 작성</button>
									</div>
								</form>
									</div>
							</c:forEach>
						</div>
					</div>
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