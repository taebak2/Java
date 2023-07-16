package sec03;

import java.util.Calendar;



public class 열거형예제2 {

	public static void main(String[] args) {
		Part quarter = null; // 쿼터에 변수 선언
		Calendar cal = Calendar.getInstance(); // 현재 시간 날짜 등등..
		int q = cal.get(Calendar.MONTH) + 1;
		switch (q) {
		case 1:
		case 2:
		case 3:
			quarter = Part.일사분기;
			break;

		case 4:
		case 5:
		case 6:
			quarter = Part.이사분기;
			break;

		case 7:
		case 8:
		case 9:
			quarter = Part.삼사분기;
			break;

		case 10:
		case 11:
		case 12:
			quarter = Part.사사분기;
			break;
			
		}
		System.out.println(quarter);
		
		if(q<=3) {
			quarter = Part.일사분기;
		}
		
		
	}

}
