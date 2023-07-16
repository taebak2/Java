package sec02;

import java.util.Scanner;

public class 배열8re {

	public static void main(String[] args) {
		// 로또 몇 게임을 하시겠습니까?
		// 사용자가 입력한 숫자만큼 로또번호를 랜덤으로 출력하세요

		Scanner s = new Scanner(System.in);
		int[] lotto = new int[6];
		System.out.println("로또 몇 게임을 하시겠습니까?");
		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < lotto.length; j++) {
				lotto[j] = (int) (Math.random() * 45) + 1;
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
	}
}
