package sec02;

import java.util.Scanner;

public class 합계 {
	// 되돌리기 반대 ctrl+Y
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		for (int i = 1; i < num + 1; i++) { // i의 초기값은 1, i가 num+1 보다 작다면, i는 1씩 더해준다.
			sum += i; // sum에 i를 더해준다. (i는 1부터 2,3,4,5,....)

		}
		System.out.println(sum);
	}

}
