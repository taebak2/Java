package sec03;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;

	public Car() {} 
	// 기본 생성자
	// 생성자가 하나 있으므로 컴퓨터가 자동으로 만들지 않음
	// Student 예제 vs Car 비교
	
	public Car(String model, int speed, String company) { 
														// 모델명과 속도가 들어가는 생성자 만듬
														// model과speed는 String, int라서 맞춰줘야한다.
		this.model = model; 							// this = 현재 이 클래스에 있는 멤버변수(5번줄 String model;)이름, model은 객체  
		this.speed = speed;
		this.company = company;
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
