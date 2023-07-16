package sec02;

public class 중첩¸for예제2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
