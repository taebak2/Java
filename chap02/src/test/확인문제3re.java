package test;

import java.util.Scanner;

public class 확인문제3re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수 :");
		String num1 = s.next();
		System.out.println("두 번째 수 :");
		String num2 = s.next();

		// 첫 번째 수와 두 번째 수가 같으면 두 수가 같아요
		// 다르면 달라요

		//방법 1
		
		 if(num1.equals(num2)) {
		 System.out.println("두 수가 같아요");
		 }
		 else {
		 System.out.println("두 수가 달라요");

		 //방법 2
		 
		// 	if (num1.compareTo(num2) == 0) {
		//	System.out.println("두 수가 같아요");
		//} else {
		//	System.out.println("두 수가 달라요");
		}

	}
}
