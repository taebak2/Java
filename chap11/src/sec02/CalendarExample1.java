package sec02;

import java.util.Calendar;

public class CalendarExample1 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); // ������ �ý��� �ð� �������� ������
		
		int hour = now.get(Calendar.HOUR); 
		
		System.out.println("���� �ð� : " + hour);
		
		int amPm = now.get(Calendar.AM_PM);
		System.out.println(amPm);
	}

}
