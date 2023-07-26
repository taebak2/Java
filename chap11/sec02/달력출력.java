package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class 달력출력 {

	public static void main(String[] args) {
		// 달력 만들기
		
		Scanner s = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = s.nextInt();
		System.out.println("날짜를 입력하세요");
		int month = s.nextInt();
		System.out.println("  ========="+"["+month+"월]=========");
		System.out.println("  일 월 화 수 목 금 토 ");
		
		Calendar start = Calendar.getInstance(); // 시작
		Calendar end = Calendar.getInstance(); // 끝
		
		start.set(year, month -1, 1);
		//시작 month 세팅 = ex) 7월이면 컴퓨터에 저장된 달력값은 0부터 11이니까 -1을 해주고, 그 달의 1일부터 시작
		end.set(year,month, 1);
		// 끝나는 월 세팅, 입력한(7월) 다음달 (8월)의 1일로 세팅하고
		end.add(Calendar.DATE, -1);
		// end달(8월)에서 -1일 즉 7월 마지막 날(31일)
		
		//month = cal.getFirstDayOfWeek();
		int dayweek = start.get(Calendar.DAY_OF_WEEK);  // 2023년 7월 1일(토) -> 7
		// 시작 달의 요일을 숫자로 나타냄 0 = 일요일
		//  요일 번호 추출 일요일 1 토요일 7
		for (int i = 1; i < dayweek; i++) {
			System.out.print("   ");
		}
		// 요일 번호에 해당하는 만큼 공백 추가 (1자리에 3칸)
		
		
		for (int i =1 , j=dayweek; i<= end.get(Calendar.DATE); i++,j++) {
			System.out.printf("%3d", i);
			if(j%7 ==0 ) { // 요일번호가 7.. 토요일이라면 줄 바꿈
				System.out.println();
			}
		}
	}

}
