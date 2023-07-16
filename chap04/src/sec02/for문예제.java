package sec02;

import java.util.Scanner;

public class for 문 예제 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int num1 = s.nextInt();
		int sum = 0;
		int a = num1;
		if (num > num1) {
			for (int i = num1; i < num; i++) {
				sum += i;
				System.out.print(i + "+");
			}

			System.out.print(num + "=" + (sum + num));
		}

		else {
			for (int i = num; i < num1; i++) {
				sum += i;

				System.out.print(i + "+");
			}
		}
		System.out.println(num1 + "=" + (sum + num1));
	}

}
