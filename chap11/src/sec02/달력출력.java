package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class �޷���� {

	public static void main(String[] args) {
		// �޷� �����
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int year = s.nextInt();
		System.out.println("��¥�� �Է��ϼ���");
		int month = s.nextInt();
		System.out.println("  ========="+"["+month+"��]=========");
		System.out.println("  �� �� ȭ �� �� �� �� ");
		
		Calendar start = Calendar.getInstance(); // ����
		Calendar end = Calendar.getInstance(); // ��
		
		start.set(year, month -1, 1);
		//���� month ���� = ex) 7���̸� ��ǻ�Ϳ� ����� �޷°��� 0���� 11�̴ϱ� -1�� ���ְ�, �� ���� 1�Ϻ��� ����
		end.set(year,month, 1);
		// ������ �� ����, �Է���(7��) ������ (8��)�� 1�Ϸ� �����ϰ�
		end.add(Calendar.DATE, -1);
		// end��(8��)���� -1�� �� 7�� ������ ��(31��)
		
		//month = cal.getFirstDayOfWeek();
		int dayweek = start.get(Calendar.DAY_OF_WEEK);  // 2023�� 7�� 1��(��) -> 7
		// ���� ���� ������ ���ڷ� ��Ÿ�� 0 = �Ͽ���
		//  ���� ��ȣ ���� �Ͽ��� 1 ����� 7
		for (int i = 1; i < dayweek; i++) {
			System.out.print("   ");
		}
		// ���� ��ȣ�� �ش��ϴ� ��ŭ ���� �߰� (1�ڸ��� 3ĭ)
		
		
		for (int i =1 , j=dayweek; i<= end.get(Calendar.DATE); i++,j++) {
			System.out.printf("%3d", i);
			if(j%7 ==0 ) { // ���Ϲ�ȣ�� 7.. ������̶�� �� �ٲ�
				System.out.println();
			}
		}
	}

}
