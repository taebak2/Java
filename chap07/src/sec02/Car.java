package sec02;

public class Car {

	// 객체 타입의 필드
	Tire frontLeftTire = new Tire(6, "앞 왼쪽");
	Tire frontRightTire = new Tire(3, "앞 오른쪽");
	Tire backLeftTire = new Tire(4, "뒤 왼쪽");
	Tire backRightTire = new Tire(5, "뒤 오른쪽");

	// 메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		} else {return 0;}
	} // ???

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
