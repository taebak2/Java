package sec02;

import java.util.Scanner;

public class ���ǹ�1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		if (a >= 80) {
			System.out.println("a�� ���� : " + a);
			System.out.println("a�� 80�̻��Դϴ�");
		} else {
			System.out.println("a�� ���� : " + a);
			System.out.println("a�� 80�̸��Դϴ�");

		}
	}
}
