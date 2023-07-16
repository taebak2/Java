package sec02;

public class continue예제1 {
/* continue는 생략~ */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { // 1부터 10까지 10번 반복
			if (i % 2 != 0) { // i가 홀수면 continue => 생략 
				continue;
			}
			System.out.println(i);
		}
	}

}
