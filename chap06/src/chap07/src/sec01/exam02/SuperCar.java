package sec01.exam02;

public class SuperCar extends Car {
	int maxSpeed;
	String engine;
	public SuperCar(String model, String company, int maxSpeed) {
		super(model, company); // �θ� class�� ������ ������൵�ȴ�..
		this.maxSpeed = maxSpeed;
	}
}
