package dao;

import common.JDBConnect;
import dto.MemberDTO;
public class MemberDAO extends JDBConnect {

	public MemberDAO() {
		super();
	}

	public MemberDTO getMemberDTO(String id, String pw) {
		MemberDTO dto = new MemberDTO(); // 회원 정보 DTO 객체 생성
		String query = "select * from member where id=? and pw=?";

		try {
			psmt = con.prepareStatement(query); // 동적 쿼리 선언
			psmt.setString(1, id); // id
			psmt.setString(2, pw); // pass
			rs = psmt.executeQuery();

			if (rs.next()) {	// 데이터베이스 결과 집합의 첫 번째, 두 번째 및 세 번째 열의 값을 가져옴
				dto.setId(rs.getString(1));	
				dto.setName(rs.getString(2));
				dto.setPw(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println("db연결 실패");
		}
		return dto;
	}
	public void addMember(String id, String name, String pw,String num, String ads) {
		String sql = "insert into member values (?,?,?,?,?)";
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, name);
			psmt.setString(3, pw);
			psmt.setString(4, num);
			psmt.setString(5, ads);
			psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(" 회원가입 실패 ");
		}
	}
	public String deleteMember(String id, String pw) {
		String query1 = "select * from member where id=?";	// 세션에 등록되어 있는 아이디 값을 select , loginprocess.jsp의 user_id를 ?에 대입 
		String result1="";
		try {
			psmt=con.prepareStatement(query1);
			psmt.setString(1, id);
			rs = psmt.executeQuery();	// rs에 select문으로 지정한 query1의 데이터가 모두 출력 (return값 object)
							// executeUpdate(); insert한 데이터 업데이트 (return값 int)
			if(rs.next()) {
				String password2 = rs.getString(3);
				if(pw.equals(password2)) {
					result1 = "회원 탈퇴 성공";
					String query2 = "delete from member where id=?";
					psmt = con.prepareStatement(query2);
					psmt.setString(1, id);
					psmt.executeUpdate();
				}
			}
		} catch (Exception e) {
			System.out.println(" 회원가입 실패 ");
		}
		return result1;
	}
	
	public void editmember(String id, String pw,String num, String ads) {
		String sql = "update member set pw=?,num=?, ads=? where id=?";	// id 열의 값을 기반으로 특정 행을 선택
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, pw);
			psmt.setString(2, num);
			psmt.setString(3, ads);
			psmt.setString(4, id);
			psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(" 정보 수정 실패 ");
			e.printStackTrace();
		}
	}
}
