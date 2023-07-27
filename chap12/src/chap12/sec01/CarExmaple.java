package chap12;

public class CarExmaple {

	public static void main(String[] args) {

		Runnable car = new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println("차가 출발합니다.");
					Thread.sleep(500);
				} catch (Exception e) {
				}
				int speed = 0;
				for (int i = 0; i < 4; i++) {
					speed += 50;

					System.out.println("현재 속도 : " + speed);
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
				System.out.println("차가 멈춥니다.");

			}
		};
		Thread thread = new Thread(car);
		thread.start();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		for (int i = 0; i < 4; i++) {

			System.out.print("속도를 올립니다.");
			try {
				Thread.sleep(500);

			} catch (Exception e) {
			}
		}
	}

}
