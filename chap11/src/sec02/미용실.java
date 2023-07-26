package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class 미용실 {

	public static void main(String[] args) {
		Calendar time = Calendar.getInstance(); // 시간 객체 생성
		Scanner s = new Scanner(System.in);
		int 커트 = 8000;
		int 파마 = 20000;
		int 염색 = 25000;
		int 매직 = 60000;
		int result = 0;
		System.out.println("사용자 이름을 입력하세요.");
		String name = s.next();
		System.out.println("미용실 이용 항목을 입력하세요.");
		String category = s.next();

		switch (category) {
		case "커트":
			result += 8000;
			break;
		case "파마":
			result += 20000;
			break;
		case "염색":
			result += 25000;
			break;
		case "매직":
			result += 60000;
			break;
		}
		int amPm = time.get(Calendar.AM_PM);
		int hour = time.get(Calendar.HOUR);
		if (amPm == 0) {
			result *= 0.7;

		} else if (amPm == 1 && hour < 6) {
			result *= 0.9;
		} else {
			result *= 1;
		}

		System.out.println(name + "님의 결제 금액은 " + result + "원 입니다.");
	}
}
