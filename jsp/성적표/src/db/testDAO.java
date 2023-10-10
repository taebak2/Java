package db;

import java.util.ArrayList;
import java.util.List;

public class testDAO extends MysqlCon {

	public testDAO() {
		super();
	}

	public List<testDTO> selectAll() {
		List<testDTO> dtolist = new ArrayList<>();
		String sql = "select * from 시험";

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				testDTO dto = new testDTO();
				dto.setStudentId(rs.getString(1));
				dto.setKor(rs.getInt(2));
				dto.setEng(rs.getInt(3));
				dto.setMat(rs.getInt(4));
				dto.setPoint(rs.getString(5));
				dtolist.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("학생 정보 가져오기 실패");
		}
		return dtolist;
	}
	public List<testDTO> selectList(String a){
		List<testDTO> list = new ArrayList<testDTO>();
		String sql = "select * from 시험";
		if(a!=null) {
			sql += " where 학점='"+a+"'";	// a != null일때만 ?가 포함된 구문을 추가해주고 있기 때문에 
											// a == null일때 psmt.setString실행시 오류 발생 
		}
		
			try {
				stmt = con.createStatement();
				rs= stmt.executeQuery(sql);
			while(rs.next()) {
				testDTO dto = new testDTO();
				dto.setStudentId(rs.getString(1));
				dto.setKor(rs.getInt(2));
				dto.setEng(rs.getInt(3));
				dto.setMat(rs.getInt(4));
				list.add(dto);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류");
		}
		
		return list;
		
	}
}
