package sec01;

public class MyClass {
	// 필드
	RemoteControl rc = new Television();

	// 디폴트 생성자
	// 디폴트 생성자 호출시 Television에서 구현된 메소드 호출
	MyClass() {
	}

	// 인터페이스를 매개변수로 하는 생성자
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn(); // Television에서 구현된 turnOn 호출
		rc.turnOff(); // Television에서 구현된 turnOff 호출
		rc.setVolume(5); // Television에서 구현된 setVolume 호출
		rc.turnOff(); // Television에서 구현된 turnOff 호출
	}

	// Audio 객체의 메소드 호출
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOff();
		rc.setVolume(5);
		rc.turnOn();
	}

	// 매개변수 객체의 메소드 호출
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
