package sec02;

import java.util.Scanner;

public class Ȯ�ι���9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���");
		String num = s.next();
		System.out.println("�� ��° ���� �Է��ϼ���");
		String num1 = s.next();

		double a = Double.parseDouble(num);
		double b = Double.parseDouble(num1);
		double result =  a / b;
		if (b == 0 | b == 0.0) {

			System.out.println("���: " + "���Ѵ�");
		} else {
			System.out.println("���: " + result);
		}

	}

}
