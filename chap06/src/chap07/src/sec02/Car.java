package sec02;

public class Car {

	// ��ü Ÿ���� �ʵ�
	Tire frontLeftTire = new Tire(6, "�� ����");
	Tire frontRightTire = new Tire(3, "�� ������");
	Tire backLeftTire = new Tire(4, "�� ����");
	Tire backRightTire = new Tire(5, "�� ������");

	// �޼ҵ�
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		} else {return 0;}
	} // ???

	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
