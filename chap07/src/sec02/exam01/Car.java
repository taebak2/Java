package sec02.exam01;

public class Car {
	String color; // 자동차 색상
	String company; // 제조 회사
	int speed; // 속도
	int cost; // 가격
	
	
	//매개변수 2개인 생성자, 기본 생성자 X
	public Car(String color, String company) {
		this.color = color;
		this.company = company;
	}

	
	// 매개변수 1개짜리 메소드, 리턴 타입 X
	void speedUp(int speed) {
		this.speed += speed; 		// ex) void speedUp(int x) {speed += x;}
	}
	
	// 매개변수 1개짜리 메소드, 리턴 타입 X
	void speedDown(int speed) {
		this.speed -= speed;
	}
	
	// 매개변수 X, 리턴 타입 X
	void start() {
		System.out.println("시동을 걸었습니다.");
	}
	
	// 매개변수 X, 리턴 타입 X
	void stop() {
		System.out.println("차를 멈춥니다.");
	}
	
}
