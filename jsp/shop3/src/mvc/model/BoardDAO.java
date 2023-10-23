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
		int start = (page - 1) * limit;	
		// 해당 페이지 게시물의 시작 지점 
		// 페이지 번호를 기반으로 시작 위치를 계산하여 
		// 해당 페이지에서 표시할 데이터 범위를 정함
		int index = start + 1;
		// 데이터를 반복적으로 검색하기 위한 인덱스 변수
		String sql;

		if (items == null && text == null) {
			sql = "select * from board order by num desc";	// 조건이 없으면 전체를 반환 
		} else {
			sql = "select * from board where " + items + "like '%" + text + "%' order by num desc";
		}
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();

		try {
			
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while(rs.absolute(index)) {	// absolute 메서드를 이용해 특정 위치로 이동 
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
				
				if((index) < (start + limit) && index <= total_record) { // 인덱스가 해당 페이지의 시작 위치와 페이지당 표시할 항목 수 범위 내에 있으며
											 // 전체 레코드수보다 작거나 같은지 확인
											 // 즉, 현재 페이지 범위 내에 레코드가 남아 있는지를 확인
					index++;
				} else {
					break;
				// 만약 현재 인덱스가 페이지 범위 내에 없거나 전체 레코드를 모두 읽었을 경우, 
				// 종료하고 데이터 검색 작업을 마침
				}
			}
			return list;
			// 해당 페이지에 표시해야 하는 데이터 목록 반환
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결 오류 ");
		}
		return null;
	}
}
