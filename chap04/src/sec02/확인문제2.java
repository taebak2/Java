package sec02;

public class 확인문제2 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;   // continue;
			} 				// sum+=i;
		}
		System.out.println("1~100까지 3의 배수의 합계 : " + sum);
	}

}
