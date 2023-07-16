package sec02;

import java.util.Scanner;

public class 배열4 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("첫 번째 숫자를 입력해 주세요");
	int a = s.nextInt();
	System.out.println("두 번째 숫자를 입력해 주세요");
	int b = s.nextInt();
	int sum=0;
	
	int[]c = new int[2]; //  2개 공간을 가진 int 배열 생성, 데이터가 정해져 있으면 바로 {}만 써도 됩니다. but 데이터 안정해져 있으면 new 써야함
	c[0] =a;
	c[1] =b;
	// c = new int[]{a,b}; - 한번에 넣기 
	
	sum+=c[0]+c[1];
	System.out.println("합계는 : " + sum);
	
	
	
	
	
	
	
	
	
	
	
	} 

}
