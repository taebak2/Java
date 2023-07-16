package sec03;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
//생성자 만들 시 public입력 안해도 상관없음(어지간하면 셋팅값 ex)Board(){} 설정해놓는게 편함)
	
	 Board(String title, String content) {
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
	}

	 Board(String title, String content, String writer) {
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}

	Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);

	}

	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

}
