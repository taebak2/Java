package chap12;

public class CarExmaple {

	public static void main(String[] args) {

		Runnable car = new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println("���� ����մϴ�.");
					Thread.sleep(500);
				} catch (Exception e) {
				}
				int speed = 0;
				for (int i = 0; i < 4; i++) {
					speed += 50;

					System.out.println("���� �ӵ� : " + speed);
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
				System.out.println("���� ����ϴ�.");

			}
		};
		Thread thread = new Thread(car);
		thread.start();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		for (int i = 0; i < 4; i++) {

			System.out.print("�ӵ��� �ø��ϴ�.");
			try {
				Thread.sleep(500);

			} catch (Exception e) {
			}
		}
	}

}
