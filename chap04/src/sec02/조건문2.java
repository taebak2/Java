package sec02;

import java.util.Scanner;

public class ���ǹ�2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1~3�� �ϳ��� �Է��ϼ���");
		int a = s.nextInt();

		switch (a) {
		case 1:
		case 4:
			System.out.println("����� �μ��� �λ���Դϴ�");
			break;
		case 2:
		case 5:
			System.out.println("����� �μ��� ��ȹ���Դϴ�");
			break;
		default:
			System.out.println("����� �μ��� �ѹ����Դϴ�");
		}

	}
}
