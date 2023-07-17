package sec03;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
//생성자 만들 시 public입력 안해도 상관없음~~
	
	 Board(String title, String content) { // 생성자 변수개수와 this 값 개수를 일치실 필요는 없다.. (알아서 그 개수에 맞는 데이터값을 찾아간다~)
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
