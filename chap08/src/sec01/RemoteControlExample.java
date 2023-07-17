package sec01;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc; // 인터페이스 변수 선언 new안됩니다.
		rc = new Television(); // 변수에 객체 대입
		rc = new Audio(); // 변수에 객체 대입

	}

}
