package sec03;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;

	public Car() {} 
	// �⺻ ������
	// �����ڰ� �ϳ� �����Ƿ� ��ǻ�Ͱ� �ڵ����� ������ ����
	// Student ���� vs Car ��
	
	public Car(String model, int speed, String company) { 
														// �𵨸�� �ӵ��� ���� ������ ����
														// model��speed�� String, int�� ��������Ѵ�.
		this.model = model; 							// this = ���� �� Ŭ������ �ִ� �������(5���� String model;)�̸�, model�� ��ü  
		this.speed = speed;
		this.company = company;
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
