package sec02;

public class ATM implements Runnable {
	private int depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) { // this = Thread.mother
			for (int i = 0; i < 10; i++) {
				// object의 메소드

				notify(); // mother.start()가 먼저 실행되면 for문의 i=0일때 notify는 실행되지 않는다. 잠든 사람이 없기 때문에 깨울 사람이 없는 상태임 
				try {
					 
					wait(); // wait(); : 갖고 있던 고유 락을 해제하고 스레드를 잠들게 함 즉 mother가 잠이 들게된다.  
						//  son.start()가 실행될 때 son이 notify를 만나 잠든 mother가 일어나 mother.start();는 wait이후 명령문인 Thread.sleep(1000)부터 실행하게 된다.
						// 그와 동시에 son은 wait를 만나서 자고있는 상태가 된다.
						//  그리고 for문의 i=1일때 mother가 notify를 다시 만나기 때문에 그때 son이 일어난다.
						// son은 이후 thread.sleep(1000)부터 실행 
							
							
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);
			}
		}
	}

	public void withDraw(int howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("잔액 : %,d 원 %n", getDepositeMoney()); 
		}
	}

	public int getDepositeMoney() {
		return depositeMoney;
	}
}
