package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlConnect {
	public Connection con;
	public PreparedStatement psmt;
	public ResultSet rs;

	public MySqlConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/member?useUnicode=true&characterEncoding=utf8";
			String id = "manager";
			String pw = "1234";
			con = DriverManager.getConnection(url,id,pw);
			
			System.out.println("데이터 베이스 연결 성공");
					

		} catch (Exception e) {
			System.out.println("데이터 베이스 연결 실패 ");
		}
	}
	
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(psmt!=null) psmt.close();
			if(con!=null) con.close();
			System.out.println(" 자원 해제 ");
		} catch (Exception e) {
			System.out.println("데이터 베이스 연결 실패 ");
			e.printStackTrace();
		}
	}
}
