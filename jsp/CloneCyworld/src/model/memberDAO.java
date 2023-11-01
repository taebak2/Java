package model;

import java.sql.SQLException;

import common.DBConnector;

public class memberDAO extends DBConnector {

	public memberDAO() {
		super();
	}

	public int CreateMember(member cyMember) throws ClassNotFoundException {
		String INSERT_MEMBER_SQL = "insert into Member (id, password, email, phone, isAdmin) values "
				+ "(?, ?, ?, ?, ?)";

		int result = 0;

		try {
			psmt = con.prepareStatement(INSERT_MEMBER_SQL);
			psmt.setString(1, cyMember.getId());
			psmt.setString(2, cyMember.getPassword());
			psmt.setString(3, cyMember.getEmail());
			psmt.setString(4, cyMember.getPhone());
			psmt.setString(5, cyMember.getIsAdmin());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public int CheckDuplicateId(String id) throws SQLException {

		String GET_MEMBER_SQL = "select id from member where id = ? ";
		int result = 0;

		try {
			psmt = con.prepareStatement(GET_MEMBER_SQL);
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			if (rs.next()) {
				result = 1;
			} else {
				result = 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
  
	public member loginCheck(String id, String pw) {
		String sql = "select * from member where id=? and password=?";
		member member = new member();
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				member.setId(rs.getString("id"));
				member.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}

}
