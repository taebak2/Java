package sec02;

import java.util.Scanner;

// ���� �ʿ�... 
public class for������3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 1; i <= 9; i++) {
			int sum = num * i;
			System.out.println(num + " * " + i + " = " + sum);
		}
	}

}
