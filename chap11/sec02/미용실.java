package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class �̿�� {

	public static void main(String[] args) {
		Calendar time = Calendar.getInstance(); // �ð� ��ü ����
		Scanner s = new Scanner(System.in);
		int ĿƮ = 8000;
		int �ĸ� = 20000;
		int ���� = 25000;
		int ���� = 60000;
		int result = 0;
		System.out.println("����� �̸��� �Է��ϼ���.");
		String name = s.next();
		System.out.println("�̿�� �̿� �׸��� �Է��ϼ���.");
		String category = s.next();

		switch (category) {
		case "ĿƮ":
			result += 8000;
			break;
		case "�ĸ�":
			result += 20000;
			break;
		case "����":
			result += 25000;
			break;
		case "����":
			result += 60000;
			break;
		}
		int amPm = time.get(Calendar.AM_PM);
		int hour = time.get(Calendar.HOUR);
		if (amPm == 0) {
			result *= 0.7;

		} else if (amPm == 1 && hour < 6) {
			result *= 0.9;
		} else {
			result *= 1;
		}

		System.out.println(name + "���� ���� �ݾ��� " + result + "�� �Դϴ�.");
	}
}
