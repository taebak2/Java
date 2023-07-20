package sec02;

public class CarMain {

	public static void main(String[] args) {
		Car2 car2 = new Car2();
		
		car2.car.stop();
		// 익명 객체에서 오버라이드 된 stop만 호출 가능함
		car2.speedDown();
		
		
		
	}

}
