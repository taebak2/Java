package sec02;

public class 배열2 {

	public static void main(String[] args) {
		/*
		 * int[] a; // 배열 생성1 int b[]; // 배열 생성2 String c[];
		 */
		// 배열 선언문

		int d[] = { 52, 87, 94, 77, 69 }; // 배열 선언 및 대입
		double sum = 0;
		// 배열의 전체 합계와 평균을 구하세요
		// 평균의 double 타입으로
		// for
		for (int i = 0; i < 5; i++) {
			sum += d[i];
		}
		System.out.println("평균은 " + (double) (sum / 5) + " 입니다");

		int[] t;
		// {1,2,3}; // 컴파일 에러 발생

		int[] s = null;
		s = new int[] { 1, 2, 3 }; // 배열[]은 참조타입이기 때문에 new 입력해줘야함
		int[] k = new int[] { 1, 2, 3 };
		int[] q = { 1, 2, 3 };

	}

}
