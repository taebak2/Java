package sec01;

public class Car {
	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����
	String color; // ����

	Car() { // �⺻ ������
	}

	Car(String company, int cost) { // �Ű����� 2�� ������
		this.company = company;
		this.cost = cost;
	}

	void speedUp(int speed) { // �Ű����� 1�� ���� X �޼ҵ�
		this.speed += speed;
	}

	void OldSpeed() {
		// Car Ŭ���� ���ο����� OldCar ��ü �ٷ� ���� ������
		OldCar old = new OldCar(); // OldCar ��ü
		old.speed = 50;
	}

	class OldCar { // ��øŬ����
		int speed; // �ӵ�
		int cost; // ����

		void speedUp(int speed) {
			this.speed += speed;
		}
	}

	class Car2 {
		Car car = new Car("����", 300000);
		// car.speedUp(50);
		// car. OldSpeed();
		Car.OldCar old = car.new OldCar();
	}
}
