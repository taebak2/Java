package sec01;

public class CarMain {

	public static void main(String[] args) {
		Car4 car = new Car4();
		Car4.OldCar oldcar = car.new OldCar(); // 중첩 클래스 인스턴스 필드 객체 생성 방법 : A.B b = a.new B(); 
		car.cost=5000;
		car.speedUp(30);
		oldcar.cost=3000;
		oldcar.speedUp(50);
		oldcar.carCall();
		System.out.println(car.cost);
		System.out.println(car.speed);
		
		Car4.Truck truck = new Car4.Truck(); // 중첩 클래스 정적 필드 객체 생성 방법 : A.C c = new A.C(); 
		truck.cost=10000;
		truck.speedUp(50);
		System.out.println(truck.cost);
		System.out.println(truck.speed); // static은 직접 접근이 가능 Truck.speed
	
	}

}
