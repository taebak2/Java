package sec02;

import java.util.Scanner;

public class �����ӱ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ٷνð��� �Է��ϼ���");
		int fee = s.nextInt();
		System.out.println("1�ð��� 9620�� �Դϴ�");
		double result = (fee >= 10) ? 1.2 * 9260 * fee : fee * 9260;
		System.out.println("�� �ӱ��� " + (int) result + "�� �Դϴ�.");

	}

}
