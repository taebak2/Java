<%@page import="dto.MemberDTO"%>
<%@page import="dao.MemberDAO"%>
<%@page import= "java.sql.ResultSet" %>
<%@page import= "java.sql.PreparedStatement" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		/* String id = request.getParameter("id");
		String password = request.getParameter("password");
		
			
		String sql = "select * from member";
		PreparedStatement psmt = jdbc.con.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();
		
		String result="";
		while(rs.next()) {
			String id2 = rs.getString(1);
			String name = rs.getString(2);
			String password2 = rs.getString(3);
			
			if(id.equals(id2) && password.equals(password2)) {
				result=name + "님 환영합니다.";
				session.setAttribute("user_id",id2);
				session.setAttribute("user_name",name);
				break;
			}
		}
		
		if(result=="") {
			request.getRequestDispatcher("login.jsp?error=1").forward(request,response);
		}
		jdbc.close(); */
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		//	사용자가 입력한 데이터를 가져옴 (아이디와 패스워드)
		
		MemberDAO dao = new MemberDAO();	// mysql 데이터베이스 연결
		MemberDTO dto = dao.getMemberDTO(id,pw);
		//	사용자가 입력한 데이터가 mysql db에 있으면 dto에 해당 정보가 삽입됨
		//	사용자가 입력한 데이터가 mysql db에 없으면 dto에 객체는 비어있음
		
		String result="";
		if(dto.getId()!=null){	// dto 내에 데이터가 존재하면 
			session.setAttribute("user_id", dto.getId());	// session으로 설정 (로그인 상태를 유지해야하기 때문에), 다른 페이지에서 쓸 때 유용
			session.setAttribute("user_name", dto.getName());	
			result=dto.getName() + "님 환영합니다.";
		}
		else{
			request.getRequestDispatcher("login.jsp?error=1").forward(request, response);
		}
		dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">로그인 처리</h1>
		</div>
	</div>
	
	<div class="container">
			<h1 class="display-5"><%=result%></h1>
			<a href="welcome.jsp" class="btn btn-secondary"> 돌아가기 </a>
	</div>
</body>
</html>
