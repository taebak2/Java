package sec02;

public class 확인문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i]; // max 최대값 구하는방법
			}
		}
		System.out.println("최대값 : " + max);

	}

}
