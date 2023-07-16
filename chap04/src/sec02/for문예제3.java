package sec02;

import java.util.Scanner;

// 연습 필요... 
public class for문예제3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 1; i <= 9; i++) {
			int sum = num * i;
			System.out.println(num + " * " + i + " = " + sum);
		}
	}

}
