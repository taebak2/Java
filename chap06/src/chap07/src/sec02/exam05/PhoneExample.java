package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {
		
		//SmartPhone sp = new SmartPhone(); // 기본 객체는 자기 것을 먼저 가져온다.
		
		//System.out.println(sp.cost); // :: SmartPhone cost vs Phone cost  
									   //->  형변환 안했을 경우 SmartPhone의 cost를 호출 
		

		Phone p = new SmartPhone();
		// 자식 객체를 부모 객체로 형변환 시킴(자동 형변환:왼쪽 클래스(부모)가 더 큼)
		System.out.println(p.cost);
		p.powerOn(); 
		p.ring(); // 오버라이드된 객체라 SmartPhone의 메소드를 가져온다.
		
		//p.videoOn(); :: SmartPhone이 Phone으로 형변환 됐기 때문에 SmartPhone의 메소드인 videoOn을 사용할 수 없다.
		//p.phoneCase="하드케이스"; :: SmartPhone이 Phone으로 형변환 됐기 때문에 SmartPhone의 필드인 phoneCase 역시 사용할 수 없다.
		
		
		SmartPhone sp = (SmartPhone)p; // 부모클래스에 상속시켰던 p를 다시 자식 클래스로 강제 형변환 시킴
		sp.phoneCase="소프트케이스"; // 자식 객체 필드나 메소드 사용이 가능하다...
		sp.powerOn();
		System.out.println(sp.cost); // 부모 클래스와 자식 클래스에 있는 같은 이름의 필드는 자식 객체를 출력
		
		//Phone p2 = new Phone(); 자식 타입이 부모 타입으로 변환되지 않은 상태(형변환)에서 
		//SmartPhone sp2 = (SmartPhone)p2; 부모 타입을 자식 타입으로 강제 변환 되지 않는다.
	}

}
