package sec03.exam01;

import java.util.Scanner;

public class PromotionExample2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("한 글자를 입력하세요 :");
		String a = s.next();
		
		char b = a.charAt(0); // String 타입을 char 타입으로 변환,  '0'은 글자의 위치 ex) 글자 입력시 1개를 넘어가면 오류가 뜸 0=글자 1번쨰, 1=글자 2번째, ....
		int c = b; // char 타입을 int로 변환, toString(데이터) 데이터를 String 타입으로 변환  
		
		System.out.println("사용자가 입력한 글자의 유니코드를 출력합니다.");
		System.out.println();
		System.out.println("예) " + "입력하신 '" + a + "'의 유니코드 값은 " + c + "입니다." );
	}

}
