package sec02.exam01;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		vehicle.run(); // 오버라이드된 run 호출 가능 
		//vehicle.stop(); // 구현 객체 메소드 바로 호출 불가능
		
		Bus bus = (Bus) vehicle; // 구현 객체 타입으로 강제 변환 
		bus.stop(); // 구현 객체 메소드 호출 가능
		
		// Vehicle vehicle2 = new Vehicle(); // 인터페이스는 객체 생성 불가능(생성자가 없기 때문에)
		// Bus bus2 = (Bus)vehicle2;
		//bus2.run();
		//bus2.stop();
		

	}

}
