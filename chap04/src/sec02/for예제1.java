package sec02;

public class for예제1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
			}
			sum += i;
		}
		System.out.println("1~100까지의 3의 배수의 합 : " + sum);
	}
}
