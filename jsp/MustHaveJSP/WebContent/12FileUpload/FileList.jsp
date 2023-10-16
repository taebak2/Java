<%@page import="oracle.net.aso.f"%>
<%@page import="java.net.URLEncoder"%>
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
<title>Insert title here</title>
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
	<% for (MyfileDTO f : fileLists) {	%>
	<!-- fileLists 배열을 반복하며 MyfileDTO 클래스의 인스턴스를 f 변수에 차례로 할당 -->	
		<tr>
			<td><%=f.getIdx() %></td>	
			<td><%=f.getName() %></td>
			<td><%=f.getTitle() %></td>
			<td><%=f.getCate() %></td>
			<td><%=f.getOfile() %></td>
			<td><%=f.getSfile() %></td>
			<td><%=f.getPostdate() %></td>
			<!-- 각 파일 정보를 HTML <td> 요소에 출력 -->
			<td>a<a href="Download.jsp?oName=<%=URLEncoder.encode(f.getOfile(),"UTF-8")%>&sName=<%=URLEncoder.encode(f.getSfile(),"UTF-8")%>">[다운로드]
		</a></td>
		<!-- 파일 다운로드 링크를 생성
		Download.jsp 페이지로 이동하면서 다운로드할 파일의 원본 이름과 저장된 이름을 전달
		f.getOfile()는 파일의 원본 이름을 가져오고, f.getSfile()는 저장된 파일 이름을 가져옴 
		이들을 UTF-8로 인코딩하여 URL 파라미터로 전달 -->
			</tr>
		<% } %>
		</table>
</body>
</html>