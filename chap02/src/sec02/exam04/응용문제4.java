package sec02.exam04;

import java.util.Scanner;

public class ���빮��4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = s.next(); // �̸�
		System.out.println("���̸� �Է��ϼ���");
		int age = s.nextInt(); // ����

		System.out.print(name + "����");
		if (age < 20) {
			System.out.println(" û���Դϴ�.");

		} else {
			System.out.println(" ����Դϴ�.");
		}
	}
}
