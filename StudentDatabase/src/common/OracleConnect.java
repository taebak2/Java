package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OracleConnect {
	public Connection con;	// DB 접속
	public PreparedStatement psmt;	// 동적 쿼리 사용
	public ResultSet rs; // 쿼리 실행 결과 
	
	public OracleConnect() {	// 기본 생성자
		try {
			Class.forName("oracle.jdbc.OracleDriver");	// 오라클 드라이버 연결
			// Class.forName("com.mysql.jdbc.Driver");	// mysql 드라이버 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "manager";
			String pwd = "1234";
			con = DriverManager.getConnection(url,id,pwd);	// 오라클 DB 연결
		} catch (Exception e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		
	}
	
	public void close() {
		try {
			if(rs != null) rs.close();	// 쿼리 실행 결과가 null이 아니라면
			if(psmt != null) psmt.close();	// 동적 쿼리가 null이 아니라면
			if(con != null) con.close();	// DB 접속이 null이 아니라면 
			System.out.println("연결 해제 성공");
		} catch (Exception e) {
			System.out.println("연결 해제 실패");
		}
		
	}
	
}
