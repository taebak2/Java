package sec02.practice;

public class AirControl extends RemoteControl {
	int temperature;
	int power; // (1�� ���ϰ� 2�� ���� 3�� ��ǳ)

	@Override
	void powerOn() {
		System.out.println("�������� ŵ�ϴ�.");
	}

	@Override
	void powerOff() {
		System.out.println("�������� ���ϴ�.");
	}

	void power() {
		if (power == 1) {
			System.out.println("��ǳ");
		} else if (power == 2) {
			System.out.println("����");
		} else {
			System.out.println("��ǳ");
		}
	}

	void temperature() {
		System.out.println(temperature + " ���Դϴ�.");
	}

}
