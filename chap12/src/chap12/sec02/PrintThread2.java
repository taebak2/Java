package sec02;

public class PrintThread2 extends Thread {

	@Override
	public void run() {

		try {
			while (true) {
				System.out.println("실행 중");
				Thread.sleep(1); 
			}
		} catch (InterruptedException e) { // 
			System.out.println("인터럽트 오류 발생");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");

	}

}
