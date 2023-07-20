package sec02;

public class Car2 {
	// 필드값으로 익명 객체를 대입
	// car 메소드 오버라이드 하고
	// speedUp(int speed) 메소드 만들기
	Car car = new Car() {
		int speed;

		@Override
		void stop() {
			speedUp(50);
			System.out.println("자동차가 멈춥니다.");

		}

		void speedUp(int speed) {
			this.speed = speed;
			System.out.println("속도가 " + speed + "만큼 증가합니다.");

		}

	};

	// 로컬 익명 개체 대입
	void speedDown() {
		Car downCar = new Car() {

			void speedDown() {
				System.out.println("속도가 감소했습니다.");
			}

			@Override
			void stop() {
				speedDown();
			}

		};
		// speedDown() 메소드를 호출하면 익명 개체안의
		// 메소드(void speedDown, stop)가 자동으로 실행되지 않기 때문에(?) downCar.stop을 호출해줘야한다.
		downCar.stop();
	}
}
