package model2.mvcboard;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.JDBConnect;

public class MVCBoardDAO extends JDBConnect {

	public MVCBoardDAO() {
		super();
	}

	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;

		String query = "select count(*) from mvcboard";

		if (map.get("searchWord") != null) {
			query += " where " + map.get("searchField") + " " + " like '%" + map.get("searchWord") + "%'";
		}

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			totalCount = rs.getInt(1);
			System.out.println("게시물 개수 추출 성공");
		} catch (Exception e) {
			System.out.println("게시물 개수 오류");
			e.printStackTrace();
		}

		return totalCount;
	}

	public List<MVCBoardDTO> selectList(Map<String, Object> map) {
		List<MVCBoardDTO> bbs = new Vector<MVCBoardDTO>();

		String query = "select * from ( select Tb.*, rownum rNum from ( select * from mvcboard ";
		if (map.get("searchWord") != null) {
			query += " where " + map.get("searchField") + " " + " " + "like '%" + map.get("searchWord") + "%'";
		}
		query += " order by idx desc ) Tb ) where rNum between ? and ?";

		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, map.get("start").toString());
			psmt.setString(2, map.get("end").toString());
			rs = psmt.executeQuery();

			while (rs.next()) {
				MVCBoardDTO dto = new MVCBoardDTO();

				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setSfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setPass(rs.getString(9));
				dto.setVisitcount(rs.getInt(10));
				bbs.add(dto);
			}
			System.out.println("게시물 조회 성공");
		} catch (Exception e) {
			System.out.println("게시물 조회 실패");
			e.printStackTrace();
		}

		return bbs;
	}

	
	  public int insertWrite(MVCBoardDTO dto) { int result = 0;
	  
	  try { 
		  String query = "insert into mvcboard(idx,name,title,content,ofile,sfile,pass) "
				  		+ "values(seq_board_num.NEXTVAL,?,?,?,?,?,?)";
		  
			 psmt = con.prepareStatement(query);
			 psmt.setString(1, dto.getName());
			 psmt.setString(2, dto.getTitle());
			 psmt.setString(3, dto.getContent());
			 psmt.setString(4, dto.getOfile());
			 psmt.setString(5, dto.getSfile());
			 psmt.setString(6, dto.getPass());
			 result = psmt.executeUpdate();
	 System.out.println("글쓰기 성공");
	} catch (Exception e) {
	  System.out.println("게시물 추가 오류"); 
	  e.printStackTrace();
	  
	}
	  return result; 
}
	  

  public MVCBoardDTO selectView(String idx) { 
	  MVCBoardDTO dto = new MVCBoardDTO(); 
	  String query = "select * from mvcboard where idx=?";
  
	  try { 
		  psmt = con.prepareStatement(query); 
		  psmt.setString(1, idx); 
		  rs = psmt.executeQuery(); 
		  if(rs.next()) { 
			  dto.setIdx(rs.getString(1));
			  dto.setName(rs.getString(2));  
			  dto.setTitle(rs.getString(3)); 
			  dto.setContent(rs.getString(4));
			  dto.setPostdate(rs.getDate(5));
			  dto.setOfile(rs.getString(6));
			  dto.setSfile(rs.getString(7));
			  dto.setDowncount(rs.getInt(8));
			  dto.setPass(rs.getString(9));
			  dto.setVisitcount(rs.getInt(10));
		}
		System.out.println("게시물 상세보기 성공");
	  	} catch (Exception e) {
		  e.printStackTrace(); 
		  System.out.println("게시물 상세보기 오류"); 
		  }
	  return dto; 
	  }
  

  // 게시물의 조회수 증가 메서드 
  public void updateVisitCount(String idx) {
  
  String query = "update mvcboard set visitcount = visitcount+1 where idx=?";
  
  
  try { psmt = con.prepareStatement(query); 
  		psmt.setString(1, idx);
  		psmt.executeQuery(); 
  		System.out.println("게시물 조회수 증가 성공");
  } catch (Exception e) { 
	  e.printStackTrace(); 
	  System.out.println("게시물 조회수 증가 오류"); 
	  } 
  } 
  
  public void downCountplus(String idx) {
	  
	  String query = "update mvcboard set downcount = downcount+1 where idx=?";
	  
	  try { psmt = con.prepareStatement(query); 
	  		psmt.setString(1, idx);
	  		psmt.executeQuery(); 
	  		System.out.println("첨부 파일 다운 성공");
	  } catch (Exception e) { 
		  e.printStackTrace(); 
		  System.out.println("첨부 파일 다운 실패"); 
		  } 
	  } 
  
  
	
	/*
	 * public int updateEdit(MVCBoardDTO dto) { int result = 0; String query =
	 * "update mvcboard set title=?, content=? where num=?";
	 * 
	 * try { psmt = con.prepareStatement(query); psmt.setString(1, dto.getTitle());
	 * psmt.setString(2, dto.getContent()); psmt.setString(3, dto.getNum()); result
	 * = psmt.executeUpdate();
	 * 
	 * System.out.println("게시물 수정 성공"); } catch (Exception e) { e.printStackTrace();
	 * System.out.println("게시물 수정 오류"); } return result; }
	 */
  
  // 게시물 삭제 
	/*
	 * public int deletePost(MVCBoardDTO dto) { int result=0; String query=
	 * "delete from mvcboard where num=?"; try { psmt = con.prepareStatement(query);
	 * psmt.setString(1, dto.getidx()); result = psmt.executeUpdate();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); System.out.println("게시물 삭제 실패");
	 * } return result; }
	 */
 
	 
}
