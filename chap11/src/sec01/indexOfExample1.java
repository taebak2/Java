package sec01;

import java.util.Scanner;

public class indexOfExample1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		String ad = s.nextLine(); // 띄어쓰기 포함
		ad = ad.replace("광주", "광주광역시");
		System.out.println(ad);
		ad = ad.replaceFirst("북구", "두암동"); // replaceFirst중복시 첫 번째 문자만 변경
		System.out.println(ad);
	}

}
