package sec02;

public class PrintThread3 extends Thread {

	@Override
	public void run() {

			while (true) {
				System.out.println("���� ��");
				if(Thread.interrupted()) { // Thread.interrupted : interrupt ȣ�� ���� Ȯ��
										   // isInterrupted() : interrupt�� ȣ��Ǹ� true ����
					break;
				}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");

	}

}
