package sec02;

public class 다차원배열 {

	public static void main(String[] args) {

		int[][] mathScores = new int[2][3]; // 2줄 * 3칸 = 총 6칸짜리 테이블 (0,0)~ (1,2)까지..

		for (int i = 0; i < mathScores.length; i++) { // 2줄
			for (int k = 0; k < mathScores[i].length; k++) { // i번째 줄에 대한 칸 개수 ex) 첫번째 줄 칸 k개
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		System.out.println();

		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2]; // 첫번째 줄은 2칸으로 설정
		englishScores[1] = new int[3]; // 두번째 줄은 3칸으로 설정
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}

		}
		System.out.println();

		int[][] koreaScores = new int[4][];
		koreaScores[0] = new int[2];
		koreaScores[1] = new int[3];
		koreaScores[2] = new int[1];
		koreaScores[3] = new int[3];
		for (int i = 0; i < koreaScores.length; i++) {
			for (int k = 0; k < koreaScores[i].length; k++) {
				System.out.println("koreaScores[" + i + "][" + k + "]=" + koreaScores[i][k]);
			}

		}
		System.out.println();

		int[][] koreaScores2 = { { 85, 93 }, { 72, 91, 88 }, { 66 }, { 55, 57, 99 } };
		for (int i = 0; i < koreaScores2.length; i++) { // 4줄짜리
			for (int k = 0; k < koreaScores2[i].length; k++) {
				System.out.println("koreaScores2[" + i + "][" + k + "]=" + koreaScores2[i][k]);
			}

		}
		System.out.println();
	}
}