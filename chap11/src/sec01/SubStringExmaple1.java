package sec01;

import java.util.Scanner;

public class SubStringExmaple1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이메일을 입력해주세요");
		String email = s.next();
		int id = email.indexOf("@"); // @위치 찾아내라
		System.out.println(email.substring(0,id)); // @전까지 추출
		System.out.println(email.substring(id+1));
		
		// 예) 12dk545@hanmail.net -> 아이디만 추출

	}

}
