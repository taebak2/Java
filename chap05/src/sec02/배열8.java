package sec02;

import java.util.Scanner;

public class 배열8 {

	public static void main(String[] args) {
		// 로또 몇 게임을 하시겠습니까?
		// 사용자가 입력한 숫자만큼 로또번호를 랜덤으로 출력하세요

		Scanner s = new Scanner(System.in);
		int[] lotto = new int[6];
		System.out.println("로또 몇 게임을 하시겠습니까?");
		int game = s.nextInt();
		int count;
		for (int i = 0; i < game * (lotto.length); i++) {
			count = (int) (Math.random() * 45) + 1;
			if (i%6 ==0) {
				System.out.println();
			}
			System.out.print(count + " ");

		}
	}
}
