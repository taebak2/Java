package sec01.exam06;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed+=1;
	}

	public final void stop() {
		//final 메소드는 메소드 오버라이딩이 안됨
		System.out.println("차를 멈춤");
		speed=0;
	}
}
