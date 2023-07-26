package sec01;

public class BoxingExample2 {

	public static void main(String[] args) {
		
		// Integer obj = new Integer(100); 정식 박싱 코드
		// 대입값이 int 타입이면 자동으로 박싱
		Integer obj = 100;
		System.out.println(obj);
		
		// int value = obj.intValue(); 정식 언박싱 코드
		// 대입값이 int 타입이면 자동으로 언박싱해줌
		int value = obj;
		System.out.println(value);
		
		Integer obj2 = new Integer("100");
		// int value2 = Integer.parseInt(obj2);
		// Integer.parseInt는 String 타입을 int 타입으로 변경
		// obj2가 String 타입이 아니므로 사용 불가능
		int value2 = Integer.valueOf(obj2); // Wrapper클래스 타입이기 때문에 valueOf로만 변경 가능하다
		// valueOf를 이용해야 가능함
		
		int value3 = Integer.parseInt("300");
		System.out.println(value3);
	}
	
	

}
