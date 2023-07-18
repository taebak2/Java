package sec01;

public class Car2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car.OldCar oldcar = car.new OldCar(); // Car클래스 외부 접근
		oldcar.speedUp(50);
		System.out.println(oldcar.speed);
	}
}
