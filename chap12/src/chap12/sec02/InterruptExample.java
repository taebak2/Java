package sec02;

public class InterruptExample {
	
	public static void main(String[] args) {

		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		thread.interrupt(); // thread�� �Ͻ����� ���°� �ƴϸ� interrupt �޼ҵ��� ��� �ǹ̰� ���� 
							// �׷��� Thread.sleep �޼ҵ带 �ݵ�� ����ؾ��Ѵ�.
							// thread.interrupt�� �����尡 �Ͻ� ���� ���¿� ���� �� 
							//InterruptedException ���ܸ� �߻���Ű�� ����
	}

}
