package sec01;

public class BoxingExample1 {

	public static void main(String[] args) {
		
		// Wrapper 클래스 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300"); // 해당 방법이 더 효율적임
		
		Integer obj = 100; // 자동 박싱
		//Integer objs = "100"; // 박싱 x
		int value = obj + 100; // 뒤에 있는 값도 자동 박싱됩니다.
		
		// Wrapper 클래스 언박싱(포장 해제)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		Integer obj4 = new Integer(100);
		Integer obj5 = new Integer(100);
		if(obj4==obj5) {
			System.out.println(true);
		}else {
			System.out.println(false);
		} // false
		
		int num1 = 100;
		int num2 = 100;
		if(num1==num2) {
			System.out.println(true);
		}else {
			System.out.println(false); 
		} // true
	}

}
