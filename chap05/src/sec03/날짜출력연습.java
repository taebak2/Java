package sec03;

import java.time.DayOfWeek;
import java.util.Calendar;

public class 날짜출력연습 {
	public static void main(String[] args) {
		String today = null;
		Calendar Cal = Calendar.getInstance();
		int year = Cal.get(Calendar.YEAR);
		int month = Cal.get(Calendar.MONTH) + 1;
		int day = Cal.get(Calendar.DAY_OF_MONTH);
		int hour = Cal.get(Calendar.HOUR);
		System.out.printf("%d년 %d월 %d일 %d시 입니다.", year, month, day, hour);
	
		
	}

}
