package test;

import java.util.Scanner;

public class 확인문제4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = s.next();
		System.out.print("2. 주민번호 앞 6자리: ");
		String num = s.next();
		System.out.print("3. 전화번호: ");
		String num1 = s.next();
		
		
		System.out.printf("%s님 주민번호는 %s이고 연락처는 %s 입니다.",name,num,num1);
		System.out.printf("%s님 주민번호는 %s이고 연락처는 %s 입니다.",name,num,num1);
		//printf %d로 할 경우 대시 넣을 수 있는지?
		//printf 랑 print차이
		
		//출력은 printf 홍길동님 주민번호는 123456이고 연락처는 010-123-1234입니다.
		
	}

}
