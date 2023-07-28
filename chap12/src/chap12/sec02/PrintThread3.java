package sec02;

public class PrintThread3 extends Thread {

	@Override
	public void run() {

			while (true) {
				System.out.println("실행 중");
				if(Thread.interrupted()) { // Thread.interrupted : interrupt 호출 여부 확인
										   // isInterrupted() : interrupt가 호출되면 true 리턴
					break;
				}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");

	}

}
