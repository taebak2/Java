package sec04;

public class 학생 {
//String gender depcode String int score 생성자 만들기 source 메소드void start, end로 호출  
	String gender;
	String depCode;
	int score;

	public 학생(String gender, String depCode, int score) { // 생성자 만들기
		this.gender = gender;
		this.depCode = depCode;
		this.score = score;
	}
 // 생성자 한번에 만들어서 따로 넣을 필요없음...
	
	int score(int x) { // 시험성적
		int result = x;
		return result;
	}

	String depCode(String a) { // 학과
		String result = a;
		return result;
	}

	String gender(String b) { // 성별
		String result = b;
		return result;
	}

	void start() {
		int result = score(90);
		if (result >= 90) {
			end();
		}
		int result1 = score(80);
		if (result1 >= 80) {
			end();
		}
		int result2 = score(70);
		if (result2 >= 70) {
			end();
		} else {
			end();
		}

	}

	String end() { // 등급

		System.out.println("A");

		System.out.println("B");

		System.out.println("C");

		System.out.println("D");
		return end();
	}

}
