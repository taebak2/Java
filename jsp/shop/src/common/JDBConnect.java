package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnect {
	public Connection con; 
	public Statement stmt; 
	public PreparedStatement psmt; 
	public ResultSet rs; 

	public JDBConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/member"; 
			String id = "manager"; // 사용자 계정 아이디
			String pwd = "1234"; // 계정 비밀번호
			con = DriverManager.getConnection(url, id, pwd); // Java에서 JDBC를 사용하여 데이터베이스와의 연결을 설정하는 코드

			System.out.println("데이터 베이스 연결 성공");

		} catch (Exception e) {
			System.out.println("데이터 베이스 연결 오류입니다");
			e.printStackTrace(); // 위 코드에서 예외가 발생하면 해당 예외의 스택 트레이스가 출력되어 예외가 발생한 곳과 예외의 타입 등을 확인

		}
	}

	
	public void close() {
		try {
			if (rs != null) rs.close();		
			if (psmt != null) psmt.close();	
			if (con != null) con.close();	
			System.out.println("자원 해제");
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
}
