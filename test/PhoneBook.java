package test;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("인원수를 입력하세요");
		int num = s.nextInt();
		Phone[] p = new Phone[num]; // 객체 만들 때만 배열로 선언 가능 
		for (int i = 0; i < num; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) : ");
			p[i] = new Phone(s.next(), s.next()); // 이름과 전화번호 입력 // phone class에서 String 타입의 생성자 생성 받아옴
		}
		System.out.println("저장되었습니다.");

		while (true) {
			System.out.println("검색할 이름 : ");
			String name = s.next(); // 이름 검색
			if (name.equals("중지")) {
				System.out.println("중지합니다.");
				break;
			}
			int i = 0;
			for (i = 0; i < num; i++) {
				if (name.equals(p[i].name)) {
					System.out.println(p[i].name + "의 전화번호는 " + p[i].phNum);
					break;
				}
			}
			if (i == num) { // for문에서는 i가 num전까지 진행하지만, name.equals가 안나온다면 break가 안걸려서 num이랑 같아진다. 
				System.out.println("결과가 없습니다.");
			}
		}

	}
}