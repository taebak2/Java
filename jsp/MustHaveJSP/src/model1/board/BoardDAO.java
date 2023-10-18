package model1.board;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.servlet.ServletContext;

import common.JDBConnect;

public class BoardDAO extends JDBConnect {

	public BoardDAO(ServletContext application) {
		super(application);
	}

	public int selectCount(Map<String, Object> map) { // boardDTO를 Object로 끌어옴
		int totalCount = 0;

		String query = "select count(*) from board";

		if (map.get("searchWord") != null) { // 검색하는 단어가 있다면
			// searchField = 검색 분류(종류)와 searchWord = 검색 단어로 쿼리문 완성
			query += " where " + map.get("searchField") + " " 
					+ " like '%" + map.get("searchWord") + "%'";
		}

		try {
			stmt = con.createStatement(); // 쿼리문 생성
			rs = stmt.executeQuery(query); // 쿼리문 실행
			rs.next(); // rs.next();를 호출하면 커서가 다음 행으로 이동하게 되고, 그 행의 데이터를 읽음
						// ResultSet은 행과 열로 구성된 결과 집합
			totalCount = rs.getInt(1); // rs.getInt(1); ResultSet에서 현재 커서가 위치한 행의 첫 번째 열의 값을 정수로 가져오는 역할
										// 값을 추출하기 위해서는 rs.next();를 반드시 선행해야한다.
			System.out.println("게시물 개수 추출 성공");
		} catch (Exception e) {
			System.out.println("게시물 개수 오류");
			e.printStackTrace();
		}

		return totalCount;
	}

	public List<BoardDTO> selectList(Map<String, Object> map) {
		List<BoardDTO> bbs = new Vector<BoardDTO>();

		String query = "select * from ( select Tb.*, rownum rNum from ( select * from board ";
		if (map.get("searchWord") != null) {
			query += " where " + map.get("searchField") + " " + " " + "like '%" + map.get("searchWord") + "%'";
		}
		query += " order by num desc ) Tb ) where rNum between ? and ?"; 
		// 게시물 번호로 내림차순 정렬 (최근 게시물이 위로 오게 정렬)

		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, map.get("start").toString());
			psmt.setString(2, map.get("end").toString());
			rs = psmt.executeQuery();

			while (rs.next()) {
				BoardDTO dto = new BoardDTO();

				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setId(rs.getString("id"));
				dto.setVisitcount(rs.getInt("visitcount"));
				bbs.add(dto);
			}
			System.out.println("게시물 조회 성공");
		} catch (Exception e) {
			System.out.println("게시물 조회 실패");
			e.printStackTrace();
		}

		return bbs;
	}
	
	public int insertWrite(BoardDTO dto) {	// BoardDTO 타입의 매개변수를 받은 후 데이터를 insert, 그리고 성공한 행의 개수를 정수 정수로 반환 
		int result = 0;
		
		try {
			String query = "insert into board(num,title,content,id,visitcount) values(seq_board_num.NEXTVAL,?,?,?,0)";	// 쿼리문 작성, NEXTVAL: 시퀀스에서 다음 값을 가져오는 명령어
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getId());
			result = psmt.executeUpdate();	// 수행 결과로 int타입을 반환 
											// SELECT 구문을 제외한 다른 구문을 수행할 때 사용되는 함수
			 								// INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환합니다.
											// CREATE / DROP 관련 구문에서는 -1 을 반환
			
			System.out.println("글쓰기 성공");
		} catch (Exception e) {
			System.out.println("게시물 추가 오류");
			e.printStackTrace();
		}
		
		return result;
	}
	public BoardDTO selectView(String num) {
		BoardDTO dto = new BoardDTO();
		String query = "select B.*, M.name from member M inner join board B on M.id=B.id where num=?";
		//	"회원" 테이블(별명 "M")과 "게시판" 테이블(별명 "B")에서 데이터를 선택하고, 
		//	"id" 열을 기준으로 내부 조인을 사용하여 이 두 테이블을 결합
		//	"회원" 테이블의 "id"와 "게시판" 테이블의 "id"가 일치하는 행만 결과에 포함
		//	select B.* 결과 집합에서 "게시판" 테이블의 모든 열을 선택
		
		try {
			psmt = con.prepareStatement(query);	// 동적 쿼리니까 prepareStatement
			psmt.setString(1, num);	
			rs = psmt.executeQuery();	// executeQuery는 object 타입
			
			if(rs.next()) {	// 조건문의 결과는 무조건 1개밖에 나올 수 없음.. query문이 1개 + sequence의 num은 중복되지 않음
				dto.setNum(rs.getString(1));
				dto.setTitle(rs.getString(2));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setVisitcount(rs.getInt("visitcount"));
				dto.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시물 상세보기 오류");
		}
		
		return dto;
	}
	
	// 게시물의 조회수 증가 메서드
	public void updateVisitCount(String num) {
		
		String query = "update board set visitcount = visitcount+1 where num=?";	// query문은 ++이나 -- 안먹힘
		//	게시판" 테이블에서 "num" 열 값이 물음표(?)에 지정된 
		//	매개변수 값과 일치하는 행을 찾아서, 해당 행의 "visitcount" 값을 1 증가
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, num);
			psmt.executeQuery();	// contents 내용만 바뀌기 때문에 executeUpdate를 사용할 필요가 없음
									// Rs는 데이터베이스에서 가져온 데이터를 조작하기 위한 목적인데, 
									// 현재는 행의 개수를 알 필요가 없기 때문에 executeQuery를 사용해도 무방함
			System.out.println("게시물 조회수 증가 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시물 조회수 증가 오류");
		}
	}
	public int updateEdit(BoardDTO dto) {
		int result = 0;
		
		String query = "update board set title=?, content=? where num=?";	// 제목과 내용만 변경 가능 
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getNum());
			result = psmt.executeUpdate();
			
			System.out.println("게시물 수정 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시물 수정 오류");
		}
		
		return result;
	}
	
	// 게시물 삭제
	public int deletePost(BoardDTO dto) {
		int result=0;
		String query = "delete from board where num=?";
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getNum());
			result = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시물 삭제 실패");
		}
		return result;
	}
}
