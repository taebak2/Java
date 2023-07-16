package sec01;

import java.util.Scanner;

public class If연습3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int drink = s.nextInt();
		int price = drink * 7000;

		if (drink < 8) {
			System.out.println("상품수량: " + drink);
			System.out.println("가격은 " + price + " 원 입니다.");
		} else {
			Double salePrice = (int) price * 0.9;

			System.out.println("상품수량: " + drink);
			System.out.println("가격은 " + salePrice + " 원 입니다.");
		}
	}

}
