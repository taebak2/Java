package sec02;

import java.util.Calendar;

public class CalendarExample1 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); // 윈도우 시스템 시간 기준으로 가져옴
		
		int hour = now.get(Calendar.HOUR); 
		
		System.out.println("현재 시각 : " + hour);
		
		int amPm = now.get(Calendar.AM_PM);
		System.out.println(amPm);
	}

}
