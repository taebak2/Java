package sec01;

import java.util.Calendar;

public class 자바맨의일상 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 캘린더 생성
		int year = cal.get(Calendar.YEAR); // 연도
		int month = cal.get(Calendar.MONTH) + 1; // 달
		int day = cal.get(Calendar.DAY_OF_MONTH); // 일
		int nextDay = day + 1;

		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다");

		Sleep thread1 = new Sleep();
		Runnable wakeUp = new WakeUp();
		Thread thread2 = new Thread(wakeUp);
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("공부합니다");

			}
		});
		thread1.start(); // 상속 방식
		thread2.start(); // 기본 클래스 방식
		thread3.start(); // 익명객체 방식

		try {
			Thread.sleep(4000);
			System.out.println("오늘은 " + year + "년 " + month + "월 " + nextDay + "일 입니다");
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread thread4 = new Thread(wakeUp);
		thread4.start();
		Thread thread5 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("공부합니다");

			}
		});
		thread5.start();
		
		Thread thread6 = new Sleep();
		thread6.start();
	}

}
