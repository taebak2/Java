package test;

import java.util.Scanner;

public class Ȯ�ι���1re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?"); // 83.67
		String name = s.next();
		System.out.println("�߰���� ������?"); // 83.67
		double mid = s.nextDouble();
		System.out.println("�⸻��� ������?");
		double last = s.nextDouble();
		System.out.println("����Ʈ ������?");
		double report = s.nextDouble();
		double result = ((mid + last + report) / 3);
		// printf ��� ȫ�浿���� ��� ������ : 73.25 �Դϴ�. 5f �Ҽ��� 2�ڸ�
		// System.out.printf(name + "���� ��� ������: %5.2f �Դϴ�", ((mid + last + report) / 3));
		System.out.printf("%s���� ��� ������ : %5.2f�Դϴ�", name, result);
	}

}
