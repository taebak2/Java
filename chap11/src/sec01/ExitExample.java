package sec01;

public class ExitExample {

	public static void main(String[] args) {
		// 1���� 100���� ¦���� ��� ���� ���ڰ� 50�� ���´ٸ� ����
		// 50�� ���ͼ� �����߽��ϴ�. ���

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
			if (i == 50) {
				System.out.println("50�� ���ͼ� �����߽��ϴ�.");
				System.exit(555);
			}

		}
	}

}
