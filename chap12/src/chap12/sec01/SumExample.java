package chap12;

public class SumExample {

	public static void main(String[] args) {

		// 1부터 10까지 홀수만 출력
		Sum sum = new Sum();
		Thread thread = new Thread(sum);
		thread.start();
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i);
			}

			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

		// 1부터 10까지 짝수만 출력

	}

}
