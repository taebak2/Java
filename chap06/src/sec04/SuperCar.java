package sec04;

public class SuperCar {
	int speed;

	int getSpeed() {		// ���� �ӵ��� ���Ͻ�Ű�� �޼ҵ�
		return speed;
	}

	void keyTurnOn() {		// �õ��Ŵ� �޼ҵ� ���� X
		System.out.println("Ű�� �����ϴ�.");
	}

	void run() { // 0���� 50���� 10�� ����, 6�� �ݺ��Ͽ� ���� �ӵ� ���, ����x
		for (int i = 0; i <= 50; i += 10) {
			speed = i;
			System.out.println("�޸��ϴ�(�ü�:" + speed + "km/h)");
		}
	}
}
