package sec02;


public class StopFlagExample {
	public static void main(String[] args) {
		
		PrintThread1  PrintThread = new PrintThread1();
		PrintThread.start();
		
		try {Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("���ͷ�Ʈ ������ �߻��߽��ϴ�.");
		}
	PrintThread.setStop(true);
	}
}
