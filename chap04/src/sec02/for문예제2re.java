package sec02;

import java.util.Scanner;

// ���� �ʿ�... 
public class for������2re {

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
