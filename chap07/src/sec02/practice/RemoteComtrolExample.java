package sec02.practice;

public class RemoteComtrolExample extends RemoteControl{

	public static void main(String[] args) {
		RemoteControl rc = new AirControl(); // 에어컨 리모컨(자식)을 리모컨(부모)에 종속
		rc.powerOn(); // 오버라이드된 메소드만 사용가능 + 오버라이드 메소드를 불러냄
		AirControl c = (AirControl)rc; // 자식 클래스를 다시 부모 클래스로 ...??
		

	}

}
