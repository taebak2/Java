<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@page import="mvc.model.BoardDAO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<%
	List boardList = (List)request.getAttribute("boardlist");
	// 게시판 리스트
	int total_record = ((Integer)request.getAttribute("total_record")).intValue();
	// 전체 게시물 개수
	int pageNum = ((Integer)request.getAttribute("pageNum")).intValue();
	// 현재 페이지 번호
	int total_page = ((Integer)request.getAttribute("total_page")).intValue();
	// 전체 페이지 개수
%>
<!-- 세션 ID를 가져오고 게시판 객체 생성 
	 전체 게시글 개수 (total_record),전체 페이지(total_page), 
	 현재 페이지 번호(pageNum)로 대입시킴 -->
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Board</title>
<script type="text/javascript">
	function checkForm() {
		if(${user_id==null}){
			alert("로그인 해주세요.");
			return false;
		} 
		
		location.href = "./BoardWriteForm.do?id=${user_id}"
	}
</script>
</head>
<body>
	<jsp:include page="/menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">게시판</h1>
		</div>
	</div>

	<div class="container">

		<form action='<c:url value="./BoardListAction.do"/>' method="post">
			<div class="text-right">
				<span class="badge badge-success">전체${total_record}건</span>
			</div>
			
			<div style="padding-top: 50px">
			<table class="table table-hover">
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성일</th>
					<th>조회</th>
					<th>글쓴이</th>
				</tr>
			<c:forEach items="${boardlist}" var="list">
			<tr>
				<td>${list.num}</td>
				<td><a href="./BoardViewAction.do?num=${list.num}&pageNum=${pageNum}">${list.subject}</a></td>
				<td>${list.regist_day}</td>
				<td>${list.hit}</td>
				<td>${list.name}</td>
			</tr>
			</c:forEach>
			</table>
		</div>
	</form>
	</div>
</body>
</html>