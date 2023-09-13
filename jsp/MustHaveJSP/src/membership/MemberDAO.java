package membership;

import common.JDBConnect;

public class MemberDAO extends JDBConnect {

	public MemberDAO() {	// JDBConnect.java의 JDBConnect 생성자를 가져옴 
		super();
	}
	
	// 명시한 아이디/패스워드와 일치하는 회원 정보를 반환 
	public MemberDTO getMemberDTO(String uid, String upass) {
		MemberDTO dto = new MemberDTO();	// 회원 정보 DTO 객체 생성 
		String query = "select * from member where id=? and pass=?";
		
		try {
			psmt = con.prepareStatement(query);	// 동적 쿼리 선언
			psmt.setString(1, uid);		// id
			psmt.setString(2, upass);	// pass 
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto.setId(rs.getString(1));
				dto.setPass(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
			}
		} catch (Exception e) {
			System.out.println("db연결 실패");
		}
		return dto;
	}
}
