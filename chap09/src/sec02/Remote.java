package sec02;

public class Remote {

	// �͸� ���� ��ü ����
	RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};

}
