package sec02;

public class ATM implements Runnable {
	private int depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) { // this = Thread.mother
			for (int i = 0; i < 10; i++) {
				// object의 메소드

				notify(); //  맨 처음의 notify는 엄마만 있기 때문에 깨울 사람이 없다?
				try {
					 
					wait(); // 갖고 있던 고유 락을 해제하고 스레드를 잠들게 함 즉 엄마가 잠든 상태.. 
							 // 그러면 son.start()가 실행될 때 아들이 notify를 만나면 엄마가 일어나서 Thread.sleep(1000)부터 실행하게 됩니다.
							// 그와 동시에 아들은 wait를 만나서 자고있는 상태가 된다.
							// 엄마가 i=1일대 notify를 다시 만나기 때문에 그때 아들이 일어나
							// 아들은 또 thread.sleep(1000)부터 실행 
							//for문 i=1 부터 아들이 실행되면 
							//현재 엄마가 잠긴 상태여도 실행이 같이 되야하지않는지?? 엄마가 잠긴 상태여도 실행됐기 때문.
							//synchronhized의 초기 상태는 잠김 상태인지? 그러면 lock이 하는 기능이 정확히 무엇인지 모르겠음..
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
