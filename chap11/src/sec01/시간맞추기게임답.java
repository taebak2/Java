package sec01;

import java.util.Calendar;
import java.util.Scanner;

public class �ð����߱���Ӵ� {
	private String enter;
	private int time;

	public int gameStart() {
		Scanner s = new Scanner(System.in);
		enter = s.nextLine(); // enter �ν��ϱ� ���ؼ� Line���
		Calendar now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);
		System.out.println("���� ���� : " + time + "�� �Դϴ�.");
		return time;
	}

	public static void main(String[] args) {

	}
}
