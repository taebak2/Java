package sec01;

public class Car4 {
	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����
	String color; // ����

	Car4() { // �⺻ ������
		System.out.println("Car ȣ��");

	}

	class OldCar { // ��øŬ���� (�ν��Ͻ� ��� Ŭ����) = �ν��Ͻ� �ʵ�� �޼ҵ常 ���� ����... ���� �ʵ�� �޼ҵ�� ���� �Ұ�..
					// ���� Ŭ�������� �ܺ� �ν��Ͻ� Ŭ���� ȣ�� �Ұ���...
					// ���� Ŭ������ �޼ҵ� �ȿ� �ִ� Ŭ����.. �޼ҵ� �ۿ��� ȣ�� �Ұ���...

		int speed; // �ӵ�
		int cost; // ����

		OldCar() {
			System.out.println("OldCar ȣ��");
		}

		void speedUp(int speed) { // ��ø Ŭ���� �ȿ� �޼ҵ�
			this.speed += speed;
		}

		void carCall() {
			// �ν��Ͻ� �޼ҵ忡�� �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� ������
			// company = "����";
			// stop();

			color = "����";
			stop2();
		}

	}

	void speedUp(int speed) { // �Ű����� 1�� ����X �޼ҵ�
		this.speed += speed;
	}

	void speedDown(int speed) { // �Ű����� 1�� ����X �޼ҵ�
		this.speed -= speed;
	}

	static class Truck {
		static int speed; // cost�� ���� ����??
		int cost;

		Truck() {
			System.out.println("Truck ȣ��");
		}

		void speedUp(int speed) {
			Truck.speed += speed;
		}
	}

	void stop() {
		System.out.println("Car ����");
	}

	void stop2() {
		System.out.println("Car ����");
	}
}
