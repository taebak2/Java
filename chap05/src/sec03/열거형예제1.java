package sec03;

import java.util.Calendar;

public class ����������1 {

	public static void main(String[] args) {
		Week today=null; // ���� public�̱� ������ �ҷ��� �� ����.. ���� enumŸ���� week ������ ���ٸ� ���� ����

		Calendar cal = Calendar.getInstance(); // ���� ��¥�� �ð� ������ ������
		int w = cal.get(Calendar.DAY_OF_WEEK); // ���� ��¥�� ���� ��ȣ 1 = �Ͽ���

		switch (w) {
		case 1:
			today = Week.�Ͽ���;
			break;
		case 2:
			today = Week.������;
			break;
		case 3:
			today = Week.ȭ����;
			break;
		case 4:
			today = Week.������;
			break;
		case 5:
			today = Week.�����;
			break;
		case 6:
			today = Week.�ݿ���;
			break;
		case 7:
			today = Week.�����;
			break;

		}
		System.out.println("���� ���� : " + today);
		
		if(today==Week.�Ͽ���) {
			System.out.println("�Ͽ����� �౸�� �մϴ�.");
		}else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}
	}

}
