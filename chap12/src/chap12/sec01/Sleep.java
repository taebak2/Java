package sec01;

public class Sleep extends Thread {

	@Override
	public void run() {
		try {Thread.sleep(3000);
			
		} catch (Exception e) {
		}
		System.out.println("잠을 잡니다.");
	}

}
