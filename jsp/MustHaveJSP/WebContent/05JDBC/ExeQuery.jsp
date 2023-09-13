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
	<h2> 회원 목록 조회 테스트 </h2>
	<%
		JDBConnect jdbc = new JDBConnect();
		String sql = "select * from member";
		jdbc.stmt = jdbc.con.createStatement();	// Connection 객체에서 Statement 객체를 생성하는 메서드
												// Statement 객체를 사용하여 데이터베이스에 SQL 쿼리를 보내고 실행
		jdbc.rs = jdbc.stmt.executeQuery(sql);	// Statement 객체의 메서드로, 주어진 SQL 쿼리를 실행하고 그 결과로 ResultSet 객체를 반환
		
		while(jdbc.rs.next()){
			String id = jdbc.rs.getString(1);
			String pw = jdbc.rs.getString(2);
			String name = jdbc.rs.getString(3);
			java.sql.Date regidate = jdbc.rs.getDate(4);
			out.print(id+" "+ pw + " " + name+ " " + regidate+"<br>");
		}
			jdbc.close();
	%>
</body>
</html>