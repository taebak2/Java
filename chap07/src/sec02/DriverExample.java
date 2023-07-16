package sec02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.run(); 
		
		
		//driver.drive(); //drive 메소드는 매개변수가 있어야한다.(driver의 메소드인 drive가 클래스 타입의 메소드이기 때문에) 
		driver.drive(bus);
		driver.drive(taxi);

		Vehicle vehicle = bus; 
		
		vehicle.run(); 

	}

}
