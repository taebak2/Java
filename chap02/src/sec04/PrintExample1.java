package sec04;

import java.util.Scanner;

public class PrintExample1 {

	public static void main(String[] args) {
		//순번 이름 나이
		//printf 이용해서 1 \t 장동건 탭 26 
		// %d 왼쪽 맞춤 자리수 3자리 -3d
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = s.next();
		System.out.println("나이를 입력하세요");
		int age = s.nextInt();
		
		System.out.println("순번 \t이름\t나이\n");
		System.out.printf("%-3d\t%s\t%3d", 1, name, age);
		
		
	}

}
