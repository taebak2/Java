package sec02;

public class ����for�� {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) { // �ݺ����� �迭�� ������ �������� ������..
			sum += score; // scores�� length���̸�ŭ ���Ѵ�..

		}

		// for(int i =0; i<scores.length; i++){
		// sum += scores[i]}

		System.out.println("���� ���� : " + sum);
	}

}
