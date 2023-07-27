package chap12;

public class ThreadNameExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread(); // ���� ������ ���� 
		System.out.println("�⺻ ������ �̸� : " + mainThread.getName()); // main
		
		ThreadA threadA = new ThreadA();
		System.out.println("ù��° �۾� ������ �̸� : " + threadA.getName()); // Thread-0
		threadA.start();
		
		 ThreadB threadB = new ThreadB();
		 System.out.println("�ι�° �۾� ������ �̸� : " + threadB.getName()); // Thread-1
		 threadB.start();
	}

}
