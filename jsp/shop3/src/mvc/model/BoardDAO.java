package mvc.model;

import java.util.ArrayList;

import mvc.database.DBConnection;

public class BoardDAO extends DBConnection {

	public BoardDAO() {
		super();
	}

	public int getListCount(String items, String text) { // 게시물 개수 세기
		int count = 0;
		String sql;

		if (items == null && text == null) // 검색 조건이 없으면 전체 레코드 개수
			sql = "select count(*) from board";
		else
			sql = "select count(*) from board where " + items + " like '%" + text + "%'";

		try {
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1);
			}

			System.out.println(count);
			System.out.println("getListCount 성공");
		} catch (Exception e) {
			System.out.println(count);
			System.out.println("getListCount 오류 : " + e);

		}

		return count;
	}

	public ArrayList<BoardDTO> // board 테이블에 데이터 가져오기
			getBoardList(int page, int limit, String items, String text) {
		int total_record = getListCount(items, text); // 전체 게시물 개수
		int start = (page - 1) * limit; // 해당 페이지 게시물의 시작 지점
		int index = start + 1;

		String sql;

		if (items == null && text == null) {
			sql = "select * from board order by num desc"; // 조건이 없으면 전체
		} else {
			sql = "select * from board where " + items + " like '%" + text + "%' order by num desc";
		}
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();

		try {

			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.absolute(index)) { // index행으로 이동
				BoardDTO board = new BoardDTO();
				board.setNum(rs.getInt("num"));
				board.setId(rs.getString("id"));

				board.setName(rs.getString("name"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setRegist_day(rs.getString("regist_day"));
				board.setHit(rs.getInt("hit"));
				board.setIp(rs.getString("ip"));
				list.add(board);

				if ((index) < (start + limit) && index <= total_record) {
					index++;
				} else {
					break;
				}
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결 오류 ");
		}
		return null;
	}

	public void insertWrite(BoardDTO dto) {

		int result = 0;
		String query = "insert into board(id,name,subject,content,regist_day,ip,hit) values(?,?,?,?,?,?,0)";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getSubject());
			psmt.setString(4, dto.getContent());
			psmt.setString(5, dto.getRegist_day());
			psmt.setString(6, dto.getIp());
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시물 글쓰기 오류");
		}
	}

	public BoardDTO getBoardByNum(int num) {
		String sql = " select * from board where num = ? ";
		BoardDTO dto = null;

		// 게시판 조회수 증가
		updateHit(num);
		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();

			if (rs.next()) {
				dto = new BoardDTO();
				dto.setNum(rs.getInt("num"));
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setRegist_day(rs.getString("regist_day"));
				dto.setHit(rs.getInt("hit"));
				dto.setIp(rs.getString("ip"));
				System.out.println("조회 성공");
			}
			return dto;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("조회 실패");
		}
		return null;
	}

	public void updateHit(int num) {
		try {
			String sql = "update board set hit = hit+1 where num=?";
			// DB에 증가된 횟수를 업데이트 시킴
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.executeUpdate();
			System.out.println("게시판 조회횟수 업데이트 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시판 조회횟수 업데이트 에러");
		}
	}

	public void updateBoard(BoardDTO dto) {
		int result = 0;
		try {
			String sql = "update board set content=?, subject=? where num=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dto.getSubject());
			psmt.setString(2, dto.getContent());
			psmt.setInt(3, dto.getNum());
			result = psmt.executeUpdate();
			System.out.println("수정 완료");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("수정 실패");
		}
	}

}
