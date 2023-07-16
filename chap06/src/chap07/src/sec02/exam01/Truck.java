package sec02.exam01;

public class Truck extends Car {
	int weight; // 적재 용량
	String trunkSize; // 트렁크 사이즈 예) 대, 중, 소
	int maxSpeed; // 최대 속도

	// 생성자 매개변수 4개(부모2개, 자기꺼 2개)
	public Truck(String color, String company,int weight, String trunkSize) {
		super(color, company);
		this.weight = weight; // this.weight 와 weight 둘 다 int weight; 만약 truck(파라미터값)에 int weight를 집어넣어주면 this.weight = int weight고 Truck(파라미터int weight)값 = weight이다. 
		this.trunkSize = trunkSize; // 파라미터값 + this trunk~ 안하면 생성자 자동으로 정의해주나?
	}
	
	// 매개변수 int 1개짜리 고유 메소드, 리턴 타입 X
	void maxSpeed(int maxSpeed){
		this.maxSpeed += maxSpeed;
	}

	@Override
	void start() {
		System.out.println("트럭이 출발했습니다.");
	}

	@Override
	void stop() {
		System.out.println("트럭을 멈춥니다.");
	}

}
