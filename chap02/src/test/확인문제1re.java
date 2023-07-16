package test;

import java.util.Scanner;

public class 확인문제1re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이름은?"); // 83.67
		String name = s.next();
		System.out.println("중간고사 점수는?"); // 83.67
		double mid = s.nextDouble();
		System.out.println("기말고사 점수는?");
		double last = s.nextDouble();
		System.out.println("리포트 점수는?");
		double report = s.nextDouble();
		double result = ((mid + last + report) / 3);
		// printf 사용 홍길동님의 평균 점수는 : 73.25 입니다. 5f 소수점 2자리
		// System.out.printf(name + "님의 평균 점수는: %5.2f 입니다", ((mid + last + report) / 3));
		System.out.printf("%s님의 평균 점수는 : %5.2f입니다", name, result);
	}

}
