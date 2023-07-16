package sec01.exam02;

public class SuperCar extends Car {
	int maxSpeed;
	String engine;
	public SuperCar(String model, String company, int maxSpeed) {
		super(model, company); // 부모 class에 생성자 만들어줘도된다..
		this.maxSpeed = maxSpeed;
	}
}
