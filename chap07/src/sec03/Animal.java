package sec03;

public abstract class Animal { // 추상 클래스
	public String kind; // 종류

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound(); // 추상 메소드
}
