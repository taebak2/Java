<%@page import="fileupload.MyfileDTO"%>
<%@page import="fileupload.MyfileDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileList</title>
</head>
<body>
	<h2> 데이터베이스에 등록된 파일 목록 보기 </h2>
	<a href="FileUploadMain.jsp"> 파일 등록하기 </a>
	<%
		MyfileDAO dao = new MyfileDAO();
		List<MyfileDTO> fileLists = dao.myFileList();
		dao.close();
	%>
	<c:set var="fileLists" value="<%=fileLists%>"/>
	<table border="1" >
		<tr>
			<td>순서 </td>
			<td>작성자 </td>
			<td>제목 </td>
			<td>카테고리 </td>
			<td>원본 파일명</td>
			<td>저장된 파일명</td>
			<td>작성일</td>
		</tr>
	<c:forEach var="fileList" items="${fileLists}">
		<tr>
		<td>${fileList.idx}</td>
		<td>${fileList.name}</td>
		<td>${fileList.title}</td>
		<td>${fileList.cate}</td>
		<td>${fileList.ofile}</td>
		<td>${fileList.sfile}</td>
		<td>${fileList.postdate}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
