package sec02.practice;

public class AirControl extends RemoteControl {
	int temperature;
	int power; // (1은 약하게 2는 보통 3은 강풍)

	@Override
	void powerOn() {
		System.out.println("에어컨을 킵니다.");
	}

	@Override
	void powerOff() {
		System.out.println("에어컨을 끕니다.");
	}

	void power() {
		if (power == 1) {
			System.out.println("미풍");
		} else if (power == 2) {
			System.out.println("보통");
		} else {
			System.out.println("강풍");
		}
	}

	void temperature() {
		System.out.println(temperature + " 도입니다.");
	}

}
