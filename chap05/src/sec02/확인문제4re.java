package sec02;

import java.util.Scanner;

public class Ȯ�ι���4re {

	public static void main(String[] args) {

		// ����ڷκ��� �迭 ���� �Է¹�������, �迭 ������ŭ ���ڸ� �Է� �޾Ƽ� �迭�� �����ϼ���, �ش� �迭���� ���� ���� ���ڸ� ����ϼ���, ��
		// ���ڴ� ����� ����

		Scanner s = new Scanner(System.in);
		System.out.println("�迭 ������ �Է��ϼ���");
		int num[] = new int[s.nextInt()];
		for (int i = 0; i < num.length; i++) {
			System.out.println("���ڸ� �Է��ϼ���");
			num[i] = s.nextInt();
			int min = num[0];
			for (int j = 0; j < num.length; j++) {
				if (min > num[j]) {
					min = num[j];
				}

			}
			System.out.println("�ּҰ� : " + min);
		}
	}

}
