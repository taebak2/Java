package chap12;

public class ThreadA extends Thread{

	public ThreadA() {
		setName("�����忡��");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
	
	

}
