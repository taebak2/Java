package sec02;

public class InterruptExample {
	
	public static void main(String[] args) {

		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		thread.interrupt(); // thread가 일시정지 상태가 아니면 interrupt 메소드의 사용 의미가 없음 
							// 그래서 Thread.sleep 메소드를 반드시 사용해야한다.
							// thread.interrupt는 스레드가 일시 정지 상태에 있을 때 
							//InterruptedException 예외를 발생시키는 역할
	}

}
