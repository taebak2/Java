package sec01;

public interface RemoteControl {
	// public int s = 3;
	// 인터페이스 필드 올바른 사용 방법이 아님
	// 인터페이스 필드는 상수 필드만 사용 가능하므로
	// 필드 이름을 대문자로 쓰는 것이 관례
	// 인터페이스 상수는 반드시 선언과 동시에 초기값을 지정해줘야 한다.
	// public String NAME;
	// 인터페이스 상수 필드는 모두 public static final의 특성을 갖는다.(컴파일 과정에서 자동으로 붙는다.)
	// 인터페이스에 선언된 추상 메소드는 모두 public abstract의 특성을 갖는다. (컴파일 과정에서 자동으로 붙는다.)

	public int MIN_VOLUME = 0; 
	public int MAX_VOLUME = 10;
	public String NAME = "홍길동";

	void turnOn();

	void turnOff();

	public void setVolume(int volume);
	// 인터페이스 메소드는 추상 메소드로 구현함
}
