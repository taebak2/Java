package sec02;

import java.util.Scanner;

public class �հ� {
	// �ǵ����� �ݴ� ctrl+Y
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		for (int i = 1; i < num + 1; i++) { // i�� �ʱⰪ�� 1, i�� num+1 ���� �۴ٸ�, i�� 1�� �����ش�.
			sum += i; // sum�� i�� �����ش�. (i�� 1���� 2,3,4,5,....)

		}
		System.out.println(sum);
	}

}
