package sec01;

import java.util.Calendar;
import java.util.Scanner;

public class �ð����߱���� {

	private String enter;
	private int time;

	public int start() {
		Scanner s = new Scanner(System.in);
		enter = s.nextLine(); // enter �ν��ϱ� ���ؼ� Line���
		Calendar now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);
		System.out.println("���� ���� : " + time + "�� �Դϴ�.");
		return time;

	}

	public static void main(String[] args) {
		String name[] = { "ȫ�浿", "�嵿��" };
		int time[][] = new int[2][2];
		�ð����߱���� game = new �ð����߱����();

		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " ���� <Enter>Ű >>");
			time[i][0] = game.start();
			System.out.println(name[i] + "10�� ���� �� <Enter>Ű >>");
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

		System.out.println("ȫ�浿�� ��� " + result1 + " �嵿���� ��� " + result2);
		if (result1 > result2) {
			System.out.println("ȫ�浿���� �̰���ϴ�.");
		} else if (result1 < result2) {
			System.out.println("�嵿�Ǵ��� �̰���ϴ�.");
		} else {
			System.out.println("�����ϴ�.");
		}
	}
}
