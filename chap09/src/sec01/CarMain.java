package sec01;

public class CarMain {

	public static void main(String[] args) {
		Car4 car = new Car4();
		Car4.OldCar oldcar = car.new OldCar(); // ��ø Ŭ���� �ν��Ͻ� �ʵ� ��ü ���� ��� : A.B b = a.new B(); 
		car.cost=5000;
		car.speedUp(30);
		oldcar.cost=3000;
		oldcar.speedUp(50);
		oldcar.carCall();
		System.out.println(car.cost);
		System.out.println(car.speed);
		
		Car4.Truck truck = new Car4.Truck(); // ��ø Ŭ���� ���� �ʵ� ��ü ���� ��� : A.C c = new A.C(); 
		truck.cost=10000;
		truck.speedUp(50);
		System.out.println(truck.cost);
		System.out.println(truck.speed); // static�� ���� ������ ���� Truck.speed
	
	}

}
