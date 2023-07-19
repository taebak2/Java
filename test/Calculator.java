package test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calc calculator;
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 2개와 연산자를 입력하세요");
		int a = s.nextInt();
		int b = s.nextInt();
		String c = s.next();

		switch (c) {
		case "+":
			calculator = new Add(); // 객체 초기화
			break;
		case "-":
			calculator = new Sub();
			break;
		case "*":
			calculator = new Mul();
			break;
		default:
			calculator = new Div();
			break;
		}
		calculator.setValue(a, b);
		System.out.println(calculator.calculate());

	}

}
