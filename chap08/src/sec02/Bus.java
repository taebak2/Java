package sec02;

public class Bus implements Vehicle{

	public void run() {
		System.out.println("버스가 달립니다.");
	}
	void stop() {
		System.out.println("버스가 멈춥니다.");
	}
}
