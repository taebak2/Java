package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л� ����?");
		int student = s.nextInt();
		System.out.println("���� ������?");
		int pencil = s.nextInt();

		int result = pencil / student;
		int result1 = pencil % student;
		// System.out.println("�л� �� ��� " + result + "���� ������ �������� " + result1 + "���� ���ƿ�");

		// ���2
		System.out.printf("�л� �� ��� %d ���� ������ �������� %d ���� ���ƿ�", result, result1);
	}

}
