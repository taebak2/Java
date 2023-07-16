package sec01;

import java.util.Scanner;

public class 문자열비교 {

	public static void main(String[] args) {
		//String var1 = "홍길동"; // 변수 사용 안해서 경고 
		//String var2 = "홍길동";

		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		s.close();
		if (a == b) {
			System.out.println("두 데이터 참조가 같아요");
		} else {
			System.out.println("두 데이터 참조가 달라요");

		}
		String var3 = new String("홍길동");
		String var4 = new String("홍길동");
		if (var3 == var4) {
			System.out.println("두 데이터 참조가 같아요");
		} else {
			System.out.println("두 데이터 참조가 달라요"); // new 값을 받는 순간 String주소가 서로 달라서 안의 데이터값이 같아도 다르다고 표시 equals사용해야함..
		}
		
		String t;
		
		
	}

}
