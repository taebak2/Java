package sec02;

public class 브레이크예제1 {
// 블록 내부를 우선 실행 + 실행 결과에 따라서 반복 실행을 할지 결정
	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			// 1부터 6까지 랜덤 숫자 추출
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
