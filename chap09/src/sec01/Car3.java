package sec01;

public class Car3 {
	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����
	String color; // ����

	Car3() { // �⺻ ������
	}

	Car3(String company, int cost) { // �Ű����� 2�� ������
		this.company = company;
		this.cost = cost;
	}

	void speedUp(int speed) { // �Ű����� 1�� ���� X �޼ҵ�
		this.speed += speed;
	}

	void OldSpeed() {
		// Car Ŭ���� ���ο����� OldCar ��ü �ٷ� ���� ������
		OldCar2 old = new OldCar2(); // OldCar ��ü
		old.speed = 50;
	}

	public static class OldCar2 { // ��øŬ����
		int speed; // �ӵ�
		int cost; // ����

		void speedUp(int speed) {
			this.speed += speed;
		}
	}

	class Car4 {
		// ���� Ŭ������ ���� Ŭ������ ��ü �������� �ʰ�
		// �ٷ� ��ü ���� ������
		Car3.OldCar2 old = new Car3.OldCar2();
	}
}
