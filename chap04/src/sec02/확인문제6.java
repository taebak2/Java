package sec02;

public class 확인문제6 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
