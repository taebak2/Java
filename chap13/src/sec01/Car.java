package sec01;

public class Car {
	String company; // 제조회사
	int cost; // 가격
	int maxSpeed; // 최고 속도
	String color; // 색상

	public Car(String company, int cost, int maxSpeed, String color) {
		this.company = company;
		this.cost = cost;
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
	public Car() {
		// TODO 자동 생성된 생성자 스텁
	}
}
