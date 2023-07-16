package sec02;

import java.util.Scanner;

public class 배열7re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("배열의 개수는?");
		int num =  s.nextInt(); // 개수 입력
		
		int[] scores = new int[num]; // 입력받은 숫자로 배열 개수 생성
		for (int i = 0; i < scores.length; i++) { // length는 배열의 길이
			System.out.println((i+1) + "번재 숫자를 입력하세요."); // 0번부터니까 +1 
			int num2 = s.nextInt(); // 배열넘버에 숫자 입력
			scores[i] = num2; // 배열의 0번째는 num2의 첫번재 숫자, 배열의 1번째는 num2의 두번째 숫자...
		}
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; // 총합은 scores배열의 0번부터 scores.length만큼의 합
			avg += (scores[i]/num);
		}
		System.out.println("총합 : " + sum); 
		System.out.println("평균 : " + avg);
	}

}
