package sec02;

public class 브레이크예제3 {
	public static void main(String[] args) {
		/*outer를 사용시 특정 조건을 만족하면 반복문을 탈출한다.*/

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
