package dto;

import common.JDBConnect;

public class MemberDAO extends JDBConnect {

	public MemberDAO() {
		super();
	}

	public MemberDTO getMemberDTO(String uid, String upass) {
		MemberDTO dto = new MemberDTO(); // 회원 정보 DTO 객체 생성
		String query = "select * from member where id=? and pass=?";

		try {
			psmt = con.prepareStatement(query); // 동적 쿼리 선언
			psmt.setString(1, uid); // id
			psmt.setString(2, upass); // pass
			rs = psmt.executeQuery();

			if (rs.next()) {
				dto.setId(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setPw(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println("db연결 실패");
		}
		return dto;
	}
}
