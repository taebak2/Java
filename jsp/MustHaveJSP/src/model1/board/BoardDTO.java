package model1.board;

public class BoardDTO {
	private String num;
	private String title;
	private String content;
	private String id;
	private java.sql.Date postdate;	// import 하지 않기 위해서 사용 
	private int visitcount;
	
	public int getVisitcount() {
		return visitcount;
	}
	public void setVisitcount(int visitcount) {
		this.visitcount = visitcount;
	}
	private String name;
	
	// db의 board 테이블에 name이 없음
	// db의 member 테이블에 name이 있음
	// 다른 테이블의 컬럼을 설정하기 위한 것
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public java.sql.Date getPostdate() {
		return postdate;
	}
	public void setPostdate(java.sql.Date postdate) {
		this.postdate = postdate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
