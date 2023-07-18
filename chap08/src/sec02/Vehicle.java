package sec02;

public interface Vehicle {
	
	// 인터페이스 필드는 상수 필드만 가능함 
	// public static final 생략
	// interface에 private 금지..
	int WHEELS = 4;
	
	public void run();
	// 인터페이스의 메소드이므로 추상 메소드
	//static abstract 생략

}
