package mvc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;

	public DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mvcboard?useUnicdoe=true&characterEncoding=utf8&SSL=false";
			String id = "manager";
			String pw = "1234";

			con = DriverManager.getConnection(url, id, pw);
			System.out.println("데이터베이스 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결 실패");

		}
	}

	public void close() {
		try {
			if (con != null)
				con.close();
			if (psmt != null)
				psmt.close();
			if (stmt != null)
				stmt.close();
			if (rs != null)
				rs.close();
			System.out.println("데이터베이스 연결 종료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터베이스 해제 실패");
		}

	}
}
