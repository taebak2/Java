package sec03;

public class Dog extends Animal { // 추상(abstract) 메소드 sound를 구현시켜야한다. -> override 시켜야한다...

	public Dog() {
		this.kind = "포유류"; // Animal의 String kind 호출
	}

	/*
	 * public Dog(String kind) { this.kind = kind; }
	 */

	@Override
	public void sound() {
		System.out.println("강아지는 멍멍");

	}

}
