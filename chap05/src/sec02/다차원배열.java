package sec02;

public class �������迭 {

	public static void main(String[] args) {

		int[][] mathScores = new int[2][3]; // 2�� * 3ĭ = �� 6ĭ¥�� ���̺� (0,0)~ (1,2)����..

		for (int i = 0; i < mathScores.length; i++) { // 2��
			for (int k = 0; k < mathScores[i].length; k++) { // i��° �ٿ� ���� ĭ ���� ex) ù��° �� ĭ k��
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		System.out.println();

		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2]; // ù��° ���� 2ĭ���� ����
		englishScores[1] = new int[3]; // �ι�° ���� 3ĭ���� ����
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
		for (int i = 0; i < koreaScores2.length; i++) { // 4��¥��
			for (int k = 0; k < koreaScores2[i].length; k++) {
				System.out.println("koreaScores2[" + i + "][" + k + "]=" + koreaScores2[i][k]);
			}

		}
		System.out.println();
	}
}