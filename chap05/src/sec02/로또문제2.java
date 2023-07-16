package sec02;

import java.util.Scanner;

public class 로또문제2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int lotto[] = new int[6];
		int num = 0; // 번호 초기값 세팅
		boolean[] check = new boolean[46];
		// 번호가 같은지 판단하는 배열 생성
		// 1~45가 필요하지만 배열은 0부터 시작하므로 총 46개 생성

		for (int i = 0; i < lotto.length; i++) {
			num = (int) (Math.random() * 45) + 1;

			// boolean은 초기값 false로 되어 있음
			// 랜덤 숫자 자리를 뽑은 적이 없으면 해당 숫자 추출
			// 해당 자리 값을 true로 변경

			if (check[num] == false) {
				lotto[i] = num;
				check[num] = true;
			} else {
				i--; // 똑같은 숫자가 나올 시 원래 i가 1씩 증가하지만, 1을 뻄으로써 다시 돌린다.
			}
		}

		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j] + " ");

		}

	}
}
