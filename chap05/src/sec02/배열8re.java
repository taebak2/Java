package sec02;

import java.util.Scanner;

public class �迭8re {

	public static void main(String[] args) {
		// �ζ� �� ������ �Ͻðڽ��ϱ�?
		// ����ڰ� �Է��� ���ڸ�ŭ �ζǹ�ȣ�� �������� ����ϼ���

		Scanner s = new Scanner(System.in);
		int[] lotto = new int[6];
		System.out.println("�ζ� �� ������ �Ͻðڽ��ϱ�?");
		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < lotto.length; j++) {
				lotto[j] = (int) (Math.random() * 45) + 1;
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
	}
}
