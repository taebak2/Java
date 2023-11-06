package model;

import java.util.ArrayList;
import java.util.List;

import common.DBConnector;

public class guestbookDAO extends DBConnector{

	public guestbookDAO() {
		super();
	}
	
	// 게시물 작성
	public int Write(guestbook guest) throws ClassNotFoundException{
		int result = 0;
		String WRITE_GUESTBOOK_SQL = "insert into guestbook(id,owner_id,created,content) values (?,?,now(),?)";
		try {
			psmt = con.prepareStatement(WRITE_GUESTBOOK_SQL);
			psmt.setString(1, guest.getId());
			psmt.setString(2, guest.getOwner_id());
			psmt.setString(3, guest.getContent());
			
			System.out.println(guest.getId());
			System.out.println(guest.getOwner_id());
			System.out.println(guest.getContent());
			
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시물 글쓰기 오류");
		}
		return result;
	}
	
	// 게시물 가져오기
	public List<guestbook> selectList(String id){
		List<guestbook> guest = new ArrayList<guestbook>();
		String LIST_GUESTBOOK_SQL = "select * from guestbook join member on member.id = guestbook.id where owner_id = ?";
		try {
			psmt = con.prepareStatement(LIST_GUESTBOOK_SQL);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			while(rs.next()) {
				guestbook gbook = new guestbook();
				gbook.setId(rs.getString("id"));
				gbook.setOwner_id(rs.getString("owner_id"));
				gbook.setCreated(rs.getString("created"));
				gbook.setContent(rs.getString("content"));
				gbook.setImgName(rs.getString("imgName"));
				guest.add(gbook);
			}
			System.out.println("게시물 가져오기 성공");
		} catch (Exception e) {
			System.out.println("게시물 가져오기 오류");
			e.printStackTrace();
		}
		return guest;
	}
}
