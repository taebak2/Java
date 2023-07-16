package sec04;

public class 학생답안 {
//String gender depcode String int score 생성자 만들기 source 메소드void start, end로 호출  
	String gender;
	String depCode;
	int score;

	public 학생답안(String gender, String depCode, int score) { // 생성자 만들기
		this.gender = gender;
		this.depCode = depCode;
		this.score = score;
	}

	void start() {
		System.out.println("성별 : " + gender);
		System.out.println("학과코드 : " + depCode);
		System.out.println("시험성적 : " + score);
		String grade = end(score); // String end값에서 int가 77일때 처리~
		System.out.println("당신의 학점은 : " + grade);
	}

	String end(int x) { // 등급 String end에서 String이랑 ()값 안에 들어가는 변수 종류가 달라도 상관없음
		String result;
		if (x >= 90) { 
			result = "A";
		} else if (x >= 80) {
			result = "B";
		} else if (x >= 70) {
			result = "C";
		} else {
			result = "F";

		}
		return result;
	}
}
