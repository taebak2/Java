package sec02;

public class 확인문제3re2 {

	public static void main(String[] args) {
		// while, break, math.random()
		while (true) {
			int num = (int) (Math.random() * 6 + 1); // 주사위 num와 num1을 무제한 돌리는 행위
			int num1 = (int) (Math.random() * 6 + 1);
			System.out.println("주사위 숫자1 : " + num);
			System.out.println("주사위 숫자2 : " + num1);
			System.out.println();
			if ((num + num1) != 5) {
				continue;
			} else if (num + num1 == 5) {
				break;
			}
		}
	}
}
