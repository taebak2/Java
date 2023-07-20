package sec02;

public interface RemoteControl {
	String COMPANY="삼성"; 
	int COST=5000;
	// 인터페이스 필드는 상수 필드를 사용해야함
	// 인터페이스 필드는 대문자 사용해야한다.
	
	public void turnOn();
	public void turnOff();
}
