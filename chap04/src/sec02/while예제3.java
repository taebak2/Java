package sec02;

import java.util.Scanner;

public class while¿¹Á¦3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= num) {
			sum += i;
			i++;
		}
		System.out.print(sum);
	}

}
