package chap12;

public class Sum implements Runnable {

	@Override
	public void run() { // 1���� 10���� ¦���� ���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
			}

			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}
