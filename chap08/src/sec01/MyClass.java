package sec01;

public class MyClass {
	// �ʵ�
	RemoteControl rc = new Television();

	// ����Ʈ ������
	// ����Ʈ ������ ȣ��� Television���� ������ �޼ҵ� ȣ��
	MyClass() {
	}

	// �������̽��� �Ű������� �ϴ� ������
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn(); // Television���� ������ turnOn ȣ��
		rc.turnOff(); // Television���� ������ turnOn ȣ��
		rc.setVolume(5); // Television���� ������ setVolume ȣ��
		rc.turnOff(); // Television���� ������ turnOff ȣ��
	}

	// Audio ��ü�� �޼ҵ� ȣ��
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOff();
		rc.setVolume(5);
		rc.turnOn();
	}

	// �Ű����� ��ü�� �޼ҵ� ȣ��
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
