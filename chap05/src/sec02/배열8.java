package sec02;

import java.util.Scanner;

public class �迭8 {

	public static void main(String[] args) {
		// �ζ� �� ������ �Ͻðڽ��ϱ�?
		// ����ڰ� �Է��� ���ڸ�ŭ �ζǹ�ȣ�� �������� ����ϼ���

		Scanner s = new Scanner(System.in);
		int[] lotto = new int[6];
		System.out.println("�ζ� �� ������ �Ͻðڽ��ϱ�?");
		int game = s.nextInt();
		int count;
		for (int i = 0; i < game * (lotto.length); i++) {
			count = (int) (Math.random() * 45) + 1;
			if (i%6 ==0) {
				System.out.println();
			}
			System.out.print(count + " ");

		}
	}
}
