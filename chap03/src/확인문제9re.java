package sec02;

import java.util.Scanner;

public class Ȯ�ι���9re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���");
		double num = Double.parseDouble(s.next());
		System.out.println("�� ��° ���� �Է��ϼ���");
		double num1 = Double.parseDouble(s.next());

		double result =  num / num1;
		if (num == 0.0) {

			System.out.println("���: " + "���Ѵ�");
		} else {
			System.out.println("���: " + result);
		}

	}

}
