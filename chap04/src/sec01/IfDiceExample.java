package sec01;

import java.util.Scanner;

public class IfDiceExample {

	public static void main(String[] args) {
		// (Math.random() * ����) + �ʱⰪ;

		Scanner s = new Scanner(System.in);
		int num = (int) (Math.random() * 6) + 1;
		int num2 = s.nextInt();

		if (num == num2) {
			System.out.println("�� ���� ��ġ�մϴ�.");
		} else if (num > num2) {
			System.out.println("��ǻ�� ���ڰ� �� Ů�ϴ�.");

		} else if (num < num2) {
			System.out.println("����� ���ڰ� �� Ů�ϴ�.");
		}

	}

}
