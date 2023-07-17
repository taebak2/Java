package sec01.exam06;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed+=10;
	}
	// @Override // 값 변경시 오버라이드 꼭 붙여줘야한다. override{중괄호 값 변경} vs overload{생성자 만들 시 매개변수 값 다른거}  
	// public void stop() {} // Car class의 stop이 final 메소드이기 때문에 불러올 수 없다.
	public void stop(int x) {  
	System.out.println("스포츠카를 멈춤");
	speed=0;
	}

}
