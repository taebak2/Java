package fileupload;

import common.JDBConnect;

public class MyfileDAO extends JDBConnect{
	
	public MyfileDAO() {
		super();
	}
	
	public int insertFile(MyfileDTO dto) {
		int applyResult=0;
		
		try {
			String query = "insert into myfile values(seq_board_num.nextval, ?,?,?,?,?,default) ";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getCate());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getSfile());
			applyResult = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 insert 중 오류 발생");
		}
		
		return applyResult;
	}
}
