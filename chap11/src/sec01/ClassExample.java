package sec01;

public class ClassExample {

	public static void main(String[] args) throws Exception{ // 예외 처리 
		//첫 번째 방법
		//Class clazz = Key.class;
		//Class clazz1 = Class.forName("sec01.Key"); // class.forName을 사용하는 이유 : 런타임에 동적으로 클래스를 로드하기위함
		
		Key key = new Key(50);
		Class clazz = key.getClass();
		System.out.println(clazz.getName()); // getName : 패키지 + 클래스  // 파일 경로 확인할 때 주로 사용 
											
		
		
		Class clazz2 = Member.class;
		System.out.println(clazz2.getSimpleName()); // getSimpleName : 클래스 이름만 나옴
		
	}

}
