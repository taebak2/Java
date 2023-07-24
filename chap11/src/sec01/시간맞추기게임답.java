package sec01;

import java.util.Calendar;
import java.util.Scanner;

public class 시간맞추기게임답 {
	private String enter;
	private int time;

	public int gameStart() {
		Scanner s = new Scanner(System.in);
		enter = s.nextLine(); // enter 인식하기 위해서 Line사용
		Calendar now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);
		System.out.println("현재 시작 : " + time + "초 입니다.");
		return time;
	}

	public static void main(String[] args) {

	}
}
