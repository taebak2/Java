package sec04;

public class CarExample {

	public static void main(String[] args) {
//�õ��ɱ�, �ӵ�����2��, �ӵ�����1��, ����,����
		Car car = new Car();
		car.powerOn();
		int result1 = car.speedUp(30);
		System.out.println("���� �ӵ��� : " + result1 + "�Դϴ�.");
		int result2 = car.speedUp(20);
		System.out.println("���� �ӵ��� : " + result2 + "�Դϴ�.");
		int result3 = car.speedDown(70);
		System.out.println("���� �ӵ��� : " + result3 + "�Դϴ�.");
		int result4 = car.breakZero();
		System.out.println("���� �ӵ��� : " + result4 + "�Դϴ�.");
		car.powerOff();
		
		
	}
}

