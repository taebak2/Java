package sec01;

import java.util.Scanner;

public class indexOfExample1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		String ad = s.nextLine();
		ad = ad.replace("����", "���ֱ�����");
		System.out.println(ad);
		ad = ad.replaceFirst("�ϱ�", "�ξϵ�"); // �ߺ��� ù ��° ���ڸ� ����
		System.out.println(ad);
	}

}
