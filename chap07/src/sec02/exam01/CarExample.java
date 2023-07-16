package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Truck truck = new Truck("흰색","벤츠",3,"중");
		
		Car car = truck; // 자동 타입 변환, Car car = new Truck("흰색","벤츠",3,"중");
		
		car.speedUp(30); // 부모 메소드 호출
		// car.maxSpeed(50);
		
		truck.speedUp(30);
		// speedup은 Car 메소드이지만, truck이 현재 타입 변환을 해서 truck에서도 사용 가능 
		// 타입이 변환되었기 때문에 자식 메소드 호출 불가능
		
		car.start();
		//자식 메소드이지만 오바리이딩했기 때문에 호출 가능
	}

}
