package sec01;

import java.util.Scanner;

public class If����2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
// ����Ŀ�� alt + shift + a 
		System.out.println("���ڸ� �Է��ϼ���");
		int num = s.nextInt();
		int num1 = s.nextInt();
		int num2 = s.nextInt();

		if (num > 6 && num1 > 6 && num2 > 6 && num + num1 + num2 >= 30) {
			System.out.println("���� :" + num);
			System.out.println("���� :" + num1);
			System.out.println("���� :" + num2);
			System.out.println("�հ��Դϴ�!");

		} else {
			System.out.println("���� :" + num);
			System.out.println("���� :" + num1);
			System.out.println("���� :" + num2);
			System.out.println("���հ��Դϴ�!");
		}

		System.out.println("���ڸ� �Է��ϼ���");
		int korea = s.nextInt();
		int math = s.nextInt();
		int english = s.nextInt();

		int sum = korea + math + english;

		if (korea <= 6 || math <= 6 || english <= 6 || sum < 30) {
			System.out.println("���հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}

	}

}
