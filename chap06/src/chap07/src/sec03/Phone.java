package sec03;

//추상 클래스
public abstract class Phone {
	public String owner; // 소유자 필드

	public Phone(String owner) { // 생성자
		this.owner = owner;
	}

	// 리턴 X, 매개변수 X, 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	// 리턴 X, 매개변수 X, 메소드
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
