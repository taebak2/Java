package sec02;

public class MovieThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("�������� ����մϴ�.");
			
			if (Thread.interrupted()) {
				System.out.println("�������� �����մϴ�.");
				break;
			}
		}

	}
}
