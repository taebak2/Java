<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">게시판</h1>
		</div>
	</div>
	<div class="container">
		<form name="newWrite" action="./BoardWriteAction.do" 
		class="form-horizontal" method="post">
		<div class="form-group row">
			<label class="col-sm-2 control-label">아이디</label>
			<div class="col-sm-3">
			<input name="id" type="text" class="form-control"
				value="${user_id}" readonly>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2 control-label">성명</label>
			<div class="col-sm-3">
			<input name="name" type="text" class="form-control"
				value="${user_name}" readonly>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2 control-label">제목</label>
			<div class="col-sm-3">
			<input name="subject" type="text" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2 control-label">내용</label>
			<div class="col-sm-3">
			<textarea rows="5" cols="50" name="content" class="form-control"></textarea>
			</div>
		</div>
		<input type="submit" value="전송">
		</form>
	</div>
</body>
</html>