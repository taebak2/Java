package sec02;

public class 향상된for문 {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) { // 반복문의 배열과 변수가 같을때만 먹힌다..
			sum += score; // scores의 length길이만큼 더한다..

		}

		// for(int i =0; i<scores.length; i++){
		// sum += scores[i]}

		System.out.println("점수 총합 : " + sum);
	}

}
