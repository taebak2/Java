<%@page import="java.util.List"%>
<%@page import="db.testDTO"%>
<%@page import="db.testDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	testDAO dao = new testDAO();
	List<testDTO> studentlist = dao.selectList(request.getParameter("score"));
	dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>성적표 출력</h3>
	<form>
		<table border="1">
			<tr>
				<td colspan="5">학점 : <input type="text" name="score"> <input
					type="submit" value="찾기">
				</td>
			</tr>
		</table>
	</form>
	<table border="1">
		<tr>
			<th>학번</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>학점</th>
			</tr>
			<%
				for (testDTO dto : studentlist) {
				double avg = (dto.getKor() + dto.getEng() + dto.getMat()) / 3;
			%>
			<c:set var="avg" value="<%=avg%>"/>
		<tr>
			<th><%=dto.getStudentId()%></th>
			<th><%=dto.getKor()%></th>
			<th><%=dto.getEng()%></th>
			<th><%=dto.getMat()%></th>

			<th><c:choose>
					<c:when test="${avg>=90}">A</c:when>
					<c:when test="${avg>=80}">B</c:when>
					<c:when test="${avg>=70}">C</c:when>
					<c:otherwise>F</c:otherwise>
				</c:choose>
				</th>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>