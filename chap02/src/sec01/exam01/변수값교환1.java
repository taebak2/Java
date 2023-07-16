package sec01.exam01;

public class 변수값교환1 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;

		System.out.println("x:" + x + ", y:" + y);

		int temp = x; // temp 라는 변수를 생성해 x값 대입, = 는 같다가 아닌 대입
		
		x = y; // x는 temp에 들어가 있고 현재 변수x는 빈 상태 <- 변수 y값을 대입 
		y = temp; // 변수 y에 변수 temp값을 대입시킴 = x와 y값을 서로 바꿈
		
		System.out.println("x:" + x + ", y:" + y);
	}

}
