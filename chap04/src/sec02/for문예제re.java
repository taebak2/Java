package sec02;

import java.util.Scanner;
// 연습 필요... 
public class for문예제re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int num1 = s.nextInt();
		int large = 0;
		int small = 0;
		int sum = 0;
		if (num > num1) {
			large = num;
			small = num1;
			for (int i = small; i < large + 1; i++) {
				sum += i;
				if (i == large) {
					System.out.print(i + "=" + sum);
				}
			}
		} else {
			for (int i = large; i < small + 1; i++) {
				sum += i;
				if (i == small) {
					System.out.print(i + "=" + sum);
				}

			}
		}
	}

}
