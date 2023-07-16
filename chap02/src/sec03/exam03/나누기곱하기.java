package sec03.exam03;

import java.util.Scanner;

public class 나누기곱하기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요");
		int a = s.nextInt();

		System.out.println("두번째 숫자를 입력하세요");
		int b = s.nextInt();

		System.out.println("연산기호를 입력하세요(*,/)");
		String c = s.next();
		char d = c.charAt(0);
		 												// if (c.compareTo("*") == 0) c와 문자열 * 는 같다. char 변환을 쓰지 않고 String으로만 계산하는 경우
		if (d == '*'){                                  // if (c.equals("*") )   
			int e = a * b;
			System.out.println("입력하신 연산의 결과는 " + e + "입니다.");
		} else {
			double f = (double) a / b;
			System.out.println("입력하신 연산의 결과는" + f + "입니다.");
		}

	}

}
