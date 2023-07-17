package sec01.exam01;

public class SportCar implements Car {
	private int speed;

	public void speedUp(int speed) {
		if (speed > Car.MAX_SPEED) {
			this.speed = MAX_SPEED;
		} else {
			this.speed = speed;
		}
		System.out.println("������ī�� ���� �ӵ��� : " + speed);
	}

	public void speedDown(int speed) {
		if (speed < Car.MIN_SPEED) {
			this.speed = MIN_SPEED;
		} else {
			this.speed = speed;
		}
		System.out.println("������ī�� ���� �ӵ��� : " + speed);
	}
}
