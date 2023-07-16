package sec04;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class TravelExmaple {

	public static void main(String[] args) {

		Travel tr = new Travel();
		Scanner s = new Scanner(System.in);
		tr.setOil(20);
		tr.setLocation("광주");

		while (tr.oilLeft()) {
			System.out.println("지역명을 입력하세요");
			String local = s.next(); // oil 조건문에 받는법 
			if (local.equals("서울")) {
				tr.oilMinus(10);
				tr.setLocation("서울");
				System.out.println("휘발유가 남았어요. 계속 여행하세요");
				System.out.println("현재 위치는 : " + tr.getLocation());
			}

			else if (local.equals("부산")) {
				tr.oilMinus(5);
				tr.setLocation("부산");
				System.out.println("현재 위치는 : " + tr.getLocation());
			} else {
				tr.oilMinus(2);
				System.out.println("휘발유가 남았어요. 계속 여행하세요");
				System.out.println("현재 위치는 : " + tr.getLocation());
			}
		}

	}
}