package chap12;

import java.awt.Toolkit; // 현재 운영체제의 정보를 직접 조회할 수 있는 도구

public class BeepPrintExample2 {

	public static void main(String[] args) {

		Runnable beepTask = new BeepTask(); // Runnable BeepPrintExample 클래스에서 만들어 놨기 때문에 생성 가능
		Thread thread = new Thread(beepTask);
		thread.start(); //
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch (Exception e) {}
			}
	}

}
