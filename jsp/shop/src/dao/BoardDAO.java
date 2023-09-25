package dao;

import java.util.ArrayList;
import java.util.List;

import common.JDBConnect;
import dto.BoardDTO;

public class BoardDAO extends JDBConnect {

	public BoardDAO() { // 기본 생성자 호출 시 DB연결 완료
		super();
	}

	// 게시물 개수 세기
	public int selectCount() { // count 반환값은 무조건 숫자가 나오기 때문에 변수를 int로 설정
		int result = 0; // 초기화
		String query = "select count(*) from board"; // 정적 쿼리
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			result = rs.getInt(1); // result = 5 -> 게시물 번호 사용하기 위한 용도

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시물 개수 세기 오류");
		}
		return result;
	}

	// 게시물의 내용 가져오기 class타입으로 가져오는것이 편함 -> BoardDTO
	// but 1개만 가져오기 때문에 Collection 사용 ex)List, ArrayList
	public List<BoardDTO> selectList() {
		List<BoardDTO> dto = new ArrayList<BoardDTO>();
		String query = "select * from board order by num desc";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				BoardDTO bto = new BoardDTO();
				bto.setNum(rs.getString("num"));
				bto.setTitle(rs.getString("title"));
				bto.setContent(rs.getString("content"));
				bto.setId(rs.getString("id"));
				bto.setPostdate(rs.getString("postdate"));
				bto.setVisitcount(rs.getInt("visitcount"));
				dto.add(bto);
			}
			System.out.println("게시물 가져오기 성공");
		} catch (Exception e) {
			System.out.println("게시물 가져오기 오류");
			e.printStackTrace();
		}
		return dto;
	}
	
	// 글쓰기
	public int insertWrite(BoardDTO dto) {
		int result = 0;
		
		try {
			String query = "insert into board(title,content,id,postdate,visitcount) values(?,?,?,?,0)";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getId());
			psmt.setString(4, dto.getPostdate());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시물 글쓰기 오류");
		}
		return result;
	}

}
