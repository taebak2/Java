package sec03.exam03;

import java.util.Scanner;

public class ��������ϱ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int a = s.nextInt();

		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int b = s.nextInt();

		System.out.println("�����ȣ�� �Է��ϼ���(*,/)");
		String c = s.next();
		char d = c.charAt(0);
		 												// if (c.compareTo("*") == 0) c�� ���ڿ� * �� ����. char ��ȯ�� ���� �ʰ� String���θ� ����ϴ� ���
		if (d == '*'){                                  // if (c.equals("*") )   
			int e = a * b;
			System.out.println("�Է��Ͻ� ������ ����� " + e + "�Դϴ�.");
		} else {
			double f = (double) a / b;
			System.out.println("�Է��Ͻ� ������ �����" + f + "�Դϴ�.");
		}

	}

}
