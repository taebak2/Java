package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnect {
	public Connection con; // 데이터베이스 연결
	public Statement stmt; // 정적 쿼리문
	public PreparedStatement psmt; // PreparedStatement (동적 쿼리문)
	public ResultSet rs; // 쿼리 실행 결과 저장

	public JDBConnect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // Java에서 Oracle JDBC 드라이버 클래스를 로드하는 코드

			// com.mysql.jdbc.Driver mysql 드라이버 이름

			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // db 접속 주소
			String id = "manager"; // 사용자 계정 아이디
			String pwd = "1234"; // 계정 비밀번호
			con = DriverManager.getConnection(url, id, pwd); // Java에서 JDBC를 사용하여 데이터베이스와의 연결을 설정하는 코드

			System.out.println("데이터 베이스 연결 성공");

		} catch (Exception e) {
			System.out.println("데이터 베이스 연결 오류입니다");
			e.printStackTrace(); // 위 코드에서 예외가 발생하면 해당 예외의 스택 트레이스가 출력되어 예외가 발생한 곳과 예외의 타입 등을 확인

		}
	}

	public JDBConnect(String driver, String url, String id, String pwd) {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("2번째 연결 성공");
			
		} catch (Exception e) {
			System.out.println("2번째 데이터베이스 연결 오류입니다.");
			e.printStackTrace();
		}
		
	}
	
	public void close() {
		try {
			if (rs != null) rs.close();	// 결과 집합(ResultSet)을 닫음
			if (stmt != null) stmt.close();	// 명령문(Statement 또는 PreparedStatement)을 닫음
			if (con != null) con.close();	// 데이터베이스 연결(Connection)을 닫음
			System.out.println("자원 해제");
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
}
