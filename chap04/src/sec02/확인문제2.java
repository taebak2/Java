package sec02;

public class Ȯ�ι���2 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;   // continue;
			} 				// sum+=i;
		}
		System.out.println("1~100���� 3�� ����� �հ� : " + sum);
	}

}
