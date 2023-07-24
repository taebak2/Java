package sec01;

import java.util.Calendar;
import java.util.Scanner;

public class 시간맞추기게임 {

	private String enter;
	private int time;

	public int start() {
		Scanner s = new Scanner(System.in);
		enter = s.nextLine(); // enter 인식하기 위해서 Line사용
		Calendar now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);
		System.out.println("현재 시작 : " + time + "초 입니다.");
		return time;

	}

	public static void main(String[] args) {
		String name[] = { "홍길동", "장동건" };
		int time[][] = new int[2][2];
		시간맞추기게임 game = new 시간맞추기게임();

		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " 시작 <Enter>키 >>");
			time[i][0] = game.start();
			System.out.println(name[i] + "10초 예상 후 <Enter>키 >>");
			time[i][1] = game.start();
		}
		if (time[0][0] > time[0][1]) {
			time[0][1] += 60;
		}
		if (time[1][0] > time[1][1]) {
			time[1][1] += 60;
		}

		int result1 = time[0][1] - time[0][0];
		int result2 = time[1][1] - time[1][0];

		if (result1 > 10) {
			Math.abs(10-Math.abs(10 - result1));
		}

		if (result2 > 10) {
			Math.abs(10-Math.abs(10 - result2));

		}

		System.out.println("홍길동의 결과 " + result1 + " 장동건의 결과 " + result2);
		if (result1 > result2) {
			System.out.println("홍길동님이 이겼습니다.");
		} else if (result1 < result2) {
			System.out.println("장동건님이 이겼습니다.");
		} else {
			System.out.println("비겼습니다.");
		}
	}
}
