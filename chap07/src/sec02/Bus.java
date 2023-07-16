package sec02;

public class Bus extends Vehicle {

	//vehicle(부모 클래스) 메소드 run 오버라이드
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
