package sec02;

import java.util.Scanner;

// 연습 필요... 
public class for문예제2re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 4;
		int b = 0;
		for (int i = 1; i <= 9; i++) {
			b = a * i;
			System.out.println("4 * " + i + " = " + b);
		}
	}

}
