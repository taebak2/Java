package sec01;

public class MyClassExample {

	public static void main(String[] args) {

		MyClass my1 = new MyClass();
		// 디폴트 생성자 호출
		my1.rc.turnOn();
		my1.rc.setVolume(7);
		//출력값 2개
		
		MyClass my2 = new MyClass(new Television()); // Television(매개변수 없음)
		my2.rc.turnOn();
		my2.rc.setVolume(7);
		// 출력값 6개
		
		MyClass my3 = new MyClass(new Audio()); // 매개변수로 오디오(매개변수 없음) 넣었음
		my3.rc.turnOn();
		my3.rc.setVolume(7);
		//출력값 6개
		
		MyClass my4 = new MyClass(); 
		my4.methodA();
		//출력값 3개
		
		MyClass my5 = new MyClass();
		my5.methodB(new Television());
		// 매개변수가 있는 메소드 호출(Television 호출)
		//출력값 3개
		
	}

}
