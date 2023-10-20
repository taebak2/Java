package dao;

import common.MysqlDB;
import dto.mvctestDTO;

public class mvctestDAO extends MysqlDB {

	public mvctestDAO() {
		super();
	}

	public mvctestDTO check(String id, String pw) {
		
		int result = 0;
		mvctestDTO dto = new mvctestDTO();
		
		try {
			String query = "select * from membership where id=? and pw=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();

			if (rs.next()) {
				dto.setName(rs.getString("name"));
				System.out.println("로그인 성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("로그인 실패");
		}

		return dto;

	}

}
