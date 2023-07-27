package chap12;

public class ThreadNameExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread(); // 현재 스레드 참조 
		System.out.println("기본 쓰레드 이름 : " + mainThread.getName()); // main
		
		ThreadA threadA = new ThreadA();
		System.out.println("첫번째 작업 쓰레드 이름 : " + threadA.getName()); // Thread-0
		threadA.start();
		
		 ThreadB threadB = new ThreadB();
		 System.out.println("두번째 작업 쓰레드 이름 : " + threadB.getName()); // Thread-1
		 threadB.start();
	}

}
