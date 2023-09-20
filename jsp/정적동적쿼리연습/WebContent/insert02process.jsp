<%@page import="common.JDBConnect"%>
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
		JDBConnect j = new JDBConnect();
	
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String address= request.getParameter("address");	// mysql안의 column이름이랑 일치해야하는 부분이 어디인지?
	
		String query = "insert into member(id,pw,name,phone,address) values(?,?,?,?,?)";
		
		try{
			j.psmt =j.con.prepareStatement(query);
			j.psmt.setString(1, id);
			j.psmt.setString(2, pw);
			j.psmt.setString(3, name);
			j.psmt.setString(4, phone);
			j.psmt.setString(5, address);
			j.psmt.executeUpdate();	// 결과 int
			
			out.println("테이블 삽입 성공");
		} catch(Exception e) {
			out.println("테이블 삽입 실패");
			e.getMessage();
		} finally {
			j.close();
		}
	%>
	
</body>
</html>