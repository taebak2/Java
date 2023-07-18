package sec01;

public class Car3 {
	String company; // 제조회사
	int speed; // 속도
	int cost; // 가격
	String color; // 색상

	Car3() { // 기본 생성자
	}

	Car3(String company, int cost) { // 매개변수 2개 생성자
		this.company = company;
		this.cost = cost;
	}

	void speedUp(int speed) { // 매개변수 1개 리턴 X 메소드
		this.speed += speed;
	}

	void OldSpeed() {
		// Car 클래스 내부에서는 OldCar 객체 바로 생성 가능함
		OldCar2 old = new OldCar2(); // OldCar 객체
		old.speed = 50;
	}

	public static class OldCar2 { // 중첩클래스
		int speed; // 속도
		int cost; // 가격

		void speedUp(int speed) {
			this.speed += speed;
		}
	}

	class Car4 {
		// 정적 클래스는 상위 클래스의 객체 생성하지 않고
		// 바로 객체 생성 가능함
		Car3.OldCar2 old = new Car3.OldCar2();
	}
}
