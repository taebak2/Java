package sec02;

public class RemoteMain {

	public static void main(String[] args) {
		Remote rm = new Remote(); 
		rm.rc.turnOn(); // Remote 클래스 안의 익명 구현 객체 rc를 부름

	}

}
