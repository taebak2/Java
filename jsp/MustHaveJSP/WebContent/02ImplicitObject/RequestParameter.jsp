<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8"); // 한글 처리
	String id = request.getParameter("id");
	String gender = request.getParameter("gender");
	String[] favo = request.getParameterValues("favo"); 
	// 파라미터 값들을 배열로 가져오는 메서드
	// 이 메서드는 주로 다중 선택 항목에 대한 데이터를 처리할 때 사용
	
	String favoStr = ""; // 선택한 취향을 저장할 문자열 변수를 초기화
	if (favo != null) {
		for (int i = 0; i < favo.length; i++) {
			favoStr += favo[i] + " ";
		}
	}
	String intro = request.getParameter("intro").replace("\r\n", "<br>");
	%>
	 <!-- "intro" 파라미터 값을 받아온 후, 줄바꿈 문자(\r\n)를 HTML의 <br> 태그로 대체하여 줄바꿈을 처리 
	 HTML에서 줄바꿈을 나타내는 방식과 일반 텍스트 에디터에서의 줄바꿈을 나타내는 방식은 다르기 때문에, 
	 사용자가 입력한 줄바꿈 문자를 HTML 페이지에 올바르게 표현하기 위해 \r\n을 <br> 태그로 대체하는 것
	 -->
	<ul>
		<li>아이디 : <%=id%></li>
		<li>성별 : <%=gender%></li>
		<li>관심사항 : <%=favoStr%></li>
		<li>자기소개 : <%=intro%></li>
	</ul>
</body>
</html>