package sec01;

import java.util.Scanner;

public class If����3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int drink = s.nextInt();
		int price = drink * 7000;

		if (drink < 8) {
			System.out.println("��ǰ����: " + drink);
			System.out.println("������ " + price + " �� �Դϴ�.");
		} else {
			Double salePrice = (int) price * 0.9;

			System.out.println("��ǰ����: " + drink);
			System.out.println("������ " + salePrice + " �� �Դϴ�.");
		}
	}

}
