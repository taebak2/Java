package sec01;

import java.util.Scanner;

public class indexOfExample {

	public static void main(String[] args) {
		// String str1 = "나는 자바를 사랑합니다.";
		// int index = str1.indexOf("코드"); // indexOf 시작위치, 만약 해당 문자열이 포함되지 않으면
		// -1(=false) 출력
		// System.out.println(index);

		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		String address = s.next();
		if (address.indexOf("중흥") != -1 || address.indexOf("두암") != -1 || address.indexOf("운암") != -1
				|| address.indexOf("용봉") != -1) { 
			System.out.println("북구 거주민입니다.");
		} else {
			System.out.println("북구 거주민이 아닙니다.");
		}
	}

}
