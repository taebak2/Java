package sec02;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	// Tire �������̽��� �ڵ� ��ȯ �Ǿ�����
	// �������̵�� roll �޼ҵ�� ������ �Ѿ
	// �������̽� Ÿ���� �ʵ� 
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	public static void main(String[]args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire(); // �ʵ��� ������
		myCar.run();
	}

}
