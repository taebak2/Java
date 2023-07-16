package sec02;

public class 확인문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3 };
		// int[] array2; array2= {1,2,3};
		int[] array3 = new int[3];
		int[] array4 = new int[3];
		array4[0] = 3;
		array4[1] = 4;
		array4[2] = 5;

		int[][] array5 = new int[3][2];
		int[][] array6 = new int[3][];
		 array6[0] = new int[3]; // 첫번재 줄 3칸.. 나머지 칸도 지정..

		// 확인문제 2 - boolean의 초기값은 0이다.

		// 확인문제 3 - ...

		
		int[][] Array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i].length);
		}
	}

}
