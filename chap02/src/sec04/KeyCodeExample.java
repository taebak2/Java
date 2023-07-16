package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		//throws Exception 예외 상황을 화면에 출력 (메인 구문 옆에 입력)

		int keyCode;
		
		while(true) {	// 무한 반복문
			keyCode = System.in.read();
			System.out.println("키코드 : " + keyCode);
			if(keyCode == 113) {break;}
			
		}
		System.out.println("종료");
	}

}
