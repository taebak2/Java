package sec01;

import java.util.Scanner;

public class indexOfExample {

	public static void main(String[] args) {
		// String str1 = "���� �ڹٸ� ����մϴ�.";
		// int index = str1.indexOf("�ڵ�"); // indexOf ������ġ, ���� �ش� ���ڿ��� ���Ե��� ������
		// -1(=false) ���
		// System.out.println(index);

		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		String address = s.next();
		if (address.indexOf("����") != -1 || address.indexOf("�ξ�") != -1 || address.indexOf("���") != -1
				|| address.indexOf("���") != -1) {
			System.out.println("�ϱ� ���ֹ��Դϴ�.");
		} else {
			System.out.println("�ϱ� ���ֹ��� �ƴմϴ�.");
		}
	}

}
