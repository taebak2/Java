package sec02;

import java.util.Scanner;

public class �ζǹ���2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int lotto[] = new int[6];
		int num = 0; // ��ȣ �ʱⰪ ����
		boolean[] check = new boolean[46];
		// ��ȣ�� ������ �Ǵ��ϴ� �迭 ����
		// 1~45�� �ʿ������� �迭�� 0���� �����ϹǷ� �� 46�� ����

		for (int i = 0; i < lotto.length; i++) {
			num = (int) (Math.random() * 45) + 1;

			// boolean�� �ʱⰪ false�� �Ǿ� ����
			// ���� ���� �ڸ��� ���� ���� ������ �ش� ���� ����
			// �ش� �ڸ� ���� true�� ����

			if (check[num] == false) {
				lotto[i] = num;
				check[num] = true;
			} else {
				i--; // �Ȱ��� ���ڰ� ���� �� ���� i�� 1�� ����������, 1�� �M���ν� �ٽ� ������.
			}
		}

		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j] + " ");

		}

	}
}
