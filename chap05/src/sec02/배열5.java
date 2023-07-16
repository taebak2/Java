package sec02;

import java.util.Scanner;

public class 배열5 {// 사용자가 입력한 숫자로 배열 개수 생성

	// for 문을 이용해 배열에 숫자를 1부터 사용자가 입력한 숫자만큼 데이터 추가

	// 입력된 데이터의 평균 값 출력

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("배열 개수를 입력해 주세요");
		int arraynum = s.nextInt();
		int[] num1 = new int[arraynum]; // 배열 개수 지정
										// 배열 개수 지정 방법 2int[] num2 = new int[s.nextInt()]; 

		for (int i = 0; i < arraynum; i++) { // i가 0부터 arraynum까지 조건을 만족하면 i에 1씩 더한다.
			num1[i] += i + 1; // num1의 0~arraynum까지의 숫자에 i+1
		}
		int sum = 0;
		double avg = 0;
		for (int j = 0; j < arraynum; j++) {
			sum += num1[j];
			avg = (double) sum / arraynum;
		}
		System.out.println("데이터의 평균값은 " + avg + " 입니다.");
	}

}
