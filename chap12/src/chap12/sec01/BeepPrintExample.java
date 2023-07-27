package chap12;

import java.awt.Toolkit; // 현재 운영체제의 정보를 직접 조회할 수 있는 도구

public class BeepPrintExample {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생
			try {Thread.sleep(500);} catch (Exception e) {}
				//Thread.sleep(500) : 0.5초간 일시정지 
			}
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch (Exception e) {}
			}
	}

}
