package sec01;

public class Car4 {
	String company; // 제조회사
	int speed; // 속도
	int cost; // 가격
	String color; // 색상

	Car4() { // 기본 생성자
		System.out.println("Car 호출");

	}

	class OldCar { // 중첩클래스 (인스턴스 멤버 클래스) = 인스턴스 필드와 메소드만 선언 가능... 정적 필드와 메소드는 선언 불가..
					// 정적 클래스에서 외부 인스턴스 클래스 호출 불가능...
					// 로컬 클래스는 메소드 안에 있는 클래스.. 메소드 밖에서 호출 불가능...

		int speed; // 속도
		int cost; // 가격

		OldCar() {
			System.out.println("OldCar 호출");
		}

		void speedUp(int speed) { // 중첩 클래스 안에 메소드
			this.speed += speed;
		}

		void carCall() {
			// 인스턴스 메소드에서 바깥 클래스의 필드와 메소드 접근 가능함
			// company = "현대";
			// stop();

			color = "빨강";
			stop2();
		}

	}

	void speedUp(int speed) { // 매개변수 1개 리턴X 메소드
		this.speed += speed;
	}

	void speedDown(int speed) { // 매개변수 1개 리턴X 메소드
		this.speed -= speed;
	}

	static class Truck {
		static int speed; // cost랑 무슨 차이??
		int cost;

		Truck() {
			System.out.println("Truck 호출");
		}

		void speedUp(int speed) {
			Truck.speed += speed;
		}
	}

	void stop() {
		System.out.println("Car 멈춤");
	}

	void stop2() {
		System.out.println("Car 멈춤");
	}
}
