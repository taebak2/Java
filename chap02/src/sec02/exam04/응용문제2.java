package sec02.exam04;

import java.util.Scanner;

public class ���빮��2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // ctrl + shift + o
		System.out.println("�� �� ���ڸ� �Է��ϼ���.");
		System.out.println("ù ��° ���ڴ� �����ΰ���?");
		int a = s.nextInt();
		System.out.println("�� ��° ���ڴ� �����ΰ���?");
		int b = s.nextInt();

		int div = a / b; // * a�� b�� ���� ���� �˷��ִ� �Լ� */

		System.out.println("�Է��Ͻ� �� ���� ���� ����� : " + div + "�Դϴ�.");

	}

}
