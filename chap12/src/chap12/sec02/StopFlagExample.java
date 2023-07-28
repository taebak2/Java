package sec02;


public class StopFlagExample {
	public static void main(String[] args) {
		
		PrintThread1  PrintThread = new PrintThread1();
		PrintThread.start();
		
		try {Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("인터럽트 오류가 발생했습니다.");
		}
	PrintThread.setStop(true);
	}
}
