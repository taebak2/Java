package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		List<Character> list = new ArrayList<>();

		System.out.println("학점을 6번 입력하세요");
		System.out.println("A B C D E F 중 선택해서 한 칸 띄우고 입력");

		for (int i = 0; i < 6; i++) {
			char grade = s.next().charAt(0);
			list.add(grade);
		}

		double sum = 0.0;
		double average = 0.0;

		for (int i = 0; i < list.size(); i++) {
			switch (list.get(i)) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				break;
			}
		}
		average = sum/6;
		System.out.println("평균 점수는 : " + average + "입니다.");
	}

}
