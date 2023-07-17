package sec03;

import java.util.Scanner;

public class 문제풀이연습1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.println("게임에 참가하는 인원은 몇명입니까?");

		int num = s.nextInt(); // String을 int로 넘김// 참가인원수 적기
		String[] name = new String[num]; // 배열만큼 사람 선언
		String[] vs = new String[2]; // string 배열을 2개 만듬
		System.out.println("참가자 이름을 입력하세요");
		for (int i = 0; i < name.length; i++) {
			name[i] = s.next(); // 인원수만큼 이름 입력
		}
		System.out.println("시작하는 단어는 아버지입니다");
		vs[0] = "아버지";
		Name: while (true) {
			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i] + ">>"); // 김태균>>
				vs[1] = s.next(); // vs0번부터 끝말잇기 입력
				if (vs[1].equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}

				if (vs[0].charAt(vs[0].length() - 1) != vs[1].charAt(0)) { // vs 0번의 첫글자가 vs1의 마지막 글자랑 같다면
					System.out.println(name[i] + "님이 졌습니다.");
					System.out.println("종료합니다.");
					break Name; // break 이름 지정 while문 정지
				}
				vs[0] = vs[1];

			}

		}

	}
}
