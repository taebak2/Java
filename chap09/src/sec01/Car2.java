package sec01;

public class Car2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car.OldCar oldcar = car.new OldCar(); // CarŬ���� �ܺ�����
		oldcar.speedUp(50);
		System.out.println(oldcar.speed);
	}
}
