package sec01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {

		// 2명의 이름과 처리코드를 입력 받으세요
		// 예) 홍길동 C88, 장동건 B70
		// 맨 앞 문자는 등급, 나머지 2글자는 점수입니다.
		// 등급은 A~D등급까지 존재하고
		// A등급은 점수에 20% 가산, B등급은 점수에 10% 가산
		// C등급은 점수에 5% 가산입니다.

		// 최종점수가 90점 이상이면 "최우수", 80이상이면 "우수"
		// 나머지는 "일반"입니다.
		// 최종 출력 -> 홍길동님은 최우수 등급입니다.

		Scanner s = new Scanner(System.in);
		String name[] = new String[2];
		String score[] = new String[2];
		double result;
		
		System.out.println("2명의 이름과 처리코드를 입력하세요");
		
		
		for (int i = 0; i < 2; i++) {
			result = Integer.parseInt(score[i].substring(1));
			name[i] = s.next();
			score[i] = s.next(); // 점수 스코어로 환산
			Integer.parseInt(score[i].substring(1));
			switch (score[i].charAt(0)) {
			case 'A':
			case 'a':
				result*=1.2;
				break;
			case 'B':
			case 'b':
				result*=1.1; 
				break;
			case 'C':
			case 'c':
				result*=1.05;
				break;
			}
			System.out.println(name[i] + "님은 ");

			System.out.println(result);
			if (result >= 90) {
				System.out.println("최우수 등급입니다.");
			} else if (result >= 80) {
				System.out.println("우수 등급입니다.");
			} else {
				System.out.println("일반 등급입니다.");
			}
		}

	}

}
