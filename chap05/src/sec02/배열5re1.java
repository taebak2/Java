package sec02;

import java.util.Scanner;

public class 배열5re1 {// 사용자가 입력한 숫자로 배열 개수 생성
	// for 문을 이용해 배열에 숫자를 1부터 사용자가 입력한 숫자만큼 데이터 추가
	// 입력된 데이터의 평균 값 출력
	// 배열 개수 지정
	// i가 0부터 arraynum까지 조건을 만족하면 i에 1씩 더한다.
	// num1의 0~arraynum까지의 숫자에 i+1

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		int line[] = new int[num]; // 배열 개수 지정
		int line2[] = new int[num]; // 배열 개수 지정
		
		for (int i = 0; i < num; i++) {

			line[i] += 1 + i; // 라인의 0번째 숫자 0에 1+i(0)을 대입
		}
		System.out.println(line);
		System.out.println(line2);
	}

}
