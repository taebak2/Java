package sec02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.run(); 
		
		
		//driver.drive(); //drive �޼ҵ�� �Ű������� �־���Ѵ�.(driver�� �޼ҵ��� drive�� Ŭ���� Ÿ���� �޼ҵ��̱� ������) 
		driver.drive(bus);
		driver.drive(taxi);

		Vehicle vehicle = bus; 
		
		vehicle.run(); 

	}

}
