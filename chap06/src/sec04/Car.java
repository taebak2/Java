package sec04;

public class Car {
	void powerOn() {
		System.out.println("시동이 걸렸습니다.");

	}

	void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
	}
	private int result =100;

	int speedUp(int x) { // 속도증가
		result+=x;
		return result;

	}

	int speedDown(int y) { // 속도감소
		result-=y;
		return result;
	}

	int breakZero() { // 멈춤 breakZero안에 매개변수 없어도 상관없음
		int result = 0;
		return result;
	}

}
