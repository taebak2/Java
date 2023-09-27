package dao;

import common.JDBConnect;
import dto.MemberShipDTO;

public class MemberShipDAO extends JDBConnect {

	public MemberShipDAO() {
		super();
	}

	public MemberShipDTO selectMember(String id, String pw) {
		MemberShipDTO dto = new MemberShipDTO();
		String query = "select * from membership where memberid=? and memberpw=?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getMemberid()); // query문 1번 ?에 dto.getMaemberid를 넣는다.
			psmt.setString(2, dto.getMemberpw()); // query문 2번 ?에 dto.getMaemberpw를 넣는다.
			rs = psmt.executeQuery(); // query 실행

			while (rs.next()) {
				dto.setMemberpw(rs.getString(2)); // 현재 dto에는 아무 data가 들어있지 않기 때문에
				dto.setMemberid(rs.getString(1)); // query문 실행 결과 값들을 dto에 넣는다.
				dto.setMembername(rs.getString(3));
				dto.setMemberaddress(rs.getString(4));
				dto.setMembertel(rs.getString(5));

				System.out.println("로그인 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("로그인 실패");

		}
		return dto;
	}

	public int insertMember(String id, String pw, String name, String address, String tel) {
		int result = 0;
		String query = "insert into membership values(?,?,?,?,?)";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, address);
			psmt.setString(5, tel);
			result = psmt.executeUpdate();
			
			if(result==1) {
				System.out.println("회원 추가 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("회원 추가 실패");
		}

		return result;
	}

	public int deleteMember(String id, String pw) {
		
		int result =0;
		String query ="delete from membership where memberid=? and memberpw=?";
		
		try {
			
			psmt =con.prepareStatement(query);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			
			result =psmt.executeUpdate();
			
			
			System.out.println("회원삭제성공");
		} catch (Exception e) {
			System.out.println("회원삭제실패"+e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
}
