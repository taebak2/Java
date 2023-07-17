package sec04;

public class 계산기 {
	void powerOn() { // 메소드
		System.out.println("전원을 켭니다.");
	}

	void powerOff() { // 메소드
		System.out.println("전원을 끕니다.");
	}

	int plus(int x, int y) { // void가 없으면 return값을 반드시 받아줘야해~
		int result = x + y;
		return result;
	}

	int minus(int x, int y) { // 메소드 안에서 if문 사용 가능 
		int result; // if문 안에서 int result로 선언 시 return값을 받을 수 없다.. 그래서 초기에 선언을 한다~
		if (x < y) {
			result = y - x;

		} else {
			result = x - y;
		}

		return result;
	}

	// x나 y가 0이면 "0은 입력할 수 없습니다. 라고 나오게 출력 아니면 정상출력
	// 파라미터는 클래스와 변수 달라도 상관없음 ex) String mul ( int x, int y)
	String mul(int x, int y) {
		if (x == 0 || y == 0) {
			String message = "0은 입력할 수 없습니다.";
			return message;
		} else {
			int result = x * y;
			return String.valueOf(result);
		}

	}

	double div(int x, int y) {
		double result = (double)x / y;
		return result;
	}

}
