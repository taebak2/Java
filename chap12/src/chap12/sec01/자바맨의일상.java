package sec01;

import java.util.Calendar;

public class �ڹٸ����ϻ� {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Ķ���� ����
		int year = cal.get(Calendar.YEAR); // ����
		int month = cal.get(Calendar.MONTH) + 1; // ��
		int day = cal.get(Calendar.DAY_OF_MONTH); // ��
		int nextDay = day + 1;

		System.out.println("������ " + year + "�� " + month + "�� " + day + "�� �Դϴ�");

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
				System.out.println("�����մϴ�");

			}
		});
		thread1.start(); // ��� ���
		thread2.start(); // �⺻ Ŭ���� ���
		thread3.start(); // �͸�ü ���

		try {
			Thread.sleep(4000);
			System.out.println("������ " + year + "�� " + month + "�� " + nextDay + "�� �Դϴ�");
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
				System.out.println("�����մϴ�");

			}
		});
		thread5.start();
		
		Thread thread6 = new Sleep();
		thread6.start();
	}

}
