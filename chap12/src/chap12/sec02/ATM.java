package sec02;

public class ATM implements Runnable {
	private int depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) { // this = Thread.mother
			for (int i = 0; i < 10; i++) {
				// object�� �޼ҵ�

				notify(); //  �� ó���� notify�� ������ �ֱ� ������ ���� ����� ����?
				try {
					 
					wait(); // ���� �ִ� ���� ���� �����ϰ� �����带 ���� �� �� ������ ��� ����.. 
							 // �׷��� son.start()�� ����� �� �Ƶ��� notify�� ������ ������ �Ͼ�� Thread.sleep(1000)���� �����ϰ� �˴ϴ�.
							// �׿� ���ÿ� �Ƶ��� wait�� ������ �ڰ��ִ� ���°� �ȴ�.
							// ������ i=1�ϴ� notify�� �ٽ� ������ ������ �׶� �Ƶ��� �Ͼ
							// �Ƶ��� �� thread.sleep(1000)���� ���� 
							//for�� i=1 ���� �Ƶ��� ����Ǹ� 
							//���� ������ ��� ���¿��� ������ ���� �Ǿ������ʴ���?? ������ ��� ���¿��� ����Ʊ� ����.
							//synchronhized�� �ʱ� ���´� ��� ��������? �׷��� lock�� �ϴ� ����� ��Ȯ�� �������� �𸣰���..
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
			System.out.printf("�ܾ� : %,d �� %n", getDepositeMoney()); 
		}
	}

	public int getDepositeMoney() {
		return depositeMoney;
	}
}
