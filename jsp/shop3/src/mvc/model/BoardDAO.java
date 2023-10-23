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

		} catch (Exception e) {
			System.out.println("getListCount 오류 : " + e);

		}

		return count;
	}

	public ArrayList<BoardDTO>	// board 테이블에 데이터 가져오기  
		getBoardList(int page, int limit, String items, String text) {
		int total_record = getListCount(items, text);	// 전체 게시물 개수 
		int start = (page - 1) * limit;	// 해당 페이지 게시물의 시작 지점
		int index = start + 1;

		String sql;

		if (items == null && text == null) {
			sql = "select * from board order by num desc";	// 조건이 없으면 전체 
		} else {
			sql = "select * from board where " + items + "like '%" + text + "%' order by num desc";
		}
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();

		try {
			
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while(rs.absolute(index)) {	// index행으로 이동 
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
				
				if((index) < (start + limit) && index <= total_record) {
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
}
