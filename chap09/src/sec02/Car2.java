package sec02;

public class Car2 {
	// �ʵ尪���� �͸� ��ü�� ����
	// car �޼ҵ� �������̵� �ϰ�
	// speedUp(int speed) �޼ҵ� �����
	Car car = new Car() {
		int speed;

		@Override
		void stop() {
			speedUp(50);
			System.out.println("�ڵ����� ����ϴ�.");

		}

		void speedUp(int speed) {
			this.speed = speed;
			System.out.println("�ӵ��� " + speed + "��ŭ �����մϴ�.");

		}

	};

	// ���� �͸� ��ü ����
	void speedDown() {
		Car downCar = new Car() {

			void speedDown() {
				System.out.println("�ӵ��� �����߽��ϴ�.");
			}

			@Override
			void stop() {
				speedDown();
			}

		};
		// speedDown() �޼ҵ带 ȣ���ϸ� �͸� ��ü����
		// �޼ҵ�(void speedDown, stop)�� �ڵ����� ������� �ʱ� ������(?) downCar.stop�� ȣ��������Ѵ�.
		downCar.stop();
	}
}
