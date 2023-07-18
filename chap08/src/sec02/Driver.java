package sec02;

import sec02.exam01.Bus;
import sec02.exam01.Vehicle;

public class Driver {

	public void drive(Vehicle vehicle) {
		vehicle.run();
		//vehicle.stop();
	}
	// 매개변수가 인터페이스 객체인 메소드

	public static void main(String[] args) {
		Driver driver = new Driver();
		// Driver 객체 생성
		Bus bus = new Bus(); // Bus 객체 생성
		Taxi taxi = new Taxi(); // Taxi 객체 생성
		
		driver.drive(bus); // bus 객체를 매개변수로 넘겨주면
						   // bus는 Vehicle 인터페이스의 구현 객체이므로
						   // Vehicle 타입으로 자동 형변환됨
		
						   // driver.stop(); 오류발생
						   // bus는 Vehicle 타입으로 자동 변환되어
		 				   // 오버라이드된 run은 사용가능하지만, stop은 불가능 
	}

}
