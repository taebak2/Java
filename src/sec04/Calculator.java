package sec04;

public class Calculator {

	int plus(int x, int y) { // 합계 구하는 메소드
		int result = x + y;
		return result;
	}

	double avg(int x, int y) { // 평균 구하는 메소드
		double sum = plus(x, y); // 객체 내부에서 합계 메소드 호출
		double result = sum / 2;
		return result;

	}

	void excute() {
		double result = avg(7, 10);
		println("실행결과 : " + result); // 실행결과 가 문자이고 처음에 문자열이 와서 result값이 int에서 String으로 변환 즉 println값 전체가 String으로 바뀜 
										 // println!=System.out.println -> 메소드 println
	}

	void println(String message) { //excute의 println값이 String이라서 String으로 받아줌
		System.out.println(message);
		
	}
	

}
